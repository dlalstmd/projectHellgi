package com.example.projecthellgi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WorkChange_page extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workchango_page);

        Button fullBodyExercise_btn = findViewById(R.id.fullBodyExercise_btn);
        Button weightExercise_btn = findViewById(R.id.weightExercise_btn);
        Button sports_btn = findViewById(R.id.sports_btn);
        Button other_btn = findViewById(R.id.other_btn);
        Button choice_btn = findViewById(R.id.choice_btn);
        EditText editOtherExercise = findViewById(R.id.editOtherExercise);


    }
}
