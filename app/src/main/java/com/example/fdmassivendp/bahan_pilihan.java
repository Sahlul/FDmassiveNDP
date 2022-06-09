package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bahan_pilihan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahan_pilihan);

        ImageButton ikankakap;
        ikankakap = findViewById(R.id.resepikankakap);
        ikankakap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bahan_pilihan.this,resep_ikan_kakap.class));
            }
        });

        ImageButton tempe;
        tempe = findViewById(R.id.reseptempe);
        tempe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bahan_pilihan.this,resep_tempe.class));
            }
        });

        ImageButton jamurtiram;
        jamurtiram = findViewById(R.id.resepjamurtiram);
        jamurtiram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(bahan_pilihan.this,resep_jamur_tiram.class));
            }
        });



    }
}