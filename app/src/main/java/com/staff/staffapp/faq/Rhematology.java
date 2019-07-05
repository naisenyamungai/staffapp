package com.staff.staffapp.faq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.staff.staffapp.R;

public class Rhematology extends AppCompatActivity {
    PDFView rhematology;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhematology);

        rhematology = (PDFView) findViewById(R.id.pdfRhematology);

        rhematology.fromAsset("Rhematology.pdf").load();
    }
}
