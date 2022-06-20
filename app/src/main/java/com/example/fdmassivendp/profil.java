package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ImageButton ibtn11;
        ibtn11= findViewById(R.id.imageButton11);
        ibtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,home_screen.class));
            }
        });

        ImageButton ibtn12;
        ibtn12= findViewById(R.id.imageButton12);
        ibtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,resepsaya.class));
            }
        });

        ImageButton ibtn13;
        ibtn13= findViewById(R.id.imageButton13);
        ibtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,profil.class));
            }
        });


        ImageView ibtn23;
        ibtn23= findViewById(R.id.imageView23);
        ibtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,resep_lontong_medan.class));
            }
        });

        ImageView ibtn22;
        ibtn22= findViewById(R.id.imageView22);
        ibtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,history.class));
            }
        });

        ImageView ibtn6;
        ibtn6= findViewById(R.id.jasonprofil);
        ibtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,profil_pengguna.class));
            }
        });

    }
}