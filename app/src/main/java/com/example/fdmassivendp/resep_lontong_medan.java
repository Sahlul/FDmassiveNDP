package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class resep_lontong_medan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_lontong_medan);

        listview();

    }

    private void listview() {
        ListView list = (ListView) findViewById(R.id.listreseplontongmedan);

        String [] resep_lontong_medan = {"Bahan :\n" +
                "1.Buncis, dipotong serong - 150 gram\n" +
                "2.Wortel, kupas, potong-potong - 100 gram\n" +
                "3.Labu siam, kupas, potong dadu - 100 gram\n" +
                "4.Minyak goreng - 3 sdm\n" +
                "5.Daun jeruk - 5 lembar\n" +
                "6.Daun salam - 3 lembar\n" +
                "7.Daun kunyit, simpulkan - 1 lembar\n" +
                "8.Santan sedang - 1,5 liter\n" +
                "9.Garam - 2 sdt\n" +
                "10.Gula pasir - 1 sdt",

                "Bumbu Halus :\n"+
        "1.Bawang putih - 10 siung\n"+
        "2.Kemiri - 3 butir\n"+
        "3.Ketumbar - 2 sdt\n"+
        "4.Jinten - 1 sdt\n"+
        "5.Lengkuas - 2 cm\n"+
        "6.Cabe merah keriting - 3 buah\n"+
        "7.Kunyit, bakar - 5 cm\n"+
        "8.Jahe - 2 cm\n"+
        "9.Udang rebon, goreng dengan sedikit minyak - 2 sdm",

                "Bahan Pelengkap :\n"+
        "1.Lontong, potong potong - 8 buah\n"+
        "2.Bihun tumis - secukupnya\n"+
        "3.Kering kentang - secukupnya\n"+
        "4.Sambal tauco medan / sambal cabe merah - secukupnya\n"+
        "5.Telur balado - 8 butir\n"+
        "6.Rendang daging beserta bumbunya - 8 potong\n"+
        "7.Kerupuk merah - secukupnya",

                "Langkah Membuat :\n"+
        "1.Panaskan minyak, tumis bumbu halus beserta daun jeruk, daun salam, dan daun kunyit sampai wangi.\n"+
        "2.Masukkan wortel dan labu siam, aduk sampai layu\n"+
        "3.Tambahkan santan, masak sampai mendidih dan wortel setengah lunak.\n"+
        "4.Masukkan buncis, bumbui dengan garam dan gula, koreksi rasa. Masak sampai semua matang, kemudian angkat.\n"+
                        "5.Tata lontong dalam piring saji, siram dengan sayur dan kuahnya selagi panas.\n"+
                "6.Tambahkan bihun tumis, telur balado, rendang daging dan bumbunya, kering kentang, kerupuk merah, dan sambal. Siap disajikan hangat-hangat.",






        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_activated_1,resep_lontong_medan);
        list.setAdapter(myAdapter);
    }
}