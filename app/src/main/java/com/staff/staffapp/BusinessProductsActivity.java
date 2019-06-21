package com.staff.staffapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BusinessProductsActivity extends AppCompatActivity {

    @BindView(R.id.lvExpandable) ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    @BindView(R.id.toolbar) Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_products);
        ButterKnife.bind(this);

        initData();
        listAdapter=new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader=new ArrayList<>();
        listHash= new HashMap<>();

        listDataHeader.add("One Connect Express");
        listDataHeader.add("Cloud Storage");


        List<String> oneconnect=new ArrayList<>();
        oneconnect.add("This is a bundled communication package which offers a fixed voice landline and a fixed Internet connection transmitted through fibre.\n" +
                "\n" +
                "With Safaricom One Connect Express, there is no need to invest in a separate fixed landline and internet. This is a hybrid (Post-pay & Pre-pay) solution and provides a communication package that bundles voice and unlimited internet at an affordable cost.");

        List<String> cloudStorage=new ArrayList<>();
        cloudStorage.add("Securely store information online on the Safaricom Cloud.\n" +
                "\n" +
                "Key Benefits of Cloud Storage\n" +
                "Enables you to efficiently store, manage, and aggregate distributed big data across locations through a single pane of glass. Gain a common view and central management\n" +
                "Seamless scalability, making it possible to add capacity, applications, locations or tenants to your cloud with zero need to develop or reconfigure\n" +
                "Reduce administration time and ensure availability. Storage-as-a-service capability allows enterprises and service providers to meter capacity, bandwidth, and usage across tenants\n" +
                "Enable users to self-manage and access storage. Easy storage access which provides flexible access across networks and platforms for traditional applications, web applications, Microsoft Windows, Linux, and mobile devices\n" +
                "Allow users and applications instant access to data");

        listHash.put(listDataHeader.get(0),oneconnect);
        listHash.put(listDataHeader.get(1),cloudStorage);
    }
}
