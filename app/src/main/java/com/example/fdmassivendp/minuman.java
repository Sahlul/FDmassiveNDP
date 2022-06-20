package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class minuman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);












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