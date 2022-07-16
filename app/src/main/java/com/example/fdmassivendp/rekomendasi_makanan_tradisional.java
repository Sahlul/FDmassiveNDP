package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class rekomendasi_makanan_tradisional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomendasi_makanan_tradisional);

        ImageView profil;
        profil = findViewById(R.id.profil1);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_tradisional.this, profil.class));
            }
        });

        ImageView add1;
        add1 = findViewById(R.id.add1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_tradisional.this, resepsaya.class));
            }
        });

        ImageView home1;
        home1 = findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_tradisional.this, home_screen.class));
            }
        });





        ImageView makananlontongmedan;
        makananlontongmedan= findViewById(R.id.makananlontongmedan);
        makananlontongmedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_tradisional.this,resep_lontong_medan.class));
            }
        });


        ImageView sotomedan;
        sotomedan= findViewById(R.id.makanansotomedan);
        sotomedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_tradisional.this,resep_soto_medan.class));
            }
        });

        ImageView mknrujak;
        mknrujak= findViewById(R.id.makananrujak);
        mknrujak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_tradisional.this,resep_rujak_cingur.class));
            }
        });

        ImageView ppsiknkmbg;
        ppsiknkmbg= findViewById(R.id.makanansapothu);
        ppsiknkmbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_tradisional.this,pepesikankembung.class));
            }
        });

    }
}