package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class resep_cendol_dawet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_cendol_dawet);
        listviewcendol();
    }

    private void listviewcendol() {
        ListView list = (ListView) findViewById(R.id.listresepcendoldawet);

        String[] cendoldawet = {"Bahan :\n" +
                "1. Tepung hunkwe - 120 gram\n" +
                "2. Tepung beras - 25 gram\n" +
                "3. Pasta pandan - 1 sdt\n" +
                "4. Air - 700 ml\n" +
                "5. Garam - 1 sdt\n" +
                "6. Es batu - secukupnya\n" +
                "7. Gula merah iris halus - 300 gram\n" +
                "8. Gula pasir - 100 gram\n" +
                "9. Air - 500 ml\n" +
                "10. Daun pandan - 3 lembar\n" +
                "11. Santan instan - 500 mlt\n" +
                "12. Air - 300 ml\n" +
                "13. Garam - 1 sdt\n" +
                "14. Daun pandan - 2 lembar\n",

                ""+

                "Cara membuat :\n" +
                        "1. Saus Gula: Campur semua bahan kemudian masak hingga mendidih. Angkat dan saring, kemudian dinginkan.\n" +
                        "2. Saus Santan: Campur semua bahan kemudian masak sambil terus diaduk-aduk hingga mendidih. Angkat dan dinginkan.\n" +
                        "3. Campur tepung hunkwe, tepung beras, air, pasta pandan, dan garam. Aduk hingga merata. Masak sambil terus diaduk-aduk hingga adonan meletup-letup dan matang.\n" +
                        "4. Siapkan air matang dalam baskom kemudian beri bongkahan es batu di dalamnya.\n" +
                        "5. Masukkan adonan cendol yang sudah matang tadi ke dalam cetakan cendol. Tekan pelan-pelan cetakannya. Posisikan cetakan cendol di atas baskom sehingga cendol jadi akan langsung masuk ke dalam baskom. Lakukan sampai semua adonan habis.\n" +
                        "6. Ambil cendol jadi dan tiriskan.\n",
                        ""+
                        " Penyajian: \n" +
                        "1. Masukkan beberapa sendok cendol (sesuai selera) ke dalam gelas saji.\n" +
                        "2. Tuang saus gula merah dan santan secukupnya. \n" +
                        "3. Tambahkan es batu dan selesai.\n",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, cendoldawet);
        list.setAdapter(myAdapter);

    }

    public void openYoutubecendoldawet(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:t9jhhaF5CLc"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=t9jhhaF5CLc"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}