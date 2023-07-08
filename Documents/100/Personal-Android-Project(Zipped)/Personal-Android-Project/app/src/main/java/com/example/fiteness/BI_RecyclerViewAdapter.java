package com.example.fiteness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BI_RecyclerViewAdapter extends RecyclerView.Adapter<BI_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<BegInterfaceModel> begInterfaceModels;

    public BI_RecyclerViewAdapter(Context context, ArrayList<BegInterfaceModel> begInterfaceModels){
        this.context = context;
        this.begInterfaceModels = begInterfaceModels;
    }


    @NonNull
    @Override
    public BI_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.beg_recycler_view, parent, false);
        return new BI_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BI_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvBegFitName.setText(begInterfaceModels.get(position).getFitnessName());
        holder.begImageView.setImageResource(begInterfaceModels.get(position).getFitnessImage());

    }

    @Override
    public int getItemCount() {
        return begInterfaceModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView begImageView;
        TextView tvBegFitName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            begImageView = itemView.findViewById(R.id.gymImage);
            tvBegFitName = itemView.findViewById(R.id.fitnesName);
        }
    }
}
