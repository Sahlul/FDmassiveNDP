package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tumis_tempe_kacang_panjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tumis_tempe_kacang_panjang);
        listview();

    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseptumiskacangpnjg);

        String[] tumis_tempe_kacang_panjang = {"Bahan : : :\n" +
                " 1. 250 gram tempe, potong dadu\n" +
                " 2. 150 ml air\n" +
                " 3. 100 gram kacang panjang, potong sepanjang 3 cm\n" +
                " 4. 4 siung bawang merah, iris halus\n" +
                " 5. 2 siung bawang putih, iris halus\n" +
                " 6. 2 buah cabai merah, potong menyerong\n" +
                " 7. 2 cm lengkuas, pipihkan\n" +
                " 8. 1 lembar daun salam\n" +
                " 9. 1 sdm kecap manis\n" +
                "10. ½ sdt kaldu bubuk\n" +
                "11.  ½ sdt gula\n" +
                "12. ½ sdt garam\n" +
                "\n",


                "Cara memasak  :\n" +
                        "1. Panaskan sedikit minyak, tumis irisan bawang merah, bawang putih, cabai, daun salam, dan pipihan lengkuas.\n" +
                        "2. Masukkan tempe dan kacang tanah, lalu aduk sejenak.\n" +
                        "3. Tambahkan air, garam, gula, kaldu bubuk, dan kecap.\n" +
                        "4. Aduk kembali dan tunggu bumbunya meresap dan airnya kering.\n" +
                        "5. Siap di sajikan",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, tumis_tempe_kacang_panjang);
        list.setAdapter(myAdapter);


    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:05bIjsi9IGo"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=05bIjsi9IGo"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}