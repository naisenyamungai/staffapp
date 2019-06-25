package com.staff.staffapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.widget.ExpandableListView;

import com.staff.staffapp.adapter.ExpandableListAdapter;
import com.staff.staffapp.R;
import com.staff.staffapp.model.Product;
import com.staff.staffapp.service.ProductsService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class PersonalProductsActivity extends AppCompatActivity {

    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHash;
    private List<Product> products;
    @BindView(R.id.lvExpandable) ExpandableListView listView;
    @BindView(R.id.toolbar) Toolbar toolbar;
    private List<String> listDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d("Personal", "run: in onCreate ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_products);
        ButterKnife.bind(this);

        Log.d("Personal", "run: in onCreate ");


//        initData();
//        listAdapter=new ExpandableListAdapter(this,listDataHeader,listHash);
//        listView.setAdapter(listAdapter);

        getProducts();
        toolbar.setTitle(getResources().getString(R.string.toolbar_title_personal));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Log.d("Personal", "run: in onCreate ");

    }

    private void getProducts(){
        final ProductsService productsService=new ProductsService();
        productsService.getPersonalProducts(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                products=new ArrayList<>();
                products = productsService.processResaults(response);
                PersonalProductsActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //productsAdapter=new ExpandableListAdapter(getApplicationContext(), products);
                        listDataHeader=new ArrayList<>();
                        listHash=new HashMap<>();
                        listDescription=new ArrayList<>();

                        for(Product product: products){
                            listDataHeader.add(product.getTitle());
                            listDescription.add(product.getDescription());
                            listHash.put(product.getTitle(),listDescription);
                            listDescription=new ArrayList<>();
                        }
                        listAdapter=new ExpandableListAdapter(getApplicationContext(),listDataHeader,listHash);
                        listView.setAdapter(listAdapter);
                    }
                });
            }
        });
    }

    private void initData() {
        listDataHeader=new ArrayList<>();
        listHash= new HashMap<>();

        listDataHeader.add("Fuliza");
        listDataHeader.add("Okoa Stima");


        List<String> fuliza=new ArrayList<>();
        fuliza.add("Fuliza enables you to complete your M-PESA transactions when you have insufficient funds in your M-PESA account. You may access funds multiple times as long as you are within your Fuliza limit.\n" +
                "\n" +
                "Fuliza is available to all M-PESA customers, however the awarding of limits will depend on your credit viability and how long you have been using M-PESA. To repay your Fuliza simply deposit cash to your M-PESA or receive M-PESA and your Fuliza balance will be deducted automatically.\n" +
                "\n" +
                "To register for Fuliza simply dial *234# and select Fuliza. You need to be an M-PESA registered customers with an active Safaricom line.\n" +
                "\n" +
                "Keep transacting on M-PESA with Fuliza\n" +
                "\n" +
                "Dial *234# to Register");

        List<String> okoaStima=new ArrayList<>();
        okoaStima.add("You can now get electricity when you need it then later pay later! Okoa Stima allows you to borrow any amount based on your pre-determined credit limit. This limit is based on your historical relationship with Kenya Power. The loan comes at a facility fee of 10% and is payable in 7 days.\n" +
                "\n" +
                "Your M-PESA account will be deducted with amount of top plus facility fee so there is no delay.\n" +
                "\n" +
                "You will be able to register up to 3 meters and tokens purchased/Bill paid cannot be used on another meter except the 3 you have registered.\n" +
                "\n" +
                "To take advantage of this great service just dial *885# from your mobile phone.");

        listHash.put(listDataHeader.get(0),fuliza);
        listHash.put(listDataHeader.get(1),okoaStima);

    }

}



