package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class caramel_machiato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caramel_machiato);
        listviewcaramel();
    }
    private void listviewcaramel() {
        ListView list = (ListView) findViewById(R.id.listresepcaramelmachiato);

        String [] caramel_macchiato = {"Bahan :\n" +
                "1. 150 ml susu UHT rasa karamel\n" +
                "2. 1-2 sendok makan bubuk kopi hitam tanpa ampas\n" +
                "3. 50 ml air panas\n" +
                "4. 3 sendok makan krim cair\n" +
                "5. es batu secukupnya\n" +
                "6. topping sirup karamel secukupnya\n",

                "Cara membuat :\n" +
                        "1. Seduh kopi bubuk dengan air panas.\n" +
                        "2. Siapkan krim cair instan, kemudian kocok dengan mixer hingga mengembang.\n" +
                        "3. Aduk rata susu dan kopi di gelas saji.\n" +
                        "4. Masukkan es batu ke dalam gelas. Tuang whipped cream di atasnya di atas kopi.\n" +
                        "5. Tuangkan topping sirup karamel secukupnya\n",





        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_activated_1,caramel_macchiato);
        list.setAdapter(myAdapter);

    }
    public void openYoutubecaramel(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:22Z1cu5isyU"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=22Z1cu5isyU"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }

}
