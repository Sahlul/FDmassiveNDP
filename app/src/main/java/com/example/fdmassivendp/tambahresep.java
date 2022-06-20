package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tambahresep extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahresep);

        ImageButton ibtn22;
        ibtn22 = findViewById(R.id.imageButton22);
        ibtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tambahresep.this,home_screen.class));
            }
        });


        ImageButton ibtn21;
        ibtn21 = findViewById(R.id.imageButton21);
        ibtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tambahresep.this,resepsaya.class));
            }
        });

        ImageButton ibtn19;
        ibtn19 = findViewById(R.id.imageButton19);
        ibtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tambahresep.this,profil.class));
            }
        });



    }
}