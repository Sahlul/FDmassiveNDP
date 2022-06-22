package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class home_screen extends AppCompatActivity {

    ViewFlipper makanan;
    ViewFlipper minuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);



        ImageButton rspmakanandanminuman;
        rspmakanandanminuman = findViewById(R.id.rspmakdanmin);
        rspmakanandanminuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this,makanan_dan_minuman.class));
            }
        });


        ImageButton bhanpilihan;
        bhanpilihan = findViewById(R.id.bhanpilihan);
        bhanpilihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this,bahan_pilihan.class));
            }
        });


        ImageButton resepbru;
        resepbru = findViewById(R.id.kereseptrbru);
        resepbru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this,resep_terbaru.class));
            }
        });

        ImageView profil;
        profil = findViewById(R.id.profil1);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this,profil.class));
            }
        });

        ImageView add;
        add = findViewById(R.id.add1);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this,resepsaya.class));
            }
        });

        ImageView userprofil;
        userprofil = findViewById(R.id.jasonprofil);
        userprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this,profil_pengguna.class));
            }
        });


        int imagesmakanan[] = {R.drawable.gado2,R.drawable.sambal,R.drawable.burger};
        makanan = findViewById(R.id.v_flipper);

        int imagesminuman[] = {R.drawable.minuman2,R.drawable.dalgonacoffe,R.drawable.minuman};
        minuman = findViewById(R.id.v_flipper1);

        for (int image: imagesmakanan){
            flipperimage(image);
        }
        for (int image1: imagesminuman){
            flipperimage1(image1);
        }


    }

    private void flipperimage(int image) {

        ImageView imageView = new ImageView (this);
        imageView.setBackgroundResource(image);

        makanan.addView(imageView);
        makanan.setFlipInterval(5000);
        makanan.setAutoStart(true);

        makanan.setInAnimation(this, android.R.anim.slide_in_left);
        makanan.setOutAnimation(this, android.R.anim.slide_out_right);

    }

    public void flipperimage1 (int image1){
        ImageView imageView1 = new ImageView (this);
        imageView1.setBackgroundResource(image1);

        minuman.addView(imageView1);
        minuman.setFlipInterval(4000);
        minuman.setAutoStart(true);

        minuman.setInAnimation(this, android.R.anim.slide_in_left);
        minuman.setOutAnimation(this, android.R.anim.slide_out_right);

    }

}