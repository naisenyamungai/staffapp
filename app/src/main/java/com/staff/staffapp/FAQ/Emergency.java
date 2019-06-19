package com.staff.staffapp.FAQ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.staff.staffapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Emergency extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData(){
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("SafaricomSecurity");
        listDataHeader.add("MINET");
        listDataHeader.add("Ambulance");
        listDataHeader.add("SafaricomEmergency");
        listDataHeader.add("AutomobileAssociation");
        listDataHeader.add("Test");

        List<String> safaricomSecurity = new ArrayList<>();
        safaricomSecurity.add("For security emergency, call the number below");

        safaricomSecurity.add("0722 007 777");

        List<String> minet = new ArrayList<>();
        minet.add("This is MINET(AON) 24 Hour Call Centre");
        minet.add("0719 04 44 44");
        minet.add("0719 04 40 00");
        minet.add("0730 67 44 44");
        minet.add("0730 67 40 00");
        minet.add("020 497 44 44");
        minet.add("020 497 50 00");

        List<String> ambulance = new ArrayList<>();
        ambulance.add("This the ambulance number");
        ambulance.add("0719 04 44 44");

        List<String> safaricomEmergency = new ArrayList<>();
        safaricomEmergency.add("These are safaricom security desk emergency numbers");
        safaricomEmergency.add("HQ1:");
        safaricomEmergency.add("0722 003 997");
        safaricomEmergency.add("0722 003 998");
        safaricomEmergency.add("");
        safaricomEmergency.add("HQ2:");
        safaricomEmergency.add("0722 004 886");
        safaricomEmergency.add("0722 004 887");
        safaricomEmergency.add("0722 004 888");
        safaricomEmergency.add("");
        safaricomEmergency.add("SCC:");
        safaricomEmergency.add("0722 002 300");
        safaricomEmergency.add("0722 002 310");
        safaricomEmergency.add("");
        safaricomEmergency.add("JCC:");
        safaricomEmergency.add("0722 002 740");

        List<String> automobileAssociation = new ArrayList<>();
        automobileAssociation.add("This the Automobile Association Towing Number");
        automobileAssociation.add("0719 04 44 44");

        List<String> test = new ArrayList<>();
        test.add("This is Sam Ngigi Number");
        test.add("0722 60 30 85");


        listHash.put(listDataHeader.get(0), safaricomSecurity);
        listHash.put(listDataHeader.get(1), minet);
        listHash.put(listDataHeader.get(2), ambulance);
        listHash.put(listDataHeader.get(3), safaricomEmergency);
        listHash.put(listDataHeader.get(4), automobileAssociation);
        listHash.put(listDataHeader.get(5), test);

    }
}
