package com.example.fiteness;

import android.content.Context;
import android.content.Intent;
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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int clickedPosition = holder.getAdapterPosition();

                Intent intent;
                switch (clickedPosition) {
                    case 0:
                        intent = new Intent(context, WorkOutDetails.class);
                        intent.putExtra("Work-out-name", begWorkoutInterfaces.get(clickedPosition).getFitnessName());
                        break;
                    case 1:
                        intent = new Intent(context, MainActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, MainActivity2.class);
                        break;
                    case 3:
                        intent = new Intent(context, Home_layout.class);
                        break;
                    default:
                        intent = new Intent(context, MainActivity3.class);
                        break;
                }
                context.startActivity(intent);

            }
        });

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
