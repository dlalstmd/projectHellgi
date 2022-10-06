package com.example.projecthellgi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity_page extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentInfo fragmentInfo = new FragmentInfo();
    private FragmentHome fragmentHome = new FragmentHome();
    private FragmentProfile fragmentProfile = new FragmentProfile();
    private FragmentMessage fragmentMessage = new FragmentMessage();
    private FragmentAddPhoto fragmentAddPhoto = new FragmentAddPhoto();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottomnavigationbar);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentInfo).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {
                case R.id.info:
                    transaction.replace(R.id.frameLayout, fragmentInfo).commitAllowingStateLoss();
                    break;
                case R.id.home:
                    transaction.replace(R.id.frameLayout, fragmentHome).commitAllowingStateLoss();
                    break;
                case R.id.profile:
                    transaction.replace(R.id.frameLayout, fragmentProfile).commitAllowingStateLoss();
                    break;
                case R.id.message:
                    transaction.replace(R.id.frameLayout, fragmentMessage).commitAllowingStateLoss();
                    break;
                case R.id.addPhoto:
                    transaction.replace(R.id.frameLayout, fragmentAddPhoto).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    }
}
