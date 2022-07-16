package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class rekomendasi_minuman_modern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rekomendasi_minuman_modern);

        ImageView dalgonacoffe;
        dalgonacoffe = findViewById(R.id.minumandalgona);
        dalgonacoffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_modern.this, dalgona_coffe.class));
            }
        });

        ImageView blueocean;
        blueocean = findViewById(R.id.minumanblueocean);
        blueocean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_modern.this, blue_ocean.class));
            }
        });

        ImageView taromilksahe;
        taromilksahe = findViewById(R.id.minumantaromilk);
        taromilksahe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_modern.this, taro_bubble_milkshake.class));
            }
        });

        ImageView caramelmachi;
        caramelmachi = findViewById(R.id.minumancaramel);
        caramelmachi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_modern.this, caramel_machiato.class));
            }
        });













        ImageView profil;
        profil = findViewById(R.id.profil1);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_modern.this, profil.class));
            }
        });

        ImageView add1;
        add1 = findViewById(R.id.add1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_modern.this, resepsaya.class));
            }
        });

        ImageView home1;
        home1 = findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_modern.this, home_screen.class));
            }
        });


    }
}