package com.example.bai6;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn,btnPopup,btnPopupShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        this.registerForContextMenu(btn);

        btnPopup=findViewById(R.id.button2);
        btnPopupShow=findViewById(R.id.button3);
        btnPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onCreateContextMenu(ContextMenu menu, View view,ContextMenu.ContextMenuInfo contextMenuInfo){
        super.onCreateContextMenu(menu,view,contextMenuInfo);
        menu.setHeaderTitle("Context Menu");
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.layout_context_menu,menu);
    }
    public  void buttonClick(){
        PopupMenu popupMenu=new PopupMenu(this,btnPopupShow);
        popupMenu.inflate(R.menu.layout_popup_menu);
        Menu menu=popupMenu.getMenu();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }


            public boolean onMenuClick(MenuItem item){
                return onMenuItemClick(item);
            };


        });

        // Show the PopupMenu.
        popupMenu.show();
    }

}