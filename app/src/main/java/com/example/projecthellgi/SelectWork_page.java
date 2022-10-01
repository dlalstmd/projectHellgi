package com.example.projecthellgi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class SelectWork_page extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectwork_page);

        Button fullBodyExercise_btn = findViewById(R.id.fullBodyExercise_btn);
        Button weightExercise_btn = findViewById(R.id.weightExercise_btn);
        Button sports_btn = findViewById(R.id.sports_btn);
        Button other_btn = findViewById(R.id.other_btn);
        Button choice_btn = findViewById(R.id.choice_btn);

        final FirebaseFirestore db = FirebaseFirestore.getInstance();
        HashMap<String, String> map = new HashMap<>();

        choice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainProfile_page.class);
                startActivity(intent);
            }
        });

        fullBodyExercise_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
