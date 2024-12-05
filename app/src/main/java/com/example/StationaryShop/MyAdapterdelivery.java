package com.example.StationaryShop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapterdelivery extends RecyclerView.Adapter<MyAdapterdelivery.MyViewHolder> {

    private Context context;
    private ArrayList  productname,quality,price,deliveryurl;

    public MyAdapterdelivery(Context context, ArrayList  productname, ArrayList quality, ArrayList price,ArrayList deliveryurl) {
        this.context = context;
        this. productname =  productname;
        this.quality = quality;
        this.price =price;
        this.deliveryurl =deliveryurl;
    }

    @NonNull
    @Override
    public MyAdapterdelivery.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View vv= LayoutInflater.from(context).inflate(R.layout.userentrydelivery,parent,false);
    return new MyViewHolder(vv);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapterdelivery.MyViewHolder holder, int position) {
        holder. productname_id.setText(String.valueOf( productname.get(position)));
        holder.quality_id.setText(String.valueOf(quality.get(position)));
        holder.price_id.setText(String.valueOf(price.get(position)));
        holder.deliveryurl_id.setText(String.valueOf(deliveryurl.get(position)));

    }

    @Override
    public int getItemCount() {
        return productname.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView  productname_id,quality_id,price_id,deliveryurl_id;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            productname_id=itemView.findViewById(R.id.txtproductname);
            quality_id=itemView.findViewById(R.id.txtquality);
            price_id=itemView.findViewById(R.id.txtprice);
            deliveryurl_id=itemView.findViewById(R.id.txtdeliveryurl);
        }
    }
}
