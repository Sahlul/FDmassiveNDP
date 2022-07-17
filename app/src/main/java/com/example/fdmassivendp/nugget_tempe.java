package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class nugget_tempe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nugget_tempe);
        listview();

    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepnugttempe);

        String[] nugget_tempe = {"Bahan : :\n" +
                " 1. Satu papan tempe \n" +
                " 2. 1 buah wortel ukuran sedang, kupas dan     \u2028     cincang halus \n" +
                " 3. 1 batang daun bawang dicincang halus\n" +
                " 4. 1 butir telur ayam\n" +
                " 5. 5 sendok makan tepung terigu\n" +
                " 6. 4 siung bawang putih dihaluskan \n" +
                " 7. 1/2 sdt garam\n" +
                " 8. 1/2 sdt lada bubuk  \n" +
                " 9. 1/4 sdt penyedap rasa\n" +
                "10. Minyak goreng secukupnya untuk                                menggoreng \n" +
                " \n",

                "Bahan pelapis :\n" +
                        "1. 5 sdm tepung terigu\n" +
                        "2. Air secukupnya \n" +
                        "3. Tepung panir secukupnya \n" +
                        "\n",

                "Cara Memasak  :\n" +
                        "1. Potong tempe menjadi 4 bagian lalu kukus hingga matang dan tempe lunak sekitar 15 menitan.\n" +
                        "2. Angkat tempe dan haluskan tempe kukus menggunakan garpu dalam mangkuk besar.\n" +
                        "3. Tambahkan sisa bahan nugget yaitu wortel cincang, daun bawang cincang, telur, tepung terigu, bawang putih halus, garam, lada bubuk, dan penyedap rasa.\n" +
                        "4. Aduk secara rata agar semua bahan tercampur. Jangan lupa koreksi rasa asinnya.\n" +
                        "5. Jika bahan nugget tempe sudah jadi, tuang adonan kedalam loyang yang sudah sedikit diolesi minyak. Ratakan permukaan.\n" +
                        "6. Kukus lagi adonan nugget sampai matang selama 30 menit.\n" +
                        "7. Setelah 30 menit, ambil nugget dari dalam loyang dan potong-potong kotak seperti nugget.\n" +
                        "8. Kemudian siapkan bahan pencelupnya yaitu adonan tepung dan tepung panir.\n" +
                        "9. Untuk adonan tepung,, campurkan tepung terigu dengan sedikit air. Aduk rata sampai adonan mengental.\n" +
                        "10. Ambil 1 iris nugget tempe lalu celupkan ke dalam adonan tepung dan gulingkan kedalam tepung panir sampai merata dan semua permukaan berlumur tepung panir.\n" +
                        "11. Lakukan proses di atas sampai semua bahan habis.\n" +
                        "12. Baru panaskan banyak minyak dalam wajan untuk menggoreng.\n" +
                        "13. Goreng nugget dengan api sedang sampai kering berwarna kuning kecoklatan. Angkat dan tiriskan.\n" +
                        "14. Nugget tempe siap disajikan selagi hangat.",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, nugget_tempe);
        list.setAdapter(myAdapter);


    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:MZERuh-qF9I"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=MZERuh-qF9I"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}