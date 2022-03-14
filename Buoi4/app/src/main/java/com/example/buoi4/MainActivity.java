package com.example.buoi4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FirstFragment.ISendData {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame1,new FirstFragment());
        fragmentTransaction.add(R.id.frame2,new SecondFragment());
        fragmentTransaction.commit();
    }


    @Override
    public void sendData(String email, String password) {
        SecondFragment secondFragment= (SecondFragment) getSupportFragmentManager().findFragmentById(R.id.frame2);
        secondFragment.receiveData(email,password);
    }
}