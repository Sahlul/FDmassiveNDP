package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class nugget_jamur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nugget_jamur);
        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepnuggetjamur);

        String[] nugget_jamur = {"Bahan:\n" +
                "1. 150 gram tepung tapioka\n" +
                "2. 500 gram jamur tiram\n" +
                "3. 1 sdm gula pasir\n" +
                "4. 1 sdm merica bubuk\n" +
                "5. 100 cc susu UHT\n" +
                "6. 2 sdm bawang goreng\n" +
                "7. 2 siung bawang putih haluskan\n" +
                "8. 3 butir telur\n" +
                "9. 3 sdt garam",

                "Cara memasak :\n" +
                        "1. Bersihkan jamur tiram lalu peras sampai airnya kering\n" +
                        "2. Blender jamur tiram, air, susu dan telur.\n" +
                        "3. Campur semua bahan kecuali tepung roti.\n" +
                        "4. Siapkan loyang yang sudah dilapisi plastik.\n" +
                        "5. Masukkan adonan. Ratakan.\n" +
                        "6. Panaskan dandang masukkan loyang yang sudah diisi adonan. Kukus selama 20 menit.\n" +
                        "7. Jika sudah dingin keluarkan dari loyang. Cetak menggunakan cetakan sesuai selera\n" +
                        "8. Lumuri nugget yang sudah dibentuk dengan telur yang sudah dikocok.\n" +
                        "9. Baluri dengan tepung roti. Simpan di lemari es selama kurang lebih 1 jam.\n" +
                        "10. Goreng sampai kuning kecoklatan. Angkat dan sajikan.",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, nugget_jamur);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:R4sQOmY6FhU"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=R4sQOmY6FhU"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}