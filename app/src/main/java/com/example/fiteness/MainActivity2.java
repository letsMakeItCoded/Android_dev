package com.example.fiteness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<IntIterfaceModel> intIterfaceModels = new ArrayList<>();
    int[] intInterfaceImages = {R.drawable.img_10, R.drawable.img_13, R.drawable.img, R.drawable.img_4, R.drawable.img_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.menu_item1) {
                Intent intent = new Intent(MainActivity2.this, Home_layout.class);
                startActivity(intent);
            } else if (itemId == R.id.menu_item2) {// Handle menu item 2 selection
                // Add more cases for other menu items if needed
            }
            return true;
        });

        RecyclerView recyclerView = findViewById(R.id.intRecyclerView);

        setUpIntInterfaceModels();
        II_RecyclerViewAdapter intAdapter = new II_RecyclerViewAdapter(this, intIterfaceModels);

        recyclerView.setAdapter(intAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setUpIntInterfaceModels(){
        String[] intCategoryNames = getResources().getStringArray(R.array.beginner_cat);

        for (int i = 0; i < intCategoryNames.length; i++){
            intIterfaceModels.add(new IntIterfaceModel(intCategoryNames[i], intInterfaceImages[i]));
        }
    }
}