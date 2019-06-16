package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mFAQButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFAQButton = (Button) findViewById(R.id.faq_button);
        mFAQButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                
            }
        });
    }
}
