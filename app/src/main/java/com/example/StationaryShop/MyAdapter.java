package com.example.StationaryShop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private ArrayList name,mobile,email,pass;
    private  ArrayList product,pquantity,pprice,equantiry,moileno,Email,address;

    public MyAdapter(Context context, ArrayList name, ArrayList mobile, ArrayList email, ArrayList pass) {
        this.context = context;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.pass = pass;
    }

    public MyAdapter(ArrayList product, ArrayList pquantity, ArrayList pprice, ArrayList equantiry, ArrayList moileno, ArrayList email, ArrayList address) {
        this.product = product;
        this.pquantity = pquantity;
        this.pprice = pprice;
        this.equantiry = equantiry;
        this.moileno = moileno;
        Email = email;
        this.address = address;
    }

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(context).inflate(R.layout.userentryr,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(String.valueOf(name.get(position)));
        holder.mobile.setText(String.valueOf(mobile.get(position)));
        holder.email.setText(String.valueOf(email.get(position)));
        holder.pass.setText(String.valueOf(pass.get(position)));
        holder.email.setText(String.valueOf(email.get(position)));
    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
         TextView name,mobile,email,pass;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.txtname);
            mobile=itemView.findViewById(R.id.txtmobile);
            email=itemView.findViewById(R.id.txtemail);
            pass=itemView.findViewById(R.id.txtpass);

        }
    }
}
