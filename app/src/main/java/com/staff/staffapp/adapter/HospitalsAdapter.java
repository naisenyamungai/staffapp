package com.staff.staffapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.staff.staffapp.R;

import com.staff.staffapp.model.HospitalProvider;

import java.util.List;

public class HospitalsAdapter extends RecyclerView.Adapter<HospitalsAdapter.HospitalViewHolder> {

    private List<HospitalProvider> hospitalProviders;
    private Context context;

    public HospitalsAdapter(List<HospitalProvider> hospitalProviders, Context context) {
        this.hospitalProviders = hospitalProviders;
        this.context = context;
    }



    @NonNull
    @Override
    public HospitalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.hospitals, null);
        return new HospitalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HospitalViewHolder holder, int position) {
        HospitalProvider hospitalProvider = hospitalProviders.get(position);

        holder.title.setText(hospitalProvider.getTitle());
    }

    @Override
    public int getItemCount() {
        return hospitalProviders.size();
    }


    class HospitalViewHolder extends RecyclerView.ViewHolder{

        TextView title;

        public HospitalViewHolder(View itemView){

            super(itemView);

            title = itemView.findViewById(R.id.title);

        }

    }
}

