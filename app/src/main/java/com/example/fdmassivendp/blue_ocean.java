package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class blue_ocean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blue_ocean);

        listview();
    }
    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepblueocean);

        String [] blue_ocean = {"Bahan :\n" +
                "1. 350 ml Pepsi blue\n" +
                "2. Es batu secukupnya\n" +
                "3. Sirup rasa jeruk\n" +
                "4. Biji selasih yang sudah direndam dengan air hangat\n" +
                "5. Nata de coco secukupnya\n",

                ""+

                "Cara membuat :\n" +
                        "1. Pertama-tama, tuangkan 2 sdm sirup jeruk ke dalam gelas\n" +
                        "2. Kemudian, tambahkan es batu sampai memenuhi gelas\n" +
                        "3. Selanjutnya, letakkan 1 sdm biji selasih yang sudah direndam dari air hangat dan nata de coco secukupnya diatas es batu\n" +
                        "4. Langkah terakhir, tuang minuman soda berwarna biru (Pepsi) secara perlahan-lahan hingga gelas tampak terisi penuh.\n" +
                        "5. Blue Ocean Drink yang segar siap dihidangkan\n",






        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_activated_1,blue_ocean);
        list.setAdapter(myAdapter);

    }
    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:ITfZjJB8fHk"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=ITfZjJB8fHk"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }


}