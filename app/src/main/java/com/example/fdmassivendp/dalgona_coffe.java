package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class dalgona_coffe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalgona_coffe);
        listviewdalgona();
    }
    private void listviewdalgona() {
        ListView list = (ListView) findViewById(R.id.listresepdalgonacoffe);

        String [] dalgona_coffe = {"Bahan :\n" +
                "1. 2 sendok makan NESCAFÉ Classic\n" +
                "2. 2 sendok makan gula putih\n" +
                "3. 125 ml susu cair\n" +
                "4. 1 gelas es batu\n",


                ""+

                        "Cara membuat :\n" +
                        "1. Masukkan NESCAFÉ Classic dan gula ke dalam mangkuk kecil, lalu\n" +
                        "2. Aduk hingga mengembang dan menjadi whipped coffee.\n" +
                        "3. Tuangkan susu cair ke dalam gelas dan masukkan es batu sesuai selera\n" +
                        "4. Tuangkan whipped coffee yang telah kamu buat sebelumnya.\n" +
                        "5. Dalgona Coffee kamu siap untuk dinikmati bareng orang tersayang!\n" +
                        "\n",




        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_activated_1,dalgona_coffe);
        list.setAdapter(myAdapter);

    }
    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:hLGumMcyfKU"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=hLGumMcyfKU"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }


}