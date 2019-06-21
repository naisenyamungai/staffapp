package com.staff.staffapp.FAQ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;
import com.staff.staffapp.R;

public class Medical extends AppCompatActivity implements View.OnClickListener {

    private CardView nairobiCard,coastCard,nyanzaCard,easternCard, centralCard, northCard, overseasCard,ambulanceCard,pharmaciesCard,physiotherapyCard, radiologyCard, labsCard, nursingCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical);
        nairobiCard = (CardView) findViewById(R.id.nairobi_card);
        coastCard = (CardView) findViewById(R.id.coast_card);
        nyanzaCard = (CardView) findViewById(R.id.nyanza_card);
        easternCard = (CardView) findViewById(R.id.eastern_card);
        centralCard = (CardView) findViewById(R.id.central_card);
        northCard = (CardView) findViewById(R.id.north_card);
        overseasCard = (CardView) findViewById(R.id.overseas_card);
        ambulanceCard = (CardView) findViewById(R.id.ambulance_card);
        pharmaciesCard = (CardView) findViewById(R.id.pharmacies_card);
        physiotherapyCard = (CardView) findViewById(R.id.physiotherapy_card);
        radiologyCard = (CardView) findViewById(R.id.radiology_card);
        labsCard = (CardView) findViewById(R.id.labs_card);
        nursingCard = (CardView) findViewById(R.id.nursing_card);

        //Add Click Listener to the cards
        nairobiCard.setOnClickListener(this);
        coastCard.setOnClickListener(this);
        nyanzaCard.setOnClickListener(this);
        easternCard.setOnClickListener(this);
        centralCard.setOnClickListener(this);
        northCard.setOnClickListener(this);
        overseasCard.setOnClickListener(this);
        ambulanceCard.setOnClickListener(this);
        pharmaciesCard.setOnClickListener(this);
        physiotherapyCard.setOnClickListener(this);
        radiologyCard.setOnClickListener(this);
        labsCard.setOnClickListener(this);
        nursingCard.setOnClickListener(this);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_medical);
//
//        btn_attachment1 = (Button) findViewById(R.id.attachment1);
//        btn_attachment2 = (Button) findViewById(R.id.attachment2);
//
//        btn_attachment1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(Medical.this, Panel.class);
//                startActivity(i);
//            }
//        });
//    }

    @Override
    public void onClick(View view) {
        Intent i ;

        switch (view.getId()){
            case R.id.nairobi_card : i = new Intent(this, Nairobi.class); startActivity(i); break;
            case R.id.coast_card : i = new Intent(this, Coast.class); startActivity(i);  break;
            case R.id.nyanza_card : i = new Intent(this, Nyanza.class); startActivity(i);  break;
            case R.id.eastern_card : i = new Intent(this, Eastern.class); startActivity(i); break;
            case R.id.north_card : i = new Intent(this, North.class); startActivity(i); break;
            case R.id.overseas_card : i = new Intent(this, Overseas.class); startActivity(i); break;
            case R.id.ambulance_card : i = new Intent(this, Ambulance.class); startActivity(i); break;
            case R.id.pharmacies_card : i = new Intent(this, Pharmacies.class); startActivity(i); break;
            case R.id.physiotherapy_card : i = new Intent(this, Physiotherapy.class); startActivity(i); break;
            case R.id.radiology_card : i = new Intent(this, Radiology.class); startActivity(i); break;
            case R.id.labs_card : i = new Intent(this, Labs.class); startActivity(i); break;
            case R.id.nursing_card : i = new Intent(this, Nursing.class); startActivity(i); break;
            default:break;

        }

    }
}
