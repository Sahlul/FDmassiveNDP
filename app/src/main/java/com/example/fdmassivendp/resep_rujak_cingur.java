package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class resep_rujak_cingur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_rujak_cingur);
        listview();

    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseprujak);

        String[] resep_rujak_cingur = {"Bahan :\n" +
                "1. Cingur - 250 gram\n" +
                "2. Tauge - 50 gram\n" +
                "3. Kangkung - 2 ikat\n" +
                "4. Mentimun - 1 buah\n" +
                "5. Bengkuang - 1 buah\n" +
                "6. Tempe - 1/2 papan\n" +
                "7. Tahu - 2 buah\n" +
                "\n",

                "Bumbu rujak  :\n" +
                        "1. Cabai rawit (optional) - 8 buah\n" +
                        "2. Kacang tanah goreng - 3 sdm\n" +
                        "3. Petis udang - 2 sdm\n" +
                        "4. Bawang putih goreng - 2 siung\n" +
                        "5. Air asam jawa - 4 sdm\n" +
                        "6. Gula merah, iris - 2 sdm\n" +
                        "7. Garam - 1/4 sdt\n" +
                        "8. Pisang klutuk / batu, parut kasar - 2 buah\n" +
                        "9. Air matang - secukupnya\n" +
                        "\n",

                "Bahan pelengkap  :\n" +
                        "1. Lontong - secukupnya\n" +
                        "2. Kerupuk - secukupnya\n" +
                        "3. Bawang putih goreng - secukupnya\n" +
                        "\n",
                " " +
                        "Langkah Membuat :\n" +
                        "1. Rebus cingur sampai empuk, tiriskan, kemudian potong-potong.\n" +
                        "2. Petik-petik daun kangkung lalu rebus sampai matang.\n" +
                        "3. Rendam tauge dengan air panas, tiriskan.\n" +
                        "4. Potong tipis mentimun dan bengkuang, sisihkan.\n" +
                        "5. Goreng tempe dan tahu sampai matang, kemudian potong-potong\n",

                " " +
                        "Langkah Membuat bumbu rujak :\n" +
                        "1. Haluskan cabai rawit, kacang tanah, bawang putih, gula merah, garam, dan pisang klutuk.\n" +
                        "2. Tambahkan petis udang, air asam jawa dan air secukupnya, aduk rata.\n" +
                        "3. Tata sayuran, cingur, tahu dan tempe goreng di piring.\n" +
                        "4. Siram dengan bumbu rujak.\n" +
                        "5. Sajikan dengan lontong, kerupuk serta bawang putih goreng\n",

                " " +
                        "Tips :\n" +
                        "1.Jumlah cabai bisa ditambahkan atau dikurangi sesuai selera.\n" +
                        "\n",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, resep_rujak_cingur);
        list.setAdapter(myAdapter);
    }
    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:51LpTqYNBZA"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=51LpTqYNBZA"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}