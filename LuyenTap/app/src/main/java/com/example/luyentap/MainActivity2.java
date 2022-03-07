package com.example.luyentap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText edt;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edt=findViewById(R.id.edt);
        bt =findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();

                //khai báo làm gì đấy
                intent.setAction(Intent.ACTION_SEND);

                intent.setType("text/plain");


                intent.putExtra(Intent.EXTRA_TEXT, edt.getText());

                //khởi chạy
                startActivity(intent);
            }
        });
    }
}