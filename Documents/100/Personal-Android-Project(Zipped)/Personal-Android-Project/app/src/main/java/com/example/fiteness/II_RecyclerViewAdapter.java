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

public class II_RecyclerViewAdapter extends RecyclerView.Adapter<II_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<IntIterfaceModel> intInterfaceModels;

    public II_RecyclerViewAdapter(Context context, ArrayList<IntIterfaceModel> intInterfaceModels){
        this.context = context;
        this.intInterfaceModels = intInterfaceModels;
    }

    @NonNull
    @Override
    public II_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.int_recycler_view, parent, false);
        return new II_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull II_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvIntFitName.setText(intInterfaceModels.get(position).getFitnessName());
        holder.intImageView.setImageResource(intInterfaceModels.get(position).getFitnessImage());

    }

    @Override
    public int getItemCount() {
        return intInterfaceModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView intImageView;
        TextView tvIntFitName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            intImageView = itemView.findViewById(R.id.intGymImage);
            tvIntFitName = itemView.findViewById(R.id.intFitnesName);
        }
    }
}
