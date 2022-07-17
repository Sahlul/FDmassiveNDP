package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class resep_tim_ikan_kakap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_tim_ikan_kakap);
        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseptimikankkp);

        String[] tim_ikan_kakap = {"Bahan :\n" +
                "1. Ikan kakap @500 gram - 1 ekor\n" +
                "2. Jahe, iris iris panjang - 5 cm\n" +
                "3. Bawang putih, iris iris - 3 siung\n" +
                "4. Jeruk nipis, ambil airnya - 1 buah\n" +
                "5. Daun bawang, iris iris - 1 batang\n" +
                "6. Cabai merah keriting, iris iris - 3 buah\n" +
                "7. Kecap asin - 1 sdm\n" +
                "8. Kecap ikan - 1 sdm\n" +
                "9. Minyak wijen - 1 sdt\n" +
                "10. Saus tiram - 1 sdm\n" +
                "11. Lada bubuk - 1/2 sdt\n" +
                "12. Air - 50 ml\n" +
                "13. Garam - secukupnya" +
                "14. 300 ml air",

                "Cara memasak :\n" +
                        "1. Bersihkan ikan dan kerat-kerat, setelah itu beri air jeruk nipis dan garam kemudian cuci kembali ikan. Sisihkan.\n" +
                        "2. Dalam wadah tuang kecap asin, kecap ikan, minyak wijen, saus tiram, lada bubuk dan air.\n" +
                        "3. Tata ikan dalam piring tahan panas lalu beri campuran bumbu tadi, marinasi ikan selama 30 menit.\n" +
                        "4. Beri potongan jahe, bawang putih, daun bawang, serta cabai merah di dalam perut dan di atas ikan.\n" +
                        "5. Kukus ikan selama 20 menit atau hingga daging ikan matang.\n" +
                        "6. Tim Ikan Kakap siap dinikmati.\n",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, tim_ikan_kakap);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:PCn7oiE-LWw"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=PCn7oiE-LWw"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}