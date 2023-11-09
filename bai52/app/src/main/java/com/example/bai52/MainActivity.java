package com.example.bai52;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.widget.TabHost;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tab=(TabHost) findViewById(android.R.id.tabhost);
        tab.setup();

        TabHost.TabSpec spec;
        spec= tab.newTabSpec("tag1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("tag1");
        tab.addTab(spec);
        spec= tab.newTabSpec("tag2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("tag2");
        tab.addTab(spec);
        tab.setCurrentTab(0);
    }

}