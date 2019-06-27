package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class CommunicationActivity extends AppCompatActivity {
    PDFView comms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication);

        comms = (PDFView) findViewById(R.id.pdfComms);

        comms.fromAsset("comms.pdf").load();


    }
}
