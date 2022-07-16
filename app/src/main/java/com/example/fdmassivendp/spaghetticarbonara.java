package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class spaghetticarbonara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spaghetticarbonara);

        listview();
    }
    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseptmpbacem);

        String [] spaghetticarbonara = {"Bahan :\n" +
                "1. Spaghetti - 200 gram\n" +
                "2. Susu cair - 200 ml\n" +
                "3. Butter / margarin - 1 sdm\n" +
                "4. Bawang putih, cincang - 2 siung\n" +
                "5. Bawang bombay, cincang - 1/2 butir\n" +
                "6. Smoke beef, iris tipis - 2 lembar\n" +
                "7. Telur, kocok lepas - 1 butir\n" +
                "8. Keju cheddar, parut - 50 gram\n" +
                "9. Lada bubuk - 1/2 sdt\n" +
                "10. Oregano - 1/2 sdt\n" +
                "11. Garam - 1/2 sdt\n" +
                "12. Maizena, larutkan dengan sedikit air - 1/2 sdt",

                "Taburan :\n" +
                        "1. Keju cheddar, parut - secukupnya\n" +
                        "2. Daun parsley - secukupnya",


                "Cara memasak :\n" +
                        "1. Dalam panci, rebus spaghetti sampai aldente. Angkat dan tiriskan. Sisihkan.\n" +
                        "2. Tumis bawang putih dan bombay dengan margarin sampai harum.\n" +
                        "3. Masukkan smoke beef. Aduk rata\n" +
                        "4. Tuang ⅔ bagian susu cair. Aduk rata.\n" +
                        "5. Masukkan keju, lada, oregano, garam, dan garam. Aduk rata. Koreksi rasanya.\n" +
                        "6. Tuang larutan maizena. Aduk rata.\n" +
                        "7. Masukkan spaghetti. Aduk rata.\n" +
                        "8. Tuang kocokan telur dan sisa susu cair. Aduk dan masak sebentar dengan api kecil hingga kuah jadi creamy. Angkat.\n" +
                        "9. Siap disajikan dengan taburan keju parut dan parsley",




        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_activated_1,spaghetticarbonara);
        list.setAdapter(myAdapter);

    }
    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:zy8wXp_Lt5Q"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=zy8wXp_Lt5Q"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }


}