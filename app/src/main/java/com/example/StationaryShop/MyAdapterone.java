package com.example.StationaryShop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapterone extends RecyclerView.Adapter<MyAdapterone.MyViewHolder> {

    private Context context;
    private ArrayList pname,pquantity,pprice,equantity,mobile,email,address;

    public MyAdapterone(Context context, ArrayList pname, ArrayList pquantity, ArrayList pprice, ArrayList equantity, ArrayList mobile, ArrayList email, ArrayList address) {
        this.context = context;
        this.pname = pname;
        this.pquantity = pquantity;
        this.pprice = pprice;
        this.equantity = equantity;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    @NonNull
    @Override
    public MyAdapterone.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.userentryo,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterone.MyViewHolder holder, int position) {
        holder.pname_id.setText(String.valueOf(pname.get(position)));
        holder.pquantity_id.setText(String.valueOf(pquantity.get(position)));
        holder.pprice_id.setText(String.valueOf(pprice.get(position)));
        holder.equantity_id.setText(String.valueOf(equantity.get(position)));
        holder.mobile_id.setText(String.valueOf(mobile.get(position)));
        holder.email_id.setText(String.valueOf(email.get(position)));
        holder.address_id.setText(String.valueOf(address.get(position)));

    }

    @Override
    public int getItemCount() {
        return pname.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView pname_id,pquantity_id,pprice_id,equantity_id,mobile_id,email_id,address_id;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            pname_id=itemView.findViewById(R.id.txtpname);
            pquantity_id=itemView.findViewById(R.id.txtpquantity);
            pprice_id=itemView.findViewById(R.id.txtprice);
            equantity_id=itemView.findViewById(R.id.txtequantity);
            mobile_id=itemView.findViewById(R.id.txtmobile);
            email_id=itemView.findViewById(R.id.txtemail);
            address_id=itemView.findViewById(R.id.txtaddress);


        }
    }
}
