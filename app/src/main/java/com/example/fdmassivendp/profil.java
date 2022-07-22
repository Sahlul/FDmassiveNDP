package com.example.fdmassivendp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class profil extends AppCompatActivity {

    FirebaseAuth fauth;
    FirebaseFirestore fstore;
    FirebaseUser user;
    String userId;
    StorageReference storageReference;
    DatabaseReference databaseUsers,databaseresep;
    ImageView imageview3;
    RecyclerView simpanresep;
    ArrayList<resep> list;
    DatabaseReference databaseReference;
    MyAdapter adapter;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(profil.this,tambahresep.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        imageview3 = findViewById(R.id.imageView3);

        fauth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        storageReference = FirebaseStorage.getInstance().getReference();

        userId = fauth.getCurrentUser().getUid();
        user = fauth.getCurrentUser();

        databaseUsers = FirebaseDatabase.getInstance().getReference();
        databaseresep = FirebaseDatabase.getInstance().getReference();

        StorageReference profileref = storageReference.child("user/"+fauth.getCurrentUser().getUid()+"/profile.jpg");
        profileref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(imageview3);
            }
        });

        simpanresep = findViewById(R.id.reseptersimpan);
        databaseresep = FirebaseDatabase.getInstance().getReference();
        list = new ArrayList<>();
        simpanresep.setLayoutManager(new LinearLayoutManager(this));

        DocumentReference docRef = db.collection("resep").document(user.getEmail());
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                    if (task.isSuccessful()) {
                        DocumentSnapshot document = task.getResult();
                        if (document.exists()) {

                            Log.e("_NAME", String.valueOf(document.getData()));


                        }

                    }

            }

        });
        adapter = new MyAdapter(this,list);
        simpanresep.setAdapter(adapter);

        databaseresep.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()) {

                    resep resep = dataSnapshot.getValue(resep.class);
                    list.add(resep);

                }
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




        ImageButton ibtn11;
        ibtn11= findViewById(R.id.imageButton11);
        ibtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,home_screen.class));
            }
        });

        ImageButton ibtn12;
        ibtn12= findViewById(R.id.imageButton12);
        ibtn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,resepsaya.class));
            }
        });

        ImageButton ibtn13;
        ibtn13= findViewById(R.id.imageButton13);
        ibtn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,profil.class));
            }
        });


        /*ImageView ibtn23;
        ibtn23= findViewById(R.id.imageView23);
        ibtn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,resep_lontong_medan.class));
            }
        });*/

        ImageView ibtn22;
        ibtn22= findViewById(R.id.imageView22);
        ibtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,history.class));
            }
        });

        ImageView image;
        image= findViewById(R.id.imageView3);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil.this,profil_pengguna.class));
            }
        });



    }
}