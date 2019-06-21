package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductsActivity extends AppCompatActivity {

    @BindView(R.id.appbarId) AppBarLayout mProductsAppbar;
//    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    ProductLandingData mLandingData;
    LandingAdapter landingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        ButterKnife.bind(this);

//        List<ProductLandingData> mTitleList=new ArrayList<>();
//        mLandingData=new ProductLandingData("Business Products");
//        mTitleList.add(mLandingData);
//        mLandingData=new ProductLandingData("Personal Products");
//        mTitleList.add(mLandingData);
//
//        landingAdapter=new LandingAdapter(ProductsActivity.this,mTitleList);
//        mRecyclerView.setAdapter(landingAdapter);
    }
}
