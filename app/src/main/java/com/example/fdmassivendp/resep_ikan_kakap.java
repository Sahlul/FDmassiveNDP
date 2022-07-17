package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class resep_ikan_kakap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_ikan_kakap);

        ImageView gulaikkp;
        gulaikkp = findViewById(R.id.gulaikkp);
        gulaikkp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_ikan_kakap.this, gulai_kepala_ikan_kakap.class));
            }
        });


        ImageView supiknkkpp;
        supiknkkpp = findViewById(R.id.supikankkp);
        supiknkkpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_ikan_kakap.this, sup_ikan_kakap.class));
            }
        });



        ImageView ikankkpasammanis;
        ikankkpasammanis = findViewById(R.id.ikankkpasammanis);
        ikankkpasammanis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_ikan_kakap.this, sup_ikan_kakap.class));
            }
        });




        ImageView timikankkp;
        timikankkp = findViewById(R.id.timikankkp);
        timikankkp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_ikan_kakap.this, resep_tim_ikan_kakap.class));
            }
        });



        ImageView profil;
        profil = findViewById(R.id.profil1);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_ikan_kakap.this, profil.class));
            }
        });

        ImageView add;
        add = findViewById(R.id.add1);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_ikan_kakap.this, resepsaya.class));
            }
        });

        ImageView home1;
        home1 = findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_ikan_kakap.this, home_screen.class));
            }
        });

    }
}