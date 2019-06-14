package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mViewProductsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewProductsButton=(Button) findViewById(R.id.viewProductsButton);
        mViewProductsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==mViewProductsButton){
            Intent intent=new Intent(MainActivity.this,ProductLandingActivity.class);
            startActivity(intent);
        }
    }
}
