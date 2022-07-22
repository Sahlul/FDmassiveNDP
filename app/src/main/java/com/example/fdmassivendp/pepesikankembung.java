package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class pepesikankembung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pepesikankembung);
        listview();

    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseppepesikan);

        String[] pepesikankembung = {"Bahan :\n" +
                "1. 4 ekor ikan kembung\n" +
                "2. Kemangi secukupnya\n" +
                "3. Daun pisang\n" +
                "4. Tusuk gigi\n",

                "Bumbu Halus :\n" +
                        "1. 5 siung bawang merah\n" +
                        "2. 4 siung bawang putih\n" +
                        "3. 2 butir kemiri\n" +
                        "4. 1 ruas jari kunyit\n" +
                        "5. 1 ruas jari jahe\n" +
                        "6. 1 ruas jari laos\n" +
                        "7. 10 biji cabai merah\n" +
                        "8. 2 biji cabai pedas\n" +
                        "9. 1 sdt garam\n" +
                        "10. 1/2 sdt penyedap\n" +
                        "11. 5 sdm minyak goreng",

                "Bahan Pelengkap :\n" +
                        "1. Daun Jeruk\n" +
                        "2. Daun salam\n" +
                        "3. Serai\n" +
                        "4. Tomat\n",

                "Cara memasak  :\n" +
                        "1. Cuci bersih kembung marinasi dengan garam, bawang putih, kunyit. Sisihkan.\n" +
                        "2. Haluskan bumbu halus. Tumis bumbu halus sampai harum, masukkan bumbu pelengkap.\n" +
                        "3. Bungkus ikan kembung atasnya, beri bumbu dan kemangi.\n" +
                        "4. Kukus selama kurang lebih 20 menit, angkat tiriskan dan tunggu dingin.\n" +
                        "5. Bakar dengan teflon sampai daun layu kecokelatan. \n" +
                        "6. Siap disajikan.\n",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, pepesikankembung);
        list.setAdapter(myAdapter);


    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:2HeYHeyIBRE"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=2HeYHeyIBRE"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}