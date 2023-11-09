package com.example.bai4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    NumberPicker numberPicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberPicker=findViewById(R.id.numberPicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(999);

    }

}