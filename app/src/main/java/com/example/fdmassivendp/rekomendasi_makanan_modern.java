package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class rekomendasi_makanan_modern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomendasi_makanan_modern);


        ImageView nilaasam;
        nilaasam = findViewById(R.id.makanannilaasam);
        nilaasam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_modern.this, nila_asam_manis.class));
            }
        });

        ImageView spagheticarbonara;
        spagheticarbonara = findViewById(R.id.makananspagheticarn);
        spagheticarbonara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_modern.this, spaghetticarbonara.class));
            }
        });

        ImageView setupmac;
        setupmac = findViewById(R.id.makananstpmacaroni);
        setupmac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_modern.this, setup_macaroni.class));
            }
        });

        ImageView sapotahu;
        sapotahu = findViewById(R.id.makanansapothu);
        sapotahu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_modern.this, sapo_tahu.class));
            }
        });












        ImageView profil;
        profil = findViewById(R.id.profil1);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_modern.this, profil.class));
            }
        });

        ImageView add1;
        add1 = findViewById(R.id.add1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_modern.this, resepsaya.class));
            }
        });

        ImageView home1;
        home1 = findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_modern.this, home_screen.class));
            }
        });

    }
}