package com.example.fiteness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    ArrayList<BegWorkoutInterface> begWorkoutInterfaces = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        RecyclerView recyclerView;
        recyclerView = findViewById(R.id.begWorkRecyclerView);

        setUpBegWorkInterfaceModels();
        BWI_RecyclerViewAdaper bwAdapter = new BWI_RecyclerViewAdaper(this, begWorkoutInterfaces);

        recyclerView.setAdapter(bwAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpBegWorkInterfaceModels(){
        String[] begWorkCategoryNames = getResources().getStringArray(R.array.workout_cat);
        String[] begWorkTimeCategoryNames = getResources().getStringArray(R.array.time_cat);

        for (int i = 0; i < begWorkCategoryNames.length; i++){
            begWorkoutInterfaces.add(new BegWorkoutInterface(begWorkCategoryNames[i], begWorkTimeCategoryNames[i]));
        }
    }
}