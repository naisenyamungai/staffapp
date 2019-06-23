package com.staff.staffapp.FAQ;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.staff.staffapp.MainActivity;
import com.staff.staffapp.R;

public class Ethics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethics);

        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottomNav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Intent i;

                    switch(menuItem.getItemId()){
                        case R.id.nav_home: i = new Intent(Ethics.this, MainActivity.class); startActivity(i); break;
                        case R.id.back: i = new Intent(Ethics.this, FAQ.class); startActivity(i); break;
                    }
                    return true;
                }
            };
}
