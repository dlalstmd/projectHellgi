package com.example.projecthellgi;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;

import java.util.HashMap;

public class AddPhoto_page extends AppCompatActivity {

    Uri imgUrl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addphoto_page);

        Button addPhoto_btn = findViewById(R.id.addphoto_btn);
        EditText addPhoto_edit = findViewById(R.id.addphoto_edit);
        ImageView photoView = findViewById(R.id.addphoto_img);

        StorageReference storageReference;



        FirebaseFirestore db = FirebaseFirestore.getInstance();
        HashMap<String, Object> user = new HashMap<>();
    }
}
