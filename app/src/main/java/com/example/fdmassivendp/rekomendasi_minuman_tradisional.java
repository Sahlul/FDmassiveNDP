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

        ImageView minumanbandrekjahe;
        minumanbandrekjahe= findViewById(R.id.minumanbandrekjahe);
        minumanbandrekjahe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(rekomendasi_minuman_tradisional.this,resep_minuman_bandrek.class));
            }
        });
    }
}