package com.example.bai7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.pm.PermissionInfoCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    TextView text3,text4;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage();
            }
        });
    }
    public void sendMessage(){
        editText=findViewById(R.id.editText);
        String fullname=editText.getText().toString();
        String message="Please say Hello to me";
        Intent intent =new Intent(this,secondActivity.class);
        intent.putExtra("fullname",fullname);
        intent.putExtra("message",message);
        this.startActivityForResult(intent,9);
    }
   protected void onActivityResult(int requestCode,int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
       text4=findViewById(R.id.textView4);
        if(resultCode== Activity.RESULT_OK && requestCode==9){
            String feedback=data.getStringExtra("feedback");
            text4.setText(feedback);

        }else{
            text4.setText("???");
        }
   }
}
