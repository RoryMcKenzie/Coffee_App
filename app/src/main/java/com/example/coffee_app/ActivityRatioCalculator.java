package com.example.coffee_app;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityRatioCalculator extends AppCompatActivity {
    EditText ratioNumber;
    EditText ratioCoffee;
    EditText ratioWater;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio_calculator);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Ratio Calculator");

        ratioNumber = findViewById(R.id.et_ratio);
        ratioNumber.setText("16");
        ratioCoffee = findViewById(R.id.et_ratio_coffee);
        ratioWater = findViewById(R.id.et_ratio_water);

        ratioCoffee.addTextChangedListener(textWatcher);
    }

    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if  (ratioCoffee.getText().length() != 0) {
                int num = Integer.parseInt(s.toString());
                String temp = ratioNumber.getText().toString();
                String temp2 = String.valueOf(num * Integer.parseInt(temp));
                ratioWater.setText(temp2);
            } else {
                ratioWater.setText("");
            }
        }
        @Override
        public void afterTextChanged(Editable s) {
        }
    };
}
