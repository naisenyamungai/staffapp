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
import com.staff.staffapp.model.SupportMedical;

import java.util.List;

public class SupportAdapter extends RecyclerView.Adapter<SupportAdapter.SupportViewHolder> {

    private List<SupportMedical> supportMedicals;
    private Context context;


    public SupportAdapter(List<SupportMedical> supportMedicals, Context context){
        this.supportMedicals = supportMedicals;
        this.context = context;
    }


    @NonNull
    @Override
    public SupportViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.support_services, null);
        return new SupportViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull SupportViewHolder holder, int position) {
        SupportMedical supportMedical = supportMedicals.get(position);
        holder.title.setText(supportMedical.getTitle());

//        holder.supportImage.setImageDrawable(context.getResources().getDrawable(supportMedical.getImage(), null));

    }

    @Override
    public int getItemCount() {

        return supportMedicals.size();
    }


    class SupportViewHolder extends RecyclerView.ViewHolder{

        TextView title;
//        ImageView supportImage;
        LinearLayout supportLinearLayout;

        public SupportViewHolder(View itemView){

            super(itemView);

            title = itemView.findViewById(R.id.title);
//            supportImage = itemView.findViewById(R.id.supportImage);
            supportLinearLayout = (LinearLayout) itemView.findViewById(R.id.supportLinearLayout);


        }

    }
}

