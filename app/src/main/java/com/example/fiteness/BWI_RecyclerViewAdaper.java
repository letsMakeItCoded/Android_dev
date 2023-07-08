package com.example.fiteness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BWI_RecyclerViewAdaper extends RecyclerView.Adapter<BWI_RecyclerViewAdaper.MyViewHolder>{


    Context context;
    ArrayList<BegWorkoutInterface> begWorkoutInterfaces;

    public BWI_RecyclerViewAdaper(Context context, ArrayList<BegWorkoutInterface> begWorkoutInterfaces){
        this.context = context;
        this.begWorkoutInterfaces = begWorkoutInterfaces;
    }

    @NonNull
    @Override
    public BWI_RecyclerViewAdaper.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.beg_workout, parent, false);
        return new BWI_RecyclerViewAdaper.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BWI_RecyclerViewAdaper.MyViewHolder holder, int position) {
        holder.begWorkFitName.setText(begWorkoutInterfaces.get(position).getFitnessName());
        holder.begWorkHow.setText(begWorkoutInterfaces.get(position).getFitnessTime());

    }

    @Override
    public int getItemCount() {
        return begWorkoutInterfaces.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView begWorkFitName;
        TextView begWorkHow;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            begWorkFitName = itemView.findViewById(R.id.fitName);
            begWorkHow = itemView.findViewById(R.id.How);
        }
    }
}
