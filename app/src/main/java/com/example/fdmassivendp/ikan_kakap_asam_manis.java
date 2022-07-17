package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ikan_kakap_asam_manis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_kakap_asam_manis);
        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepikankkpasammanis);

        String[] ikan_kakap_asam_manis = {"Bahan :\n" +
                "1. Ikan kakap - 1 ekor\n" +
                "2. Tepung terigu - 5 sdm\n" +
                "3. Tepung sagu - 3 sdm\n" +
                "4. Jeruk nipis, ambil perasan airnya - 1 buah\n" +
                "5. Garam - secukupnya\n" +
                "6. Gula - secukupnya\n" +
                "7. Merica - secukupnya\n" +
                "8. Air - secukupnya",

                "Saus asam manis  :\n" +
                        "1. Bawang bombay, iris memanjang - 1 butir\n" +
                        "2. Bawang putih, cincang - 6 siung\n" +
                        "3. Jahe, geprek - 2 cm\n" +
                        "4. Cabai merah, iris serong - 2 buah\n" +
                        "5. Lada - 1 sdt\n" +
                        "6. Garam - 1 sdt\n" +
                        "7. Gula pasir - 2 sdm\n" +
                        "8. Saus tomat - 5 sdm\n" +
                        "9.Saus tiram - 1 sdm\n" +
                        "10. Minyak wijen - 1 sdm\n" +
                        "11. Air - secukupnya\n" +
                        "12. Tepung maizena dan air untuk mengentalkan - 1 sdt\n" +
                        "13. Wortel, potong korek api - 1 buah\n" +
                        "14. Timun, ambil dagingnya saja lalu potong korek api - 1 buah\n" +
                        "15. Nanas, potong kecil kecil - 1 buah",

                "Cara memasak  :\n" +
                        "1. Lumuri ikan kakap dengan air perasan jeruk nipis dan taburi dengan sedikit garam dan lada. Diamkan 10 menit di dalam kulkas\n" +
                        "2. Fillet ikan kakap. Potong-potong dagingnya, kemudian sisihkan. Simpan kepala dan tulangnya untuk digoreng jadi penghias di piring saja\n" +
                        "3. Campur tepung terigu, tepung sagu, air dan garam aduk rata sampai pas kekentalannya.\n" +
                        "4. Panaskan minyak dalam wajan. Celup ikan ke dalam tepung kemudian goreng sampai kekuningan dan matang. Angkat. Tiriskan.\n" +
                        "5. Saus Asam Manis: Tumis bawang bombay, bawang putih, dan jahe sampai harum. Tambahkan sedikit saja air\n" +
                        "6. Masukkan saus tomat, saus tiram, minyak wijen, lada, gula dan garam. Masukkan juga timun, wortel dan nanas. Biarkan sampai sayuran agak layu.\n" +
                        "7. Campur 1 sdt tepung maizena dengan sedikit saja air (2-3 sdm air), aduk sampai larut. Tuang ke wajan.aduk-aduk sampai mendidih. Koreksi rasa. Rasa manis asam dan asinnya .\n" +
                        "8. Sesaat sebelum diangkat masukan larutan tepung jagung. Setelah itu satukan ikan kakap tepung dengan saus asam manis. Sajikan hangat.\n",
                        "Siap disajikan\n",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, ikan_kakap_asam_manis);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:FFAocB8nVxo"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=FFAocB8nVxo"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}