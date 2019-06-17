package com.staff.staffapp;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BusinessSchool extends AppCompatActivity {

    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_school);

        toolbar = getSupportActionBar();
        BottomNavigationView navigation = findViewById(R.id.navigation);

    }

//    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
//            = new BottomNavigationView.OnNavigationItemSelectedListener() {
//
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            Fragment fragment;
//            switch (item.getItemId()) {
//                case R.id.navigation_shop:
//                    toolbar.setTitle("Shop");
//                    return true;
//                case R.id.navigation_gifts:
//                    toolbar.setTitle("My Gifts");
//                    return true;
//                case R.id.navigation_cart:
//                    toolbar.setTitle("Cart");
//                    return true;
//                case R.id.navigation_profile:
//                    toolbar.setTitle("Profile");
//                    return true;
//            }
//            return false;
//        }
//    };
}
