package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class sapo_tahu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sapo_tahu);

        listview();
    }
    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepblueocean);

        String [] sapo_tahu = {"Bahan:\n" +
                "1. 100 gram dada ayam (potong-potong kecil)\n" +
                "2. 3 buah firm tofu potong-potong\n" +
                "3. 1/2 ikat sawi hijau\n" +
                "4. 1/2 paprika merah iris tipis\n" +
                "5. 1 cm jahe (cincang halus)\n" +
                "6. 3 siung bawang putih (cincang)\n" +
                "7. 1 batang daun bawang (iris-iris)\n" +
                "8. 1 buah bawang bombay sedang (iris-iris)\n" +
                "9. 3 sdm minyak goreng\n" +
                "10. 1 sdm saus tiram\n" +
                "11. 2 sdm kecap ikan\n" +
                "12. garam secukupnya\n" +
                "13. merica bubuk secukupnya\n" +
                "14. gula pasir secukupnya\n" +
                "15. 1 sdm full maizena (larutkan)\n" +
                "16. 300 ml air",

                "Cara memasak :\n" +
                        "1. Tumis jahe, bawang putih, bawang bombay, dan paprika.\n" +
                        "2. Masukkan ayam, aduk hingga agak matang.\n" +
                        "3. Masukkan sawi, aduk hingga agak layu.\n" +
                        "4. Tambahkan saus tiram, kecap ikan, dan merica. Aduk rata, lalu tambahkan air, aduk kembali.\n" +
                        "5. Tuang maizena, aduk rata, dan masak sampai meletup-letup.\n" +
                        "6. Masukkan tahu dan daun bawang, beri garam. Aduk rata.\n" +
                        "7. Siap disajikan.",




        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_activated_1,sapo_tahu);
        list.setAdapter(myAdapter);

    }
    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:XD2-bPM7A0c"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=XD2-bPM7A0c"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }


}