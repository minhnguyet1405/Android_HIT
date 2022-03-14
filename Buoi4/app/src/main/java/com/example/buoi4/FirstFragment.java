package com.example.buoi4;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FirstFragment extends Fragment {


    EditText email,password;
    Button getData;
    ISendData iSendData;
    public interface ISendData{
        void sendData(String email,String password);
    };

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        iSendData= (ISendData) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);
        email=view.findViewById(R.id.edt_email);
        getData=view.findViewById(R.id.btn_send);
        password=view.findViewById(R.id.edt_pass);
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDatatoFram2();
                
            }
        });
        return view;
    }

    private void sendDatatoFram2() {
        String strEmail=email.getText().toString();
        String strPassword=password.getText().toString();
        iSendData.sendData(strEmail,strPassword);
    }
}