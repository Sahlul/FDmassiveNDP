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

public class halaman_register extends AppCompatActivity {

    EditText inputregusername,inputregemail,inputregnohandphone,inputregpassword1,inputregpassword2;
    Button daftar;
    FirebaseAuth mAuth;
    String regusername,regemail,regnohandphone,regpassword1,regpassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_register);
        mAuth = FirebaseAuth.getInstance();
        inputregusername = findViewById(R.id.regusername);
        inputregemail = findViewById(R.id.regemail);
        inputregnohandphone = findViewById(R.id.regnohandphone);
        inputregpassword1 = findViewById(R.id.regpassword);
        inputregpassword2 = findViewById(R.id.regpassword2);
        daftar = findViewById(R.id.btndaftar);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrasi();
            }
        });

    }

    private void registrasi() {
        regusername = inputregusername.getText().toString();
        regemail = inputregemail.getText().toString();
        regnohandphone = inputregnohandphone.getText().toString();
        regpassword1 = inputregpassword1.getText().toString();
        regpassword2 = inputregpassword2.getText().toString();

        mAuth.createUserWithEmailAndPassword(regemail,regpassword1)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            startActivity(new Intent(halaman_register.this,home_screen.class));
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(halaman_register.this,"Login gagal",Toast.LENGTH_LONG).show();
                        }
                    }
                });
    }


}