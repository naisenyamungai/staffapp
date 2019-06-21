package com.staff.staffapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LandingAdapter extends RecyclerView.Adapter<LandingViewHolder> {

    private Context mContext;
    private List<ProductLandingData> mDataList;

    public LandingAdapter(Context mContext, List<ProductLandingData> mDataList) {
        this.mContext = mContext;
        this.mDataList = mDataList;
    }

    @Override
    public LandingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row, parent, false);
        return new LandingViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final LandingViewHolder holder, int position) {
        holder.mTitle.setText(mDataList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}

class LandingViewHolder extends RecyclerView.ViewHolder{

    TextView mTitle;

    public LandingViewHolder(View itemView) {
        super(itemView);

        mTitle=itemView.findViewById(R.id.tvTitle);
    }
}
