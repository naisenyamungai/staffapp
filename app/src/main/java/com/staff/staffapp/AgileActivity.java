package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AgileActivity extends AppCompatActivity {
    PDFView agile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agile);

        agile = (PDFView) findViewById(R.id.pdfAgile);

        agile.fromAsset("agile.pdf").load();

    }
}
