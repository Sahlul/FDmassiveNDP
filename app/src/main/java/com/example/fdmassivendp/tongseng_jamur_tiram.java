package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tongseng_jamur_tiram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tongseng_jamur_tiram);
        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseptongsengjamurtiram);

        String[] tongseng_jamur_tiram = {"Bahan:\n" +
                "1. 300 gr jamur tiram, disuwir-suwir dan dicuci bersih\n" +
                "2. 1 buah tomat merah, potong-potong\n" +
                "3. 15 buah cabai rawit, potong-potong\n" +
                "4. 2 buah cabai merah besar, potong-potong serong tipis\n" +
                "5. 2 cm jahe, dimemarkan\n" +
                "6. 2 cm lengkuas\n" +
                "7. Air secukupnya\n" +
                "8. Garam secukupnya\n" +
                "9. Gula pasir secukupnya\n" +
                "10. Minyak untuk menumis secukupnya\n" +
                "\n",

                "Bumbu yang dihaluskan:\n" +
                        "1. 1 cm kunyit\n" +
                        "2. 2 butir kemiri sangrai\n" +
                        "3. 2 lembar daun jeruk purut, dibuang tulangnya\n" +
                        "4. 2 siung bawang putih\n" +
                        "5. 3 butir bawang merah",

                "Cara memasak :\n" +
                        "1. Cuci bersih jamur tiram kemudian peras airnya. Ini bertujuan agar aroma jamur tidak terlalu menyengat.\n" +
                        "2. Siapkan bumbu kemudian panaskan minyak. Tumis bumbu seperti bawang putih, bawang merah dan cabai hingga harum.\n" +
                        "3. Masukkan jamur tiram ke dalam tumisan bumbu, tambahkan garam, gula, penyedap dan lada bubuk. Aduk rata.\n" +
                        "4. Masukkan santan kelapa dan aduk rata. Masak semua bahan hingga mendidih, koreksi rasa. Sajikan.",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, tongseng_jamur_tiram);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:axeTpjFqlg"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=axeTpjFqlg"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}