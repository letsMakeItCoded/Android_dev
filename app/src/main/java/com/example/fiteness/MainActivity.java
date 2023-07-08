package com.example.fiteness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{

    ArrayList<BegInterfaceModel> begInterfaceModels = new ArrayList<>();

    int[] begInterfaceImages = {R.drawable.img_6, R.drawable.img_7, R.drawable.img, R.drawable.img_4, R.drawable.img_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.menu_item1) {
                Intent intent = new Intent(MainActivity.this, Home_layout.class);
                startActivity(intent);
            } else if (itemId == R.id.menu_item2) {// Handle menu item 2 selection
                // Add more cases for other menu items if needed
            }
            return true;
        });

        RecyclerView recyclerView = findViewById(R.id.begRecyclerView);

        setUpBegInterfaceModels();
        BI_RecyclerViewAdapter begAdapter = new BI_RecyclerViewAdapter(this, begInterfaceModels);

        recyclerView.setAdapter(begAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpBegInterfaceModels(){
        String[] begCategoryNames = getResources().getStringArray(R.array.beginner_cat);

        for (int i = 0; i < begCategoryNames.length; i++){
            begInterfaceModels.add(new BegInterfaceModel(begCategoryNames[i], begInterfaceImages[i]));
        }
    }
}