package com.staff.staffapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.staff.staffapp.R;
import com.staff.staffapp.faq.ProductsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mFAQButton;
    Button mViewProductsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFAQButton = (Button) findViewById(R.id.faq_button);
        mFAQButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, FAQ.class);
                startActivity(intent);
            }
        });
        mViewProductsButton=(Button) findViewById(R.id.viewProductsButton);
        mViewProductsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==mViewProductsButton){
            Intent intent=new Intent(MainActivity.this, ProductsActivity.class);
            startActivity(intent);
        }
    }
}
