package com.staff.staffapp.faq;

import androidx.appcompat.app.AppCompatActivity;

import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.annotation.SuppressLint;
import android.os.Bundle;

import com.staff.staffapp.R;
import com.staff.staffapp.adapter.SpecialistsAdapter;
import com.staff.staffapp.model.SpecialistProvider;

import java.util.ArrayList;
import java.util.List;

public class MedicalProviders extends AppCompatActivity {

    ViewPager viewPager;
    SpecialistsAdapter specialistsAdapter;
    List<SpecialistProvider> specialistProviders;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_providers);

        specialistProviders = new ArrayList<>();
        specialistProviders.add(new SpecialistProvider("Nairobi"));
        specialistProviders.add(new SpecialistProvider("Nyanza / Rift"));
        specialistProviders.add(new SpecialistProvider("Coast"));
        specialistProviders.add(new SpecialistProvider("Eastern"));
        specialistProviders.add(new SpecialistProvider("Central"));
        specialistProviders.add(new SpecialistProvider("Central"));
        specialistProviders.add(new SpecialistProvider("Overseas"));



        specialistsAdapter = new SpecialistsAdapter(specialistProviders, this);

        viewPager = findViewById(R.id.specialist_view_pager);
        viewPager.setAdapter(specialistsAdapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.white)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (specialistsAdapter.getCount() -1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }

                else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
