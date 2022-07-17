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
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.Map;

public class profil_edit extends AppCompatActivity {

    private static  final int GALLERY_INTENT_CODE = 1023;

    FirebaseAuth fauth;
    FirebaseFirestore fstore;
    FirebaseUser user;
    String userId;
    ImageView gantifotoprofil;
    StorageReference storageReference;
    Button submit;
    ImageView viewdata;
    ImageView fotoprofil;
    EditText name,email,notelp,password,ulangpassword;
    DatabaseReference databaseUsers;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_edit);

        fotoprofil = findViewById(R.id.fotoprofil);
        gantifotoprofil = findViewById(R.id.editfoto);


        fauth = FirebaseAuth.getInstance();
        fstore = FirebaseFirestore.getInstance();
        storageReference = FirebaseStorage.getInstance().getReference();

        userId = fauth.getCurrentUser().getUid();
        user = fauth.getCurrentUser();



        name = findViewById(R.id.edusername);
        email = findViewById(R.id.edemail);
        notelp = findViewById(R.id.ednotelp);

        databaseUsers = FirebaseDatabase.getInstance().getReference();

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InsertData();

            }
        });



        viewdata = findViewById(R.id.viewdata);
        viewdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(profil_edit.this,profil_pengguna.class));
                finish();
            }
        });


        StorageReference profileref = storageReference.child("user/"+fauth.getCurrentUser().getUid()+"/profile.jpg");
        profileref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(fotoprofil);
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
        String username = name.getText().toString();
        String useremail = email.getText().toString();
        String usernotelp = notelp.getText().toString();

        String id = databaseUsers.push().getKey();

        User user = new User(username, useremail, usernotelp);

// Add a new document with a generated ID
        db.collection("users").document(useremail)
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
                fotoprofil.setImageURI(imageUri);



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
                        Picasso.get().load(uri).into(fotoprofil);
                    }
                });
            }

        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(profil_edit.this,"Failed",Toast.LENGTH_SHORT).show();
            }
        });



    }


}