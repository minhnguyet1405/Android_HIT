package com.example.buoi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView name,phone,date,password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        date=findViewById(R.id.date);
        password=findViewById(R.id.password);
        btn=findViewById(R.id.btn);

        Intent getIntent= getIntent();
        String getName=getIntent.getStringExtra("NAME");
        String getPhone=getIntent.getStringExtra("PHONE");
        String getDay=getIntent.getStringExtra("DAY");
        String getMonth=getIntent.getStringExtra("MONTH");
        String getYear=getIntent.getStringExtra("YEAR");
        String getPassword=getIntent.getStringExtra("PASS");
        name.setText(getName);
        phone.setText(getPhone);
        date.setText(getDay+" / "+getMonth+" / "+getYear);
        password.setText(getPassword);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);


            }
        });

    }
}