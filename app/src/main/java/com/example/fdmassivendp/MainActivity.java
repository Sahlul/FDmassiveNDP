package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next;
        next = findViewById(R.id.selanjutnya);
        next.setOnClickListener(new View.OnClickListener() {
                @Override
                       public void onClick(View v){
                    startActivity(new Intent(MainActivity.this, halaman_login.class));
                }

        });

    }
}