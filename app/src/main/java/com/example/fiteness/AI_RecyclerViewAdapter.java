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

public class AI_RecyclerViewAdapter extends RecyclerView.Adapter<AI_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<AdvInterfaceModel> advInterfaceModels;

    public AI_RecyclerViewAdapter(Context context, ArrayList<AdvInterfaceModel> advInterfaceModels){
        this.context = context;
        this.advInterfaceModels = advInterfaceModels;
    }

    @NonNull
    @Override
    public AI_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.adv_recycler_view, parent, false);
        return new AI_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AI_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvAdvFitName.setText(advInterfaceModels.get(position).getFitnessName());
        holder.advImageView.setImageResource(advInterfaceModels.get(position).getFitnessImage());

    }

    @Override
    public int getItemCount() {
        return advInterfaceModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView advImageView;
        TextView tvAdvFitName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            advImageView = itemView.findViewById(R.id.advGymImage);
            tvAdvFitName = itemView.findViewById(R.id.advFitnesName);
        }
    }
}
