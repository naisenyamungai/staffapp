package com.staff.staffapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.staff.staffapp.R;
import com.staff.staffapp.model.SpecialistProvider;

import java.util.List;

public class SpecialistsAdapter extends RecyclerView.Adapter<SpecialistsAdapter.SpecialistViewHolder> {

    private List<SpecialistProvider> specialistProviders;
    private Context context;


    public SpecialistsAdapter(List<SpecialistProvider> specialistProviders, Context context){
        this.specialistProviders = specialistProviders;
        this.context = context;
    }


    @NonNull
    @Override
    public SpecialistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater inflater = LayoutInflater.from(context);
       View view = inflater.inflate(R.layout.specialists, null);

// The below is the longer version of the return statement
//       SpecialistViewHolder holder = new SpecialistViewHolder(view);
//       return holder;

       return new SpecialistViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SpecialistViewHolder holder, int position) {
        SpecialistProvider specialistProvider = specialistProviders.get(position);

        holder.title.setText(specialistProvider.getTitle());
        holder.specialistImage.setImageDrawable(context.getResources().getDrawable(specialistProvider.getImage(), null));
    }

    @Override
    public int getItemCount() {
        return specialistProviders.size();
    }

   class SpecialistViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        LinearLayout specialistLinearLayout;
        ImageView specialistImage;

        public SpecialistViewHolder(View itemView){

            super(itemView);

            title = itemView.findViewById(R.id.title);
            specialistLinearLayout = (LinearLayout) itemView.findViewById(R.id.specialistLinearLayout);
            specialistImage = itemView.findViewById(R.id.specialistImage);

        }

    }
}



