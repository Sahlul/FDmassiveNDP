package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class resep_tempe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_tempe);





        ImageView nuggettmp;
        nuggettmp= findViewById(R.id.nuggettmp);
        nuggettmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_tempe.this,nugget_tempe.class));
            }
        });


        ImageView tempebacem;
        tempebacem= findViewById(R.id.tempebacem);
        tempebacem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_tempe.this,tempe_bacem.class));
            }
        });

        ImageView burgertempe;
        burgertempe= findViewById(R.id.brgtempe);
        burgertempe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_tempe.this,resep_burger_tempe.class));
            }
        });

        ImageView tmpkacangpnjg;
        tmpkacangpnjg= findViewById(R.id.tumistempe);
        tmpkacangpnjg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_tempe.this,tumis_tempe_kacang_panjang.class));
            }
        });

    }
}