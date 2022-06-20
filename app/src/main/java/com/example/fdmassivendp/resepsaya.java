package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class resepsaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resepsaya);

        Button tulisresep;
        tulisresep = findViewById(R.id.tulisresep);
        tulisresep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resepsaya.this,tambahresep.class));
            }
        });


        ImageButton ibtn17;
        ibtn17 = findViewById(R.id.imageButton17);
        ibtn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resepsaya.this,home_screen.class));
            }
        });

        ImageButton ibtn18;
        ibtn18 = findViewById(R.id.imageButton18);
        ibtn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resepsaya.this,resepsaya.class));
            }
        });

        ImageButton ibtn20;
        ibtn20 = findViewById(R.id.imageButton20);
        ibtn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resepsaya.this,profil.class));
            }
        });

        ImageView userprofil;
        userprofil = findViewById(R.id.jasonprofil);
        userprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resepsaya.this,profil_pengguna.class));
            }
        });
    }
}