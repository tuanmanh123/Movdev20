package com.example.bai9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView textView;
    public EditText editText;
    public Button button;public String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.edittext);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
                saveData();
            }

        });
        loadData();

    }

    public void saveData(){
        SharedPreferences sharedPreferences=getSharedPreferences("share_pref",0);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("text",textView.getText().toString());
        editor.commit();
    }
    public void loadData(){
        SharedPreferences sharedPreferences=getSharedPreferences("share_pref",0);
        text=sharedPreferences.getString("text","");
        textView.setText(text);
    }

}