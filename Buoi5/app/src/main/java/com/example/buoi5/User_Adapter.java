package com.example.buoi5;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class User_Adapter extends RecyclerView.Adapter<User_Adapter.ViewHolder> {
    Context mContext;
    private List<User> userList;

    public User_Adapter(Context mContext) {
        this.mContext = mContext;

    }
    public void setData(List<User> list){
        this.userList=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recy,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user=userList.get(position);
        if(user==null)
            return;
        holder.imageView.setImageResource(user.getResourceid());
        holder.nameuser.setText(user.getName());
        holder.typeuser.setText(user.getType());
        holder.priceuser.setText(user.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.itemView.setBackgroundColor(Color.parseColor("#F2C0E5"));
            }
        });
    }

    @Override
    public int getItemCount() {
        if(userList!=null)
            return userList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameuser,typeuser,priceuser;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.img);
            nameuser=itemView.findViewById(R.id.name);
            typeuser=itemView.findViewById(R.id.type);
            priceuser=itemView.findViewById(R.id.price);
        }
    }
}
