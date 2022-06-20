package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        ImageButton ibtn14;
        ibtn14= findViewById(R.id.imageButton14);
        ibtn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(history.this,home_screen.class));
            }
        });

        ImageButton ibtn15;
        ibtn15= findViewById(R.id.imageButton15);
        ibtn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(history.this,resepsaya.class));
            }
        });

        ImageButton ibtn16;
        ibtn16= findViewById(R.id.imageButton16);
        ibtn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(history.this,profil.class));
            }
        });



    }
}