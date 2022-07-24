package com.example.fdmassivendp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

public class makanan_dan_minuman extends AppCompatActivity {



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
        setContentView(R.layout.activity_makanan_dan_minuman);

        jasonprofil = findViewById(R.id.jasonprofil);
        fauth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        userId = fauth.getCurrentUser().getUid();
        storageReference = FirebaseStorage.getInstance().getReference();

        userId = fauth.getCurrentUser().getUid();
        user = fauth.getCurrentUser();

        databaseUsers = FirebaseDatabase.getInstance().getReference();
        name = findViewById(R.id.namausrdimakdanmin);

        SharedPreferences sharedPref = getSharedPreferences("_USER", Context.MODE_PRIVATE);
        String _name = sharedPref.getString("name", "");

        name.setText(_name);

        StorageReference profileref = storageReference.child("user/"+fauth.getCurrentUser().getUid()+"/profile.jpg");
        profileref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(jasonprofil);
            }
        });



        ImageButton resepminuman;
        resepminuman = findViewById(R.id.resepminuman);
        resepminuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan_dan_minuman.this, minuman.class));
            }
        });


        ImageButton resepmakanan;
        resepmakanan = findViewById(R.id.resepmakanan);
        resepmakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan_dan_minuman.this, makanan.class));
            }
        });

        ImageButton imgbtn;
        imgbtn = findViewById(R.id.imageButton);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan_dan_minuman.this, home_screen.class));
            }
        });

        ImageButton imgbtn2;
        imgbtn2 = findViewById(R.id.imageButton2);
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan_dan_minuman.this, resepsaya.class));
            }
        });

        ImageButton imgbtn3;
        imgbtn3 = findViewById(R.id.imageButton3);
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(makanan_dan_minuman.this, profil.class));
            }
            });
    }
}


