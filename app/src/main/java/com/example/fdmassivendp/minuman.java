package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class minuman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);


        ImageView keminumandalgona;
        keminumandalgona = findViewById(R.id.minumanmodern2);
        keminumandalgona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(minuman.this, dalgona_coffe.class));
            }
        });


        ImageView keminumanblueocean;
        keminumanblueocean = findViewById(R.id.minumanmodern3);
        keminumanblueocean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(minuman.this, blue_ocean.class));
            }
        });

        ImageView keminumanorangeblueocean;
        keminumanorangeblueocean = findViewById(R.id.minumanmodern1);
        keminumanorangeblueocean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(minuman.this, orangeblue_ocean.class));
            }
        });

        ImageView keminumancendoldwet;
        keminumancendoldwet = findViewById(R.id.minumancendoldawet);
        keminumancendoldwet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(minuman.this, resep_cendol_dawet.class));
            }
        });

        ImageView keminumantradisional;
        keminumantradisional = findViewById(R.id.keminumantradisional);
        keminumantradisional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(minuman.this, rekomendasi_minuman_tradisional.class));
            }
        });

        ImageView keminumanmodern;
        keminumanmodern = findViewById(R.id.keminumanmodern);
        keminumanmodern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(minuman.this, rekomendasi_minuman_modern.class));
            }
        });


        ImageButton imgbtn7;
        imgbtn7 = findViewById(R.id.imageButton7);
        imgbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(minuman.this, home_screen.class));
            }
        });

        ImageButton imgbtn8;
        imgbtn8 = findViewById(R.id.imageButton8);
        imgbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(minuman.this, resepsaya.class));
            }
        });
        ImageButton imgbtn10;
        imgbtn10 = findViewById(R.id.imageButton10);
        imgbtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(minuman.this, home_screen.class));
            }
        });

    }
}