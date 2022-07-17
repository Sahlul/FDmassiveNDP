package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class rekomendasi_minuman_tradisional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomendasi_minuman_tradisional);

        ImageView profil;
        profil = findViewById(R.id.profil1);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_tradisional.this, profil.class));
            }
        });

        ImageView add1;
        add1 = findViewById(R.id.add1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_tradisional.this, resepsaya.class));
            }
        });

        ImageView home1;
        home1 = findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_tradisional.this, home_screen.class));
            }
        });


        ImageView minumanbandrekjahe;
        minumanbandrekjahe= findViewById(R.id.minumanbandrekjahe);
        minumanbandrekjahe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_tradisional.this,resep_minuman_bandrek.class));
            }
        });

        ImageView minumancendoldawet;
        minumancendoldawet= findViewById(R.id.minumancendoldawet);
        minumancendoldawet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_tradisional.this,resep_cendol_dawet.class));
            }
        });
    }
}