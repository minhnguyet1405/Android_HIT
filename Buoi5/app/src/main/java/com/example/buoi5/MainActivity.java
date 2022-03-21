package com.example.buoi5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private User_Adapter user_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recy);
        user_adapter= new User_Adapter(this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        user_adapter.setData(getListUser());
        recyclerView.setAdapter(user_adapter);
    }

    private List<User> getListUser() {
        List<User> list=new ArrayList<>();
        list.add(new User(R.drawable.hinh_01,"Pizza","Spicy Chiken Pizza","RS 300.00"));
        list.add(new User(R.drawable.hinh_02,"Burger","Beef Burger","RS 350.00"));
        list.add(new User(R.drawable.hinh_01,"Pizza","Chiken Pizza","RS 250.00"));
        list.add(new User(R.drawable.hinh_02,"Burger","Chicken Burger","RS 300.00"));
        list.add(new User(R.drawable.hinh_02,"Burger","Fish Burger","RS 310.00"));
        list.add(new User(R.drawable.hinh_04,"Mango","Mango juice","RS 200.00"));
        list.add(new User(R.drawable.hinh_02,"Burger","Chicken Burger","RS 300.00"));
        list.add(new User(R.drawable.hinh_02,"Burger","Fish Burger","RS 310.00"));
        list.add(new User(R.drawable.hinh_04,"Mango","Mango juice","RS 200.00"));
        return list;
    }
}