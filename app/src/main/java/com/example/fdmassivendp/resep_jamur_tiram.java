package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class resep_jamur_tiram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_jamur_tiram);

        ImageView jamurcrispy;
        jamurcrispy = findViewById(R.id.jamurcrispy);
        jamurcrispy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_jamur_tiram.this, jamur_crispy.class));
            }
        });


        ImageView jamurtiramkauhsantan;
        jamurtiramkauhsantan = findViewById(R.id.jamurkuahsantan);
        jamurtiramkauhsantan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_jamur_tiram.this, jamur_tiram_kuah_santan.class));
            }
        });


        ImageView tongsengjamur;
        tongsengjamur = findViewById(R.id.tongsengjamurtiram);
        tongsengjamur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_jamur_tiram.this, tongseng_jamur_tiram.class));
            }
        });

        ImageView nuggetjamur;
        nuggetjamur = findViewById(R.id.nuggetjamur);
        nuggetjamur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_jamur_tiram.this, nugget_jamur.class));
            }
        });

    }
}