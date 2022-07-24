package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class resep_burger_tempe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_burger_tempe);

        listview();
    }
    private void listview() {
        ListView list = (ListView) findViewById(R.id.listresepburgertmp);

        String [] resep_burgertmp = {"Bahan :\n" +
                "1. 4 roti burger atau roti bun dibagi menjadi dua\n" +
                "2. 4 lembar daun selada segar\n" +
                "3. 1 buah tomat diiris tipis\n" +
                "4. 1/2 buah mentimun diiris tipis\n" +
                "5. Saus sambal secukupnya\n" +
                "6. Saus tomat secukupnya\n" +
                "7. Mayonaise secukupnya\n" +
                "8. Margarin secukupnya untuk memanggang",

                "Bahan isian burger tempe :\n" +
                        "1. 200 gram tempe yang telah dikukus\n" +
                        "2. 1 siung bawang putih dicincang halus\n" +
                        "3. 1 butir kuning telur\n" +
                        "4. 1 butir putih telur, dikocok lepas untuk pelapis\n" +
                        "5. 3 sendok makan tepung panir atau tepung roti\n" +
                        "6. 1/4 sendok teh lada bubuk\n" +
                        "7. 1 sendok teh garam\n" +
                        "8. 1 sendok teh kecap manis\n" +
                        "9. 1 sendok teh kecap asin\n",


                "Cara memasak :\n" +
                        "1. Siapkan wadah besar dan hancurkan tempe yang telah kamu kukus menggunakan garpu.\n" +
                        "2. Lalu tambahkan kuning telur, bawang putih cincang, dan tepung panir. Aduk rata agar semua bahan tercampur.\n" +
                        "3. Bumbui dengan lada bubuk, garam, kecap manis, dan kecap asin. Aduk kembali adonan secara merata.\n" +
                        "4. Kemudian bagi adonan menjadi 4 bagian. Padatkan lalu bentuk pipih menggunakan tangan seperti daging burger dan jangan terlalu tebal.\n" +
                        "5. Celupkan tempe ke dalam putih telur yang sudah dikocok lepas.\n" +
                        "6. Panaskan teflon dan lelehkan margarin secukupnya untuk memanggang tempe.\n" +
                        "7. Panggang tempe dengan api sedang sampai matang. Jangan lupa dibalik agar matangnya merata. Angkat dan tiriskan.\n" +
                        "8. Setelah tempenya jadi, panggang sebentar roti burger yang sudah kamu potong menjadi 2 bagian. Angkat dan sisihkan.\n" +
                        "9. Ambil satu roti burger bagian bawah olesi dengan saus tomat dan sambal.\n" +
                        "10. Lalu susun bahan isiannya yaitu 1 lembar selada, burger tempe, mayonaise, irisan tomat, dan mentimun.\n" +
                        "11. Terakhir, tutup lagi dengan potongan roti burger bagian atas.\n" +
                        "12. Lakukan proses di atas sampai semua bahan habis. Sebenarnya, tidak ada urutan pasti untuk menyusun bahan isian burger. Kamu bisa susun sesuai selera.\n" +
                        "13. Burger tempe siap disajikan selagi hangat.",




        };
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_activated_1,resep_burgertmp);
        list.setAdapter(myAdapter);

    }
    public void openYoutube(View view) {
        Intent appIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:k89McTHi-yo"));
        Intent webIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://www.youtube.com/watch?v=k89McTHi-yo"));
        try {
            startActivity(appIntent);
        } catch (ActivityNotFoundException ex) {
            startActivity(webIntent);
        }
    }


    }