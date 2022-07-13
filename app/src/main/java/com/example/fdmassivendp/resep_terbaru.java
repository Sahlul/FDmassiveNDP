package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class resep_terbaru extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_terbaru);



        ImageView profil;
        profil = findViewById(R.id.profil1);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, profil.class));
            }
        });

        ImageView add1;
        add1 = findViewById(R.id.add1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, resepsaya.class));
            }
        });

        ImageView home1;
        home1 = findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, home_screen.class));
            }
        });






        ImageView lntgmedan;
        lntgmedan = findViewById(R.id.lontongmedan);
        lntgmedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, resep_lontong_medan.class));
            }
        });

        ImageView brgtmp;
        brgtmp = findViewById(R.id.brgtempe);
        brgtmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, resep_burger_tempe.class));
            }
        });
    }
}