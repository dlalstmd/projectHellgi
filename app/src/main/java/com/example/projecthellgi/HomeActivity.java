package com.example.projecthellgi;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private FragmentInfo fragmentInfo = new FragmentInfo();
    private FragmentHome fragmentHome = new FragmentHome();
    private FragmentProfile fragmentProfile = new FragmentProfile();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_page);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentInfo).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());
    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
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
            }
            return true;
        }
    }
}
