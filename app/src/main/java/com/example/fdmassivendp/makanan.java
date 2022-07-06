package com.example.fdmassivendp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class makanan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        ImageView mkntra;
        mkntra = findViewById(R.id.kerekmakaantra);
        mkntra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan.this, rekomendasi_makanan_tradisional.class));
            }
        });
        ImageView mknmodern;
        mknmodern = findViewById(R.id.kerekmakaanmodern);
        mknmodern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan.this, rekomendasi_makanan_modern.class));
            }
        });

        ImageButton imgbtn4;
        imgbtn4 = findViewById(R.id.imageButton4);
        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan.this, home_screen.class));
            }
        });

        ImageButton imgbtn5;
        imgbtn5 = findViewById(R.id.imageButton5);
        imgbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan.this, resepsaya.class));
            }
        });

        ImageButton imgbtn6;
        imgbtn6 = findViewById(R.id.imageButton6);
        imgbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan.this, profil.class));
            }
        });


    }
}