package com.example.coffee_app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityRatioCalculator extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio_calculator);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Ratio Calculator");
        EditText ratioNumber = findViewById(R.id.ratioNumber);
        ratioNumber.setText("16");
    }
}
