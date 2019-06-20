package com.staff.staffapp.FAQ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.staff.staffapp.R;

public class Medical extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

        pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("medical(1).pdf")
                .load();

    }
}
