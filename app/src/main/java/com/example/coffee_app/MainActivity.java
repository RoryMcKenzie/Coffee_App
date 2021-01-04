package com.example.coffee_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton brew_timer = findViewById(R.id.brew_timer_button);
        brew_timer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityBrewTimer = new Intent(MainActivity.this, ActivityBrewTimer.class);
                startActivity(activityBrewTimer);
            }
        });

        ImageButton ratio_calculator = findViewById(R.id.ratio_calculator_button);
        ratio_calculator.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityRatioCalculator = new Intent(MainActivity.this, ActivityRatioCalculator.class);
                startActivity(activityRatioCalculator);
            }
        });
    }
}
