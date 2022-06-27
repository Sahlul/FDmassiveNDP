package com.example.fdmassivendp;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class profil_pengguna extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_pengguna);


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




    }


}