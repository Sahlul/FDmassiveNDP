package com.example.fdmassivendp;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;


public class profil_pengguna extends AppCompatActivity {

    FirebaseAuth fauth;
    FirebaseFirestore fstore;
    FirebaseUser user;
    String userId;

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    TextView name,email,notelp;
    StorageReference storageReference;
    DatabaseReference databaseUsers;
    ImageView imageview4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_pengguna);



        imageview4 = findViewById(R.id.imageView4);

        fauth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        storageReference = FirebaseStorage.getInstance().getReference();

        userId = fauth.getCurrentUser().getUid();
        user = fauth.getCurrentUser();

        databaseUsers = FirebaseDatabase.getInstance().getReference();
        name = findViewById(R.id.usernameprofil);
        email = findViewById(R.id.emailprofil);
        notelp = findViewById(R.id.notelpprofil);

        SharedPreferences sharedPref = getSharedPreferences("_USER",Context.MODE_PRIVATE);
        String _name = sharedPref.getString("name", "");
        String _email = sharedPref.getString("email", "");
        String _notelp = sharedPref.getString("notelp", "");

        name.setText(_name);
        email.setText(_email);
        notelp.setText(_notelp);

        /*FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();//mendapatkan data dari  dari email yg login
        Log.e("users", String.valueOf(user));
        DocumentReference docRef = db.collection("users").document(user.getEmail());
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        name.setText(document.getData().get("nama").toString());
                        Log.d("berhasil", "DocumentSnapshot data: " + document.getData());
                    } else {
                        Log.d("tidak ada data", "No such document");
                    }
                } else {
                    Log.d("gagal", "get failed with ", task.getException());
                }
            }
        });
*/



        ImageView setting;
        setting= findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil_pengguna.this,profil_edit.class));
            }
        });


        Button btnlogout;
        btnlogout= findViewById(R.id.logout);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil_pengguna.this,MainActivity.class));
            }
        });


        StorageReference profileref = storageReference.child("user/"+fauth.getCurrentUser().getUid()+"/profile.jpg");
        profileref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(imageview4);
            }
        });


    }



}