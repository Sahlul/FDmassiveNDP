package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class nila_asam_manis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nila_asam_manis);

        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseptmpbacem);

        String[] nila_asam_manis = {"Bahan :\n" +
                "1. 1 ekor ikan nila, belah jadi 2 bagian lalu bersihkan \n" +
                "2. 2 siung bawang merah, iris tipis\n" +
                "3. 5 buah cabai hijau, iris tipis\n" +
                "4. 1 buah bawang bombay, iris tipis\n" +
                "5. Sambal abc, rasa tomat\n" +
                "6. 1 siung bawang putih, iris tipis\n" +
                "7. 5 buah cabai merah, iris tipis\n" +
                "8. Kecap manis\n" +
                "9. 1 buah tomat, iris kecil\n" +
                "10. 6 buah cabai rawit, iris tipis\n" +
                "11. sambal abc, rasa cabai asli\n" +
                "12. garam\n" +
                "13. gula\n" +
                "14. penyedap rasa\n" +
                "15. 1 sendok tepung maizena, larutkan sedikit air",

                "Cara Memasak :\n" +
                        "1. Lumuri ikan dengan tepung dan beri garam, goreng.\n" +
                        "2. Tumis bawang bombay, bawang merah, bawang putih, cabai merah, cabai rawit, cabai hijau, dan tomat.\n" +
                        "3. Tuang sedikit air, masukkan sambal tomat dan sambal cabai. Beri sedikit kecap manis.\n" +
                        "4. Masukkan garam, gula, dan penyedap rasa secukupnya.\n" +
                        "5. Masukkan larutan tepung maizena. Sajikan di atas ikan goreng.\n",




        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, nila_asam_manis);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:MzEdUwBsUuQ"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=MzEdUwBsUuQ"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }


}