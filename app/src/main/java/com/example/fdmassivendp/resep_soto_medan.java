package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class resep_soto_medan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_soto_medan);


        listview();

    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseptmpbacem);

        String[] resep_soto_medan = {"Bahan :\n" +
                "1. Ayam, potong jadi 4 bagian - 1 ekor\n" +
                "2. Santan kental, dari 1 butir kelapa - 1/2 liter\n" +
                "3. Santan encer - 1,2 liter\n" +
                "4. Lengkuas - 2 cm\n" +
                "5. Serai, memarkan - 1 batang\n" +
                "6. Bunga lawang - 1 buah\n" +
                "7. Kapulaga - 2 butir\n" +
                "8. Daun salam - 2 lembar\n" +
                "9. Daun jeruk - 2 lembar\n" +
                "10. Gula pasir - 1 sdt\n" +
                "11. Garam - 2 sdt\n" +
                "12. Minyak goreng - secukupnya.",

                "Bumbu Halus :\n" +
                        "1. Bawang merah - 12 butir\n" +
                        "2. Bawang putih - 5 siung\n" +
                        "3. Kunyit, bakar - 2 ruas\n" +
                        "4. Jahe - 2 cm\n" +
                        "5. Ketumbar, sangrai - 1 sdm\n" +
                        "6. Kemiri, sangrai - 5 butir\n" +
                        "7. Merica - 1 sdt\n" +
                        "8. Jinten - 1/2 sdt\n" +
                        "9. Serai, iris-iris bagian putihnya saja - 1 batang",

                "Bahan Pelengkap :\n" +
                        "1. Telur rebus, belah 2 - 4 butir\n" +
                        "2. Perkedel kentang - 8 buah\n" +
                        "3. Tauge, seduh air panas lalu tiriskan - 200 gram\n" +
                        "4. Tomat, potong-potong - 1 buah\n" +
                        "5. Seledri, iris - secukupnya\n" +
                        "6. Daun bawang, iris - secukupnya\n" +
                        "7. Bawang merah goreng - secukupnya\n" +
                        "8. Sambal rawit ijo - secukupnya\n" +
                        "9. Kerupuk emping - secukupnya",
                " " +
                        "Cara memasak :\n" +
                        "1. Lumuri ayam dengan perasan air jeruk nipis dan garam. Diamkan selama beberapa menit lalu bilas hingga bersih kembali.\n" +
                        "2. Tumis bumbu halus bersama lengkuas, serai, bunga lawang, kapulaga, daun salam, dan daun jeruk hingga harum. Aduk-aduk hingga bumbu matang.\n" +
                        "3. Masukkan ayam lalu aduk hingga berubah warna.\n" +
                        "4. uang santan encer bersama gula dan garam. Aduk lalu masak hingga ayam jadi empuk. Angkat ayam kemudia tiriskan dan sisihkan.\n" +
                        "5. uang santan kental. Aduk-aduk hingga mendidih. Koreksi rasanya. Matikan api.\n" +
                        "6. Dalam wajan, panaskan minyak. Goreng ayam hingga kecoklatan lalu angkat dan tiriskan. Suwir-suwir ayam lalu sisihkan.",
                "" +

                        "Penyelesain :\n" +
                        "1. Dalam mangkok, tata ayam suwir, tauge, tomat, seledri, dan daun bawang.\n" +
                        "2. Siram dengan kuah soto\n" +
                        "3. Beri 1/2 butir telur rebus dan perkedel\n" +
                        "4. Siap disajikan dengan kerupuk emping, sambal rawit ijo, dan nasi putih",

                "" +

                        "Tips :\n" +
                        "1. Setelah santan kental masuk, kuah soto harus sesekali diaduk agar santan tidak pecah.\n" +
                        "2. Kekentalan kuah soto bisa disesuaikan selera",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, resep_soto_medan);
        list.setAdapter(myAdapter);


    }


    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:suJOlFDE4ZI"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=suJOlFDE4ZI"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }


}
