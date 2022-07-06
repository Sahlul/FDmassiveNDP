package com.example.fdmassivendp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class halaman_login extends AppCompatActivity {


    EditText inputemail,inputpassword;
    String email,password;
    Button login;
    private FirebaseAuth mAuth;


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