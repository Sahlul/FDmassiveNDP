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




        ImageView makananlontongmedan;
        makananlontongmedan= findViewById(R.id.makananlontongmedan);
        makananlontongmedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_makanan_tradisional.this,resep_lontong_medan.class));
            }
        });

    }
}