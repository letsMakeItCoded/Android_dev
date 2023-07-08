package com.example.fiteness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WorkOutDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_out_details);

        String name = getIntent().getStringExtra("Work-out-name");

        TextView nameTextView = findViewById(R.id.textView2);
        nameTextView.setText(name);
    }
}