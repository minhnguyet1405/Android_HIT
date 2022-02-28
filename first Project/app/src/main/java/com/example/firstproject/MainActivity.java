package com.example.firstproject;

import static java.lang.Math.sqrt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView zero, one, two, three, four, five, six,seven, eight, nine;
    TextView bang, dot, c, ce,delete;
    TextView cong, tru, nhan,phantram;
    TextView stringRes, res;
    ImageButton chia,can,mu,chiaX;
    String tinhtoan;
    String pheptinh;
    double so1, so2, kq;
    boolean checkBang = false, checkDot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stringRes.setText("");
                res.setText("");
                tinhtoan = "";
                pheptinh = "";
                checkBang = false;
                checkDot = false;
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan + "0");
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan + "1");
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan+"2");
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan + "3");
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan + "4");
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan + "5");
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan + "6");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan + "7");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan + "8");
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    tinhtoan = res.getText().toString();
                    res.setText(tinhtoan + "9");
                }
            }
        });
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText() == "") {
                    so1 = 0;
                    stringRes.setText("0 + ");
                } else {
                    so1 = Double.parseDouble(res.getText() + "");
                    stringRes.setText(res.getText().toString() + " + ");
                }
                res.setText("");
                tinhtoan = "";
                pheptinh = "+";
                checkBang = false;
                checkDot = false;
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText() == "") {
                    so1 = 0;
                    stringRes.setText("0 - ");
                } else {
                    so1 = Double.parseDouble(res.getText() + "");
                    stringRes.setText(res.getText().toString() + " - ");
                }
                res.setText("");
                tinhtoan = "";
                pheptinh = "-";
                checkBang = false;
                checkDot = false;
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText() == "") {
                    so1 = 0;
                    stringRes.setText("0 x ");
                } else {
                    so1 = Double.parseDouble(res.getText() + "");
                    stringRes.setText(res.getText().toString() + " x ");
                }
                res.setText("");
                tinhtoan = "";
                pheptinh = "x";
                checkBang = false;
                checkDot = false;
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText() == "") {
                    so1 = 0;
                    stringRes.setText("0 / ");
                } else {
                    so1 = Double.parseDouble(res.getText() + "");
                    stringRes.setText(res.getText().toString() + " / ");
                }
                res.setText("");
                tinhtoan = "";
                pheptinh = "/";
                checkBang = false;
                checkDot = false;
            }
        });
        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText() == "") {
                    so1 = 0;
                    stringRes.setText("");
                } else {
                    so1 = Double.parseDouble(res.getText() + "");
                    stringRes.setText(res.getText().toString() + " ^2 ");
                }
                res.setText("");
                tinhtoan = "";
                pheptinh = "^";
                kq=so1*so1;
                checkBang = false;
                checkDot = false;
                res.setText(kq+"");
            }
        });
        can.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText() == "") {
                    so1 = 0;
                    stringRes.setText("");
                } else {
                    so1 = Double.parseDouble(res.getText() + "");
                    stringRes.setText("can " + res.getText().toString() );
                }
                res.setText("");
                tinhtoan = "";
                pheptinh = "can";
                kq=sqrt(so1);
                checkBang = false;
                checkDot = false;
                res.setText(kq+"");
            }
        });
        chiaX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText() == "") {
                    so1 = 0;
                    stringRes.setText("");
                } else {
                    so1 = Double.parseDouble(res.getText() + "");
                    stringRes.setText(res.getText().toString() + " / x");
                }
                res.setText("");
                tinhtoan = "";
                pheptinh = "^";
                kq=1.0/so1;
                checkBang = false;
                checkDot = false;
                res.setText(kq+"");
            }
        });
        phantram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (res.getText() == "") {
                    so1 = 0;
                    stringRes.setText("");
                } else {
                    so1 = Double.parseDouble(res.getText() + "");
                    stringRes.setText(res.getText().toString() + " % ");
                }
                res.setText("");
                tinhtoan = "";
                pheptinh = "%";
                kq=so1*100;
                checkBang = false;
                checkDot = false;
                res.setText(kq+"");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    if(!checkDot){
                        tinhtoan=res.getText().toString();
                        res.setText(tinhtoan+".");
                        checkDot=true;
                    }
                }
            }
        });
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    String val=res.getText().toString();
                    if(!val.isEmpty()){
                        val=val.substring(0,val.length()-1);
                        res.setText(val);
                    }
                }
            }
        });
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!checkBang) {
                    checkDot = false;
                    tinhtoan = res.getText().toString();
                    so2 = Double.parseDouble(res.getText() + "");
                    stringRes.setText(stringRes.getText().toString() + res.getText().toString() + "");
                    res.setText("");
                    if (pheptinh == "+") {
                        kq = so1 + so2;
                    } else if (pheptinh == "-") {
                        kq = so1 - so2;
                    } else if (pheptinh == "x") {
                        kq = so1 * so2;
                    } else if (pheptinh == "/") {
                        kq = so1 / so2;
                    }
                    checkBang = true;
                    res.setText(kq + "");
                }
                pheptinh = "";
            }
        });

    }


    private void init() {
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        dot=findViewById(R.id.dot);
        c = findViewById(R.id.c);
        ce = findViewById(R.id.ce);
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);
        mu=findViewById(R.id.mu);
        can=findViewById(R.id.can);
        chiaX=findViewById(R.id.chiaX);
        phantram=findViewById(R.id.phantram);
        bang = findViewById(R.id.bang);
        res = findViewById(R.id.res);
        stringRes = findViewById(R.id.stringRes);


    }

}