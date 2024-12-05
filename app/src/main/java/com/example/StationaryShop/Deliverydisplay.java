package com.example.StationaryShop;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Deliverydisplay extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> productname, quality, price, deliveryurl;
    DBHelperone db;
    MyAdapterdelivery myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);


        db = new DBHelperone(this);

        productname = new ArrayList<>();
        price = new ArrayList<>();
        quality = new ArrayList<>();
        deliveryurl = new ArrayList<>();
        recyclerView = findViewById(R.id.recycleview);
        myAdapter = new MyAdapterdelivery(this, productname, quality, price, deliveryurl);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displaydata();

    }

    private void displaydata() {
        Cursor cursor = db.getdata2();
        if (cursor.getCount() == 0) {
            Toast.makeText(Deliverydisplay.this, "No data", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            while (cursor.moveToNext()) {
                productname.add(cursor.getString(0));
                quality.add(cursor.getString(1));
                price.add(cursor.getString(2));
                deliveryurl.add(cursor.getString(3));

            }
        }
    }
}
