package com.example.fdmassivendp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class makanan_dan_minuman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan_dan_minuman);

        ImageButton resepminuman;
        resepminuman = findViewById(R.id.resepminuman);
        resepminuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan_dan_minuman.this, minuman.class));
            }
        });


        ImageButton resepmakanan;
        resepmakanan = findViewById(R.id.resepmakanan);
        resepmakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan_dan_minuman.this, makanan.class));
            }
        });

    }
}