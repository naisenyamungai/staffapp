package com.staff.staffapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.staff.staffapp.service.GeneralNewsServiceAPI;
import com.staff.staffapp.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsActivity extends AppCompatActivity {

    @BindView(R.id.newsListView) ListView mNewsList;
    @BindView(R.id.generalNewsButton) Button mgeneralNewsButton;
    @BindView(R.id.allNews) TextView mAllNews;

    private String[] news = new String[] {"Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, news);
        mNewsList.setAdapter(adapter);

        mNewsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(NewsActivity.this, NewsDetailsActivity.class);
                startActivity(intent);
            }
        });

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://apisafapp.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        final GeneralNewsServiceAPI service = retrofit.create(GeneralNewsServiceAPI.class);

        mgeneralNewsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<List> createCall = service.getAllGeneralNews();

            }

//            @Override
//            public void onFailure(Call<List> _, Throwable throwable) {
//                throwable.printStackTrace();
//                mAllNews.setText(throwable.getMessage());
//            }
        });
    }
}
