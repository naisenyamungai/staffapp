package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class NewsDetailsActivity extends AppCompatActivity {
    WebView webView;
    ProgressBar detailsloader;
    String url = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
    }

//    Intent intent = getIntent();
//    url = intent.getStringExtra("url");
//    loader = (ProgressBar)
}
