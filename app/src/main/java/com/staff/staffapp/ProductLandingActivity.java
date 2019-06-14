package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductLandingActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.tablayout) TableLayout tableLayout;
    @BindView(R.id.tabPersonal) TabItem tabPersonal;
    @BindView(R.id.tabBusiness) TabItem tabBusiness;
    @BindView(R.id.viewPager) ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_landing);

        ButterKnife.bind(this);
//        toolbar.setTitle(getResources().getString(R.string.toolbar_title));
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
