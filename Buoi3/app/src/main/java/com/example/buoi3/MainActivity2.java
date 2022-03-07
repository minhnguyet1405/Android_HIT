package com.example.buoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tw1,tw2,tw3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String str1=intent.getStringExtra("edit1");
        String str2=intent.getStringExtra("edit2");
        tw1=findViewById(R.id.tw1);
        tw2=findViewById(R.id.tw2);
        tw3=findViewById(R.id.tw3);
    }
}