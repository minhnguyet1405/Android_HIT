package com.example.buoi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText name2,phone2,pass2,repass,day,month,year;
    Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name2=findViewById(R.id.name2);
        phone2=findViewById(R.id.phone2);
        pass2=findViewById(R.id.pass2);
        repass=findViewById(R.id.repass);
        day=findViewById(R.id.day);
        month=findViewById(R.id.month);
        year=findViewById(R.id.year);
        sign_up=findViewById(R.id.sign_up);



        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("NAME",name2.getText().toString());
                intent.putExtra("PHONE",phone2.getText().toString());
                intent.putExtra("PASS",pass2.getText().toString());
                intent.putExtra("REPASS",repass.getText().toString());
                intent.putExtra("DAY",day.getText().toString());
                intent.putExtra("MONTH",month.getText().toString());
                intent.putExtra("YEAR",year.getText().toString());
                startActivity(intent);

            }
        });
    }
}