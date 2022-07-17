package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class gulai_kepala_ikan_kakap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gulai_kepala_ikan_kakap);
        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepgulaiikankkp);

        String[] gulai_kepala_ikan_kakap= {"Bahan:\n" +
                " 1. Kepala ikan kakap, potong belah jadi 2 bagian  - 1 kg\n" +
                " 2. Daun salam - 5 lembar\n" +
                " 3. Daun kunyit - 1 lembar\n" +
                " 4. Daun jeruk purut, sobek-sobek - 5 lembar\n" +
                " 5. Serai, memarkan - 2 batang\n" +
                " 6. Cabe rawit utuh - 10 buah\n" +
                " 7. Santan - 1 liter\n" +
                " 8. Gula pasir - 1 sdm\n" +
                " 9. Garam - 2 sdt\n",

                "Bumbu halus :\n" +
                        "1. Bawang putih - 5 siung\n" +
                        "2. Bawang merah - 5 butir\n" +
                        "3. Kunyit - 4 cm\n" +
                        "4. Jahe - 4 cm\n" +
                        "5. Lengkuas - 4 cm\n" +
                        "6. Cabe merah besar - 3 buah\n" +
                        "7. Garam - 1 sdt",

                "Cara memasak :\n" +
                        "1. umuri kepala ikan dengan garam dan air jeruk. Diamkan 10 menit lalu cuci bersih kembali.\n" +
                        "2. Tumis bumbu halus hingga harum.\n" +
                        "3. Masukkan daun salam, daun kunyit, daun jeruk, serai, dan tomat. Masak sampai tomat matang\n" +
                        "4. Masukkan santan, garam, dan  gula, masak sampai mendidih sambil diaduk-aduk. Kecilkan api.\n" +
                        "5. Masukkan kepala ikan dan rawit utuh. Masak sampai kepala ikan matang dan bumbu meresap. Angkat\n" +
                        "6. Siap disajikan.\n",
                "tips :  Setelah kepala ikan masuk, jangan terlalu lama memasaknya agar daging tidak hancur.",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, gulai_kepala_ikan_kakap);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:8-OvORDMyc"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=8-OvORDMyc"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}