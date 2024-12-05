package com.example.StationaryShop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdaptercontact extends RecyclerView.Adapter<MyAdaptercontact.MyViewHolder> {

    private Context context;
    private ArrayList name,email,message;

    public MyAdaptercontact(Context context, ArrayList name,ArrayList email, ArrayList message) {
        this.context = context;
        this.name = name;
        this.email = email;
        this.message =message;
    }

    @NonNull
    @Override
    public MyAdaptercontact.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View vv= LayoutInflater.from(context).inflate(R.layout.userentryocontct,parent,false);
    return new MyViewHolder(vv);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdaptercontact.MyViewHolder holder, int position) {
        holder.name_id.setText(String.valueOf(name.get(position)));
        holder.email_id.setText(String.valueOf(email.get(position)));
        holder.message_id.setText(String.valueOf(message.get(position)));

    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name_id,email_id,message_id;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name_id=itemView.findViewById(R.id.txtname);
            email_id=itemView.findViewById(R.id.txtemail);
            message_id=itemView.findViewById(R.id.txtmessage);
        }
    }
}
