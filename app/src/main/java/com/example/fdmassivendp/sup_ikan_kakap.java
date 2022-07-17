package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sup_ikan_kakap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup_ikan_kakap);
        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepsupikankkp);

        String[] sup_ikan_kakap = {"Bahan :\n" +
                "1. Ikan kakap merah - 1 ekor\n" +
                "2. Jeruk nipis, ambil air perasannya - 1 buah\n" +
                "3. Tomat hijau, iris - 1 buah\n" +
                "4. Daun ketumbar, iris halus - 50 gram\n" +
                "5. Bawang putih - 6 siung\n" +
                "6. Bawang merah - 6 butir\n" +
                "7. Bawang bombay - 1/2 siung\n" +
                "8. Garam - 1 sdm\n" +
                "9. Gula - 1/2 sdm\n" +
                "10. Lada putih - 1 sdt\n" +
                "11. Kaldu bubuk - 1 sdm\n" +
                "12. Kecap ikan - 1 sdm\n" +
                "13. Air - 1,5 liter\n" +
                "14. Bawang goreng - secukupnya\n" +
                "15. Minyak, untuk menumis - secukupnya",

                "Cara memasak :\n" +
                        "1. Cuci bersih ikan, lalu potong sesuai selera. Lumuri dengan air perasan jeruk nipis dan 1 sdm garam hingga merata. Biarkan selama 10 menit lalu bilas kembali hingga bersih. Sisihkan\n" +
                        "2. Panaskan minyak. Goreng bawang putih, bawang merah, dan bawang bombay hingga layu dan matang. Angkat lalu haluskan/blender hingga jadi pasta.\n" +
                        "3. Dalam panci, didihkan 1,5 liter air\n" +
                        "4. Masukkan ikan, bawang halus, dan irisan tomat hijau. Aduk rata dan biarkan hingga mendidih kembali.\n" +
                        "5. Bumbui dengan garam, gula, lada, kaldu bubuk, dan kecap ikan. Aduk rata dan koreksi rasanya. Matikan api. \n" +
                        "6. Beri taburan daun ketumbar dan bawang goreng.\n" +
                        "Siap di sajikan.\n",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, sup_ikan_kakap);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:fbyg2GDhaWs"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=fbyg2GDhaWs"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}