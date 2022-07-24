package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class bajigur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajigur);
        listviewbajigur();
    }

    private void listviewbajigur() {
        ListView list = (ListView) findViewById(R.id.listresepbajigur);

        String[] bajigur = {"Bahan :\n" +
                "1. 1 liter santan\n" +
                "2. 100 gr Jahe bakar\n" +
                "3. 200 gr gula merah\n" +
                "4. 1 sdm Kopi bubuk hitam\n" +
                "5. 1/4 sdt Garam\n" +
                "6. 2 lembar Daun pandan\n" +
                "7. 1 batang Kayu manis\n" +
                "\n",

                ""+

                        "Cara membuat :\n" +
                        "1. Siapkan panci lalu masukkan jahe bakar yang sudah di geprek, 200 gr gula merah yang sudah dihaluskan, 1 batang kayu manis, 2 lembar daun pandan, 1 liter santan dan 1 sdm kopi bubuk hitam.\n" +
                        "2. Kemudian, masak dengan api sedang sambil di aduk-aduk agar santan tidak pecah.\n" +
                        "3. Tunggu sampai air santan mendidih, lalu tambahkan 1/4 sdt garam.\n" +
                        "4. Setelah itu, matikan kompor, saring air bajigur menggunakan saringan.\n" +
                        "5. Selanjutnya, tuangkan bajigur ke dalam gelas atau wadah yang sudah disiapkan.\n" +
                        "6. Bajigur siap untuk di hidangkan.\n" +
                        "\n",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, bajigur);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:oPq1NiPJO60"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=oPq1NiPJO60"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}