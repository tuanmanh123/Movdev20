package com.example.bai7;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    Button backBtn;String fullname,message;
    TextView text5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text5=findViewById(R.id.textView5);
        backBtn = findViewById(R.id.button2);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });

        Intent intent=this.getIntent();
        fullname=intent.getStringExtra("fullname");
        message=intent.getStringExtra("message");
        text5.setText(message);
    }
    public void goBack(){
        this.onBackPressed();
    }
    public void finish(){
        Intent data=new Intent();
        String feedback="OK,hello "+this.fullname+",How are you?";
        data.putExtra("feedback",feedback);
        this.setResult(Activity.RESULT_OK,data);
        super.finish();
    }


}