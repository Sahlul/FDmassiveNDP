package com.example.fdmassivendp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

public class halaman_login extends AppCompatActivity {


    EditText inputemail,inputpassword;
    String email,password;
    Button login;
    private FirebaseAuth mAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login);
        mAuth = FirebaseAuth.getInstance();

        inputemail = findViewById(R.id.emaillog);
        inputpassword = findViewById(R.id.edpasswordedit);

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ceklogin();
            }
        });





        Button rgister;
        rgister = findViewById(R.id.registrasi);
        rgister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(halaman_login.this,halaman_register.class));
            }
        });




    }

    private void ceklogin() {
        email = inputemail.getText().toString();
        password = inputpassword.getText().toString();

        mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser currentUser = mAuth.getCurrentUser();
                            Log.e("currentuser",currentUser.getEmail());

                            DocumentReference docRef = db.collection("users").document(currentUser.getEmail());
                            docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                                @Override
                                public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                                    if (task.isSuccessful()) {
                                        DocumentSnapshot document = task.getResult();
                                        if (document.exists()) {

                                            Log.e("_NAME", document.getData().get("name").toString());

                                            SharedPreferences sharedPref = getSharedPreferences("_USER",Context.MODE_PRIVATE);
                                            SharedPreferences.Editor editor = sharedPref.edit();
                                            editor.putString ("name", document.getData().get("name").toString());
                                            editor.putString ("email", document.getData().get("email").toString());
                                            editor.putString ("notelp", document.getData().get("notelp").toString());
                                            editor.apply();

                                        } else {

                                            User user = new User("", email, "");
                                            db.collection("users").document(currentUser.getEmail())
                                                    .set(user)
                                                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                                                        @Override
                                                        public void onSuccess(Void aVoid) {
                                                            Log.d("berhasil", "DocumentSnapshot successfully written!");
                                                        }
                                                    })
                                                    .addOnFailureListener(new OnFailureListener() {
                                                        @Override
                                                        public void onFailure(@NonNull Exception e) {
                                                            Log.w("gagal", "Error writing document", e);
                                                        }
                                                    });

                                        }
                                    } else {
                                        Log.d("gagal", "get failed with ", task.getException());

                                        User user = new User("", email, "");
                                        db.collection("users").document(currentUser.getEmail())
                                                .set(user)
                                                .addOnSuccessListener(new OnSuccessListener<Void>() {
                                                    @Override
                                                    public void onSuccess(Void aVoid) {
                                                        Log.d("berhasil", "DocumentSnapshot successfully written!");
                                                    }
                                                })
                                                .addOnFailureListener(new OnFailureListener() {
                                                    @Override
                                                    public void onFailure(@NonNull Exception e) {
                                                        Log.w("gagal", "Error writing document", e);
                                                    }
                                                });
                                    }
                                }
                            });


                            // Sign in success, update UI with the signed-in user's information

                            startActivity(new Intent(halaman_login.this,home_screen.class));
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(halaman_login.this,"Login gagal",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }




}