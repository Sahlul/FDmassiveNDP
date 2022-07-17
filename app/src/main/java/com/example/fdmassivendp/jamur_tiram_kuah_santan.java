package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jamur_tiram_kuah_santan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamur_tiram_kuah_santan);
        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepjamurtiramkhsantan);

        String[] jamur_tiram_kuah_santan= {"Bahan:\n" +
                "1. 250 gram jamur tiram, suwir-suwir\n" +
                "2. 1 sdt garam\n" +
                "3. 1/4 sdt lada bubuk\n" +
                "4. 100 ml santan kelapa\n" +
                "5. 2 sdm minyak, untuk menumis bumbu\n" +
                "6. 3 siung bawang putih, iris halus\n" +
                "7. 6 siung bawang merah, iris halus\n" +
                "8. 7 buah cabai rawit, iris serong\n" +
                "9. Sejumput gula\n" +
                "10. Sejumput kaldu penyedap jamur\n",

                "Cara memasak :\n" +
                        "1. Cuci bersih jamur tiram kemudian peras airnya. Ini bertujuan agar aroma jamur tidak terlalu menyengat.\n" +
                        "2. Siapkan bumbu kemudian panaskan minyak. Tumis bumbu seperti bawang putih, bawang merah dan cabai hingga harum.\n" +
                        "3. Masukkan jamur tiram ke dalam tumisan bumbu, tambahkan garam, gula, penyedap dan lada bubuk. Aduk rata.\n" +
                        "4. Masukkan santan kelapa dan aduk rata. Masak semua bahan hingga mendidih, koreksi rasa. Sajikan.",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, jamur_tiram_kuah_santan);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:9b7oT01y8rw"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=9b7oT01y8rw"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}