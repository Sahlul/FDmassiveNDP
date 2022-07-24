package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

public class home_screen extends AppCompatActivity {


    FirebaseAuth fauth;
    FirebaseFirestore fstore;
    FirebaseUser user;
    String userId;
    StorageReference storageReference;
    DatabaseReference databaseUsers;
    ImageView jasonprofil;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        jasonprofil = findViewById(R.id.jasonprofil);

        fauth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        userId = fauth.getCurrentUser().getUid();
        storageReference = FirebaseStorage.getInstance().getReference();

        userId = fauth.getCurrentUser().getUid();
        user = fauth.getCurrentUser();

        databaseUsers = FirebaseDatabase.getInstance().getReference();
        name = findViewById(R.id.nama);

        SharedPreferences sharedPref = getSharedPreferences("_USER",Context.MODE_PRIVATE);
        String _name = sharedPref.getString("name", "");

        name.setText(_name);

        StorageReference profileref = storageReference.child("user/"+fauth.getCurrentUser().getUid()+"/profile.jpg");
        profileref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(jasonprofil);
            }
        });





        ImageButton rspmakanandanminuman;
        rspmakanandanminuman = findViewById(R.id.rspmakdanmin);
        rspmakanandanminuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, makanan_dan_minuman.class));
            }
        });

        ImageButton keresepiknkkp;
        keresepiknkkp = findViewById(R.id.keresepikankkp);
        keresepiknkkp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, resep_ikan_kakap.class));
            }
        });


        ImageView bhanpilihan;
        bhanpilihan = findViewById(R.id.kebahanpilihan);
        bhanpilihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, bahan_pilihan.class));
            }
        });


        ImageButton resepbru;
        resepbru = findViewById(R.id.kereseptrbru);
        resepbru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, resep_terbaru.class));
            }
        });

        ImageView profil;
        profil = findViewById(R.id.profil1);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, profil.class));
            }
        });

        ImageView add;
        add = findViewById(R.id.add1);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, resepsaya.class));
            }
        });
        ImageView userprofil;
        userprofil = findViewById(R.id.jasonprofil);
        userprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, profil_pengguna.class));
            }
        });


        ImageView brgrtmp;
        brgrtmp = findViewById(R.id.burgertempe);
        brgrtmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, resep_burger_tempe.class));
            }
        });

        ImageView supikankkp;
        supikankkp = findViewById(R.id.makananrekomendasi1);
        supikankkp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home_screen.this, sup_ikan_kakap.class));
            }
        });




    }
}