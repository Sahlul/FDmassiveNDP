package com.example.fdmassivendp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

public class resep_terbaru extends AppCompatActivity {

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
        setContentView(R.layout.activity_resep_terbaru);

        jasonprofil = findViewById(R.id.jasonprofil);
        fauth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        userId = fauth.getCurrentUser().getUid();
        storageReference = FirebaseStorage.getInstance().getReference();

        userId = fauth.getCurrentUser().getUid();
        user = fauth.getCurrentUser();

        databaseUsers = FirebaseDatabase.getInstance().getReference();
        name = findViewById(R.id.namausrdireseptrbru);

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



        ImageView profil;
        profil = findViewById(R.id.profil1);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, profil.class));
            }
        });

        ImageView add1;
        add1 = findViewById(R.id.add1);
        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, resepsaya.class));
            }
        });

        ImageView home1;
        home1 = findViewById(R.id.home1);
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, home_screen.class));
            }
        });






        ImageView lntgmedan;
        lntgmedan = findViewById(R.id.lontongmedan);
        lntgmedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, resep_lontong_medan.class));
            }
        });

        ImageView stomedan;
        stomedan = findViewById(R.id.makanansotomedan);
        stomedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, resep_soto_medan.class));
            }
        });

        ImageView brgtmp;
        brgtmp = findViewById(R.id.brgtempe);
        brgtmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, resep_burger_tempe.class));
            }
        });

        ImageView timikankkp;
        timikankkp = findViewById(R.id.timikankkp);
        timikankkp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(resep_terbaru.this, resep_tim_ikan_kakap.class));
            }
        });
    }
}