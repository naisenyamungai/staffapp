package com.staff.staffapp.faq;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.staff.staffapp.R;
import com.staff.staffapp.adapter.ExpandableListAdapterLeave;
import com.staff.staffapp.ui.FAQ;
import com.staff.staffapp.ui.MainActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leave extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapterLeave listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);

        listView = (ExpandableListView) findViewById(R.id.lvExp);
        getLeaveDays();
        listAdapter = new ExpandableListAdapterLeave(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);

        listView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i1, long l) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + listHash.get(listDataHeader.get(i)).get(i1)));
                startActivity(intent);

                return false;
            }
        });

        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.bottomNav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private void getLeaveDays() {
    }




    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Intent i;

                    switch(menuItem.getItemId()){
                        case R.id.nav_home: i = new Intent(Leave.this, MainActivity.class); startActivity(i); break;
                        case R.id.back: i = new Intent(Leave.this, FAQ.class); startActivity(i); break;
                    }
                    return true;
                }
            };
}
