package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    }
}