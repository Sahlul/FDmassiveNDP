package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class taro_bubble_milkshake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taro_bubble_milkshake);
        listview();
    }
    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseptarobubble);

        String [] taro_bubble_milkshake = {"Bahan :\n" +
                "1. 250 ml susu cair putih\n" +
                "2. 3 sdm bubuk taro\n" +
                "3. 3 sdm tapioca pearl yang sudah direndam air\n" +
                "4. 2 sdm gula pasir\n" +
                "5. es batu secukupnya\n" +
                "6. air secukupnya\n",

                "Cara membuat :\n" +
                        "1. Panaskan 100 ml air sebentar saja, tuang bubble dan gula pasir ke dalamnya. Rebus hingga gula meresap dan bubble empuk. Angkat dan biarkan dingin.\n" +
                        "2. Masukkan susu, bubuk taro dan gula pasir ke dalam blender. Aduk cepat hingga tercampur rata.\n" +
                        "3. Siapkan es batu di dalam gelas, tuang bubble secukupnya dan tuang milkshake taro hingga penuh.\n" +
                        "4. Sajikan taro bubble milkshake selagi dingin.\n",




        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_activated_1,taro_bubble_milkshake);
        list.setAdapter(myAdapter);

    }
    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:ZSx8oIpEhtI"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=ZSx8oIpEhtI"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
    }


