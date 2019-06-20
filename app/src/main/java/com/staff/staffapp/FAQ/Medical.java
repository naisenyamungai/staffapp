package com.staff.staffapp.FAQ;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;
import com.staff.staffapp.R;

public class Medical extends AppCompatActivity {

    Button btn_attachment1, btn_attachment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);

        btn_attachment1 = (Button) findViewById(R.id.attachment1);
        btn_attachment2 = (Button) findViewById(R.id.attachment2);

        btn_attachment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Medical.this, Panel.class);
                startActivity(i);
            }
        });
    }
}
