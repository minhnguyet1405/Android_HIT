package com.example.buoi4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends Fragment {

    TextView getEmail,getpassword;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_second, container, false);
        getEmail=view.findViewById(R.id.tw_email);
        getpassword=view.findViewById(R.id.tw_password);

        return view;

    }
    public void receiveData(String email,String password){
        getEmail.setText(email);
        getpassword.setText(password);

    }
}