package com.example.bai8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.app.SearchManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button implicit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        implicit_btn=findViewById(R.id.button);


        implicit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                broadcast();
                Intent myActivity=new Intent(Intent.ACTION_WEB_SEARCH);
                myActivity.putExtra(SearchManager.QUERY,"facebook");
                startActivity(myActivity);
            }
        });


    }
    public void broadcast(){ Intent intent=new Intent("com.example.ACTION_MY_EVENT");
        intent.putExtra("message","hello,this is broadcast");
        MyBroadcastReceiver receiver=new MyBroadcastReceiver();
        IntentFilter intentFilter=new IntentFilter("com.example.ACTION_MY_EVENT");
        registerReceiver(receiver,intentFilter);
        sendBroadcast(intent);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);}
}