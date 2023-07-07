package com.example.fiteness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    ArrayList<AdvInterfaceModel> advInterfaceModels = new ArrayList<>();
    int[] advInterfaceImages = {R.drawable.img_2, R.drawable.img_1, R.drawable.img_12, R.drawable.img_11, R.drawable.img_14};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.menu_item1) {
                Toast.makeText(this, "Nice one there", Toast.LENGTH_LONG).show();
            } else if (itemId == R.id.menu_item2) {// Handle menu item 2 selection
                // Add more cases for other menu items if needed
            }
            return true;
        });


        RecyclerView recyclerView = findViewById(R.id.advRecyclerView);

        setUpAdvInterfaceModels();
        AI_RecyclerViewAdapter advAdapter = new AI_RecyclerViewAdapter(this, advInterfaceModels);

        recyclerView.setAdapter(advAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setUpAdvInterfaceModels(){
        String[] advCategoryNames = getResources().getStringArray(R.array.beginner_cat);

        for (int i = 0; i < advCategoryNames.length; i++){
            advInterfaceModels.add(new AdvInterfaceModel(advCategoryNames[i], advInterfaceImages[i]));
        }
    }


}
