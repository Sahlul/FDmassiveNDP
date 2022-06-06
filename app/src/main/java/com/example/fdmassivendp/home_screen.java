package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home_screen extends AppCompatActivity {

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

    }
}