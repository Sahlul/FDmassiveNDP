package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class bir_pletok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bir_pletok2);
        listviewbirpletok();
    }

    private void listviewbirpletok() {
        ListView list = (ListView) findViewById(R.id.listresepbirpletok);

        String[] bir_pletok = {"Bahan :\n" +
                "1. 500 ml air\n" +
                "2. 150 gram jahe, bakar, memarkan\n" +
                "3. 50 gram gula merah, sisir\n" +
                "4. 2 batang serai, memarkan\n" +
                "5. 5 lembar daun jeruk, buang tulang daunnya\n" +
                "6. 4 cm kayumanis\n" +
                "7. 5 butir cengkih\n" +
                "8. 10 gram kayu secang\n" +
                "9. 3 lembar daun pandan\n" +
                "10. 150 gram gula pasir\n" +
                "11. 1/8 sendok teh garam\n" +
                "12. 1/4 buah pala\n" +
                "\n",

                ""+

                        "Cara membuat :\n" +
                        "1. Rebus jahe, gula merah, serai, daun jeruk, kayumanis, cengkih, kayusecang, dan daun pandan di atas api kecil sampai mendidih dan harum. Saring.\n" +
                        "2. Tambahkan gula pasir, garam dan buah pala. Aduk rata.\n" +
                        "3. Masak sampai larut dan harum. Angkat. Sajikan hangat.\n" +
                        "\n",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, bir_pletok);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:VvjK-lvNWJ4"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=VvjK-lvNWJ4"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}