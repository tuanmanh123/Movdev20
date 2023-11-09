package com.example.bai5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DateFormat dateFormat=DateFormat.getDateInstance();
        Calendar calendar=Calendar.getInstance();
        DatePickerDialog.OnDateSetListener d= (datePicker, year, month, day) -> {
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,month);
            calendar.set(Calendar.DAY_OF_MONTH,day);

        };
        TimePickerDialog.OnTimeSetListener t=(timepicker, hour, minutes)->{
            calendar.set(Calendar.HOUR,hour);
            calendar.set(Calendar.MINUTE,minutes);
        };

        Button btnGetDay,btnGetHour;


            btnGetDay=(Button)findViewById(R.id.button);
            btnGetDay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new DatePickerDialog(MainActivity.this,
                            d,
                            calendar.get(Calendar.YEAR),
                            calendar.get(Calendar.MONTH),
                            calendar.get(Calendar.DAY_OF_MONTH)).show();
                }
            });

            btnGetHour=(Button) findViewById(R.id.button2);
            btnGetHour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    new TimePickerDialog(MainActivity.this, t,
                            calendar.get(Calendar.HOUR),
                            calendar.get(Calendar.MINUTE),true).show();
                }
                });
            };


        }


