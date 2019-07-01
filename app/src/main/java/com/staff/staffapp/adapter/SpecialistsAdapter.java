package com.staff.staffapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.staff.staffapp.R;
import com.staff.staffapp.faq.Nairobi;

import com.staff.staffapp.model.SpecialistProvider;

import java.util.List;

public class SpecialistsAdapter extends PagerAdapter {
    private List<SpecialistProvider> specialistProviders;
    private LayoutInflater layoutInflater;
    private Context context;


    public SpecialistsAdapter(List<SpecialistProvider> specialistProviders, Context context){
        this.specialistProviders = specialistProviders;
        this.context = context;
    }


    @Override
    public int getCount() {
        return specialistProviders.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position){
       layoutInflater = LayoutInflater.from(context);
       View view = layoutInflater.inflate(R.layout.specialists, container, false);

        TextView title;

        title = view.findViewById(R.id.title);

        title.setText(specialistProviders.get(position).getTitle());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Nairobi.class);
                intent.putExtra("param", specialistProviders.get(position).getTitle());
                context.startActivity(intent);
                // finish();
            }
    });

container.addView(view, 0);
return view;
}

@Override
public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object){
   container.removeView((View)object);
}

}
