package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class resep_minuman_bandrek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_minuman_bandrek);
        listview();
    }
        private void listview() {
            ListView list = (ListView) findViewById(R.id.listresepburgertmp);

            String [] resep_bandrekjahe = {"Bahan :\n" +
                    "1. Susu cair\n" +
                    "2. 10 batang serai yang sudah digeprek\n" +
                    "3. sedikit jahe\n" +
                    "4. ¼ pala yang digeprek\n" +
                    "5. 5 batang kayu manis\n" +
                    "6. 3 biji kapulaga\n" +
                    "7. 15 butir lada\n" +
                    "8. 20 lembar daun pandan\n" +
                    "9. 5 buah bunga lawang\n" +
                    "10. Garam\n" +
                    "11. Gula \n",

                    "Cara membuat :\n" +
                            " 1. Pins sangrai  terlebih dahulu gula sampai kecoklatan lalu tambahkan air hingga mulai panas.\n" +
                            "2. Setelah itu masukan semua bahan dan rebus selama 15 menit.\n" +
                            "3. Jika sudah selesai saring air bandrek dari ampasnya\n" +
                            "4. campurkan susu cair \n" +
                            "5. Bandrek siap dinikmati.\n",




            };
            ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_activated_1,resep_bandrekjahe);
            list.setAdapter(myAdapter);


    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:2CPFnblCu6M"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=2CPFnblCu6M"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }

    }
}