package com.staff.staffapp.FAQ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.staff.staffapp.R;

public class FAQ extends AppCompatActivity implements View.OnClickListener {


    private CardView leaveCard,jobsCard,contactsCard,ethicsCard, emergencyCard, medicalCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        leaveCard = (CardView) findViewById(R.id.leave_card);
        jobsCard = (CardView) findViewById(R.id.jobs_card);
        contactsCard = (CardView) findViewById(R.id.contacts_card);
        ethicsCard = (CardView) findViewById(R.id.ethics_card);
        emergencyCard = (CardView) findViewById(R.id.emergency_card);
        medicalCard = (CardView) findViewById(R.id.medical_card);
        //Add Click Listener to the cards
        leaveCard.setOnClickListener(this);
        jobsCard.setOnClickListener(this);
        contactsCard.setOnClickListener(this);
        ethicsCard.setOnClickListener(this);
        emergencyCard.setOnClickListener(this);
        medicalCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i ;

        switch (v.getId()){
            case R.id.leave_card : i = new Intent(this, Leave.class); startActivity(i); break;
            case R.id.jobs_card : i = new Intent(this, Jobs.class); startActivity(i);  break;
            case R.id.contacts_card : i = new Intent(this, Contacts.class); startActivity(i);  break;
            case R.id.ethics_card : i = new Intent(this, Ethics.class); startActivity(i); break;
            case R.id.emergency_card : i = new Intent(this, Emergency.class); startActivity(i); break;
            case R.id.medical_card : i = new Intent(this, Medical.class); startActivity(i); break;
            default:break;

        }

    }
}
