package com.example.buoi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView email3,password3;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        email3=findViewById(R.id.email3);
        password3=findViewById(R.id.password3);
        btn3=findViewById(R.id.btn3);

        Intent getIntent4= getIntent();
        String getEmail3=getIntent4.getStringExtra("EMAIL");
        String getPassword3=getIntent4.getStringExtra("PASS");
        email3.setText(getEmail3);
        password3.setText(getPassword3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(MainActivity4.this,MainActivity.class);
                startActivity(intent4);
            }
        });
    }
}