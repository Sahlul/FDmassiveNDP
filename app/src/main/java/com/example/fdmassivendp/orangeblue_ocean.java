package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class orangeblue_ocean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orangeblue_ocean);
        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseporanngeblueocean);

        String[] orangeblue_ocean = {"Peralatan yang digunakan :\n" +
                "\n" +
                "1. Sendok\n" +
                "2. Jigger\n" +
                "3. Gelas Ukur\n" +
                "4. Penjepit Es Batu\n" +
                "5. Sendok Pengaduk\n" +
                "6. Gelas",

                "" +

                        "Bahan yang digunakan :\n" +
                        "\n" +
                        "1. 20 ml sirup orange\n" +
                        "2. 15 ml sirup blue\n" +
                        "3. 150 ml minuman bersoda, di sini kita gunakan sprite\n" +
                        "4. Es batu secukupnya\n" +
                        "5. Popping Boba ",

                "Cara pembuatan :\n" +
                        "\n" +
                        "1. Siapkan gelas ukur yang sudah berisikan 150 ml sprite\n" +
                        "2. Selanjutnya, untuk awal kita masukkan 20 ml sirup orange atau bisa juga pakai sirup rasa lain sesuai selera ke dalam gelas\n" +
                        "3. Lalu tambahkan 15 ml sirup blue ke dalam gelas ukur\n" +
                        "4. Aduk secara merata supaya rasa segar dan freshnya semakin tersebar ke semua bagian\n" +
                        "5. Kemudian tambahkan es batu secukupnya ke dalam gelas, lalu tuangkan campuran sprite dan sirup blue ke dalam gelas\n" +
                        "6. Sudah lakukan semuanya? Yang terakhir jangan sampai terlewat ya! Yaitu tambahkan topping! Boba Lovers boleh tambahkan popping boba atau rainbow jelly untuk menambah kenikmatan dan kesegarannya. Masih ada gak sih topping lain yang bisa menambah kenikmatan juga keunikan minuman hari ini? Tentu ada dong! Kalian juga bisa tambahkan popping boba stroberi, mangga, leci, jeruk, jelly motif yang lucu serta unik dan juga rainbow jelly. \n ",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, orangeblue_ocean);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:ONi6Ikdo0cA"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=ONi6Ikdo0cA"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}