package com.example.fdmassivendp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

public class tambahresep extends AppCompatActivity {
    FirebaseAuth fauth;
    FirebaseFirestore fstore;
    FirebaseUser user;
    String userId;
    ImageView gantifotoprofil;
    StorageReference storageReference;
    ImageView tambahfotoresep;
    EditText judulmasakan,ketresep,formbahan,langkahpembuatan;
    DatabaseReference databaseUsers;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahresep);


        tambahfotoresep = findViewById(R.id.tambahfotoresep);
        gantifotoprofil = findViewById(R.id.editfotoresep);


        fauth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        storageReference = FirebaseStorage.getInstance().getReference();

        userId = fauth.getCurrentUser().getUid();
        user = fauth.getCurrentUser();


        judulmasakan = findViewById(R.id.jdulmasakan);
        ketresep = findViewById(R.id.ketresep);
        formbahan= findViewById(R.id.formbahan);
        langkahpembuatan= findViewById(R.id.lngkahpembuatan);

        databaseUsers = FirebaseDatabase.getInstance().getReference();
        Button tambahresep;
        tambahresep = findViewById(R.id.tambahresep);
        tambahresep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertData();

            }
        });





        gantifotoprofil.setOnClickListener(new View.OnClickListener() { //bukagallery
            @Override
            public void onClick(View v) {
                Intent openGalleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(openGalleryIntent,1000);

            }
        });


    }

    public void InsertData() {
        String jdmasakan = judulmasakan.getText().toString();
        String keteranganrsp = ketresep.getText().toString();
        String bhanbhan = formbahan.getText().toString();
        String langkahpmbtn = langkahpembuatan.getText().toString();

        String id = databaseUsers.push().getKey();

        resep user = new resep(jdmasakan, keteranganrsp, bhanbhan,langkahpmbtn);

// Add a new document with a generated ID
        db.collection("resep").document(jdmasakan)
                .set(user)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d("berhasil", "DocumentSnapshot successfully written!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("gagal", "Error writing document", e);
                    }
                });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,@androidx.annotation.NonNull Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode == 1000){
            if (resultCode == Activity.RESULT_OK){
                Uri imageUri = data.getData();
                tambahfotoresep.setImageURI(imageUri);

                uploadImageToFirebase(imageUri);
            }
        }


    }
    private void uploadImageToFirebase(Uri imageUri) { // upload image ke firebase

        final StorageReference fileref = storageReference.child("user/"+fauth.getCurrentUser().getUid()+"/profile.jpg");
        fileref.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                fileref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Picasso.get().load(uri).into(tambahfotoresep);
                    }
                });
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(tambahresep.this,"Failed",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton ibtn22;
        ibtn22 = findViewById(R.id.kehomescreen);
        ibtn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tambahresep.this,home_screen.class));
            }
        });

        ImageButton ibtn21;
        ibtn21 = findViewById(R.id.imageButton21);
        ibtn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tambahresep.this,resepsaya.class));
            }
        });

        ImageButton ibtn19;
        ibtn19 = findViewById(R.id.imageButton19);
        ibtn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tambahresep.this,profil.class));
            }
        });














    }
}