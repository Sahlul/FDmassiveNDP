package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class jamur_crispy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jamur_crispy);
        listview();
    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepjamrcryspi);

        String[] jamur_crispy = {"Bahan:\n" +
                "1. 250 gr jamur tiram, potong memanjang\n" +
                "2. 250 garam tepung\n" +
                "3. 1 butir telur\n" +
                "4. 1 sdt merica bubuk\n" +
                "5. 1/2 sdt garam\n" +
                "6. 1 sdt bubuk cabai",

                "Cara memasak :\n" +
                        "1. Kocok telur hingga berbusa dan tambahkan garam.\n" +
                        "2. Campurkan tepung dengan merica dan cabai bubuk sambil panaskan minyak goreng.\n" +
                        "3. Masukkan jamur ke dalam telur dan gulingkan pada tepung. Jika minyak sudah panas, goreng jamur sampai kecoklatan. Tiriskan dan sajikan",


        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_activated_1, jamur_crispy);
        list.setAdapter(myAdapter);

    }

    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:8Rq2J9nSa2Y"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=8Rq2J9nSa2Y"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }
}