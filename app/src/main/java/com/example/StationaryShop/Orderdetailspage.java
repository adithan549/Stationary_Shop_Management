package com.example.StationaryShop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class Orderdetailspage extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String>pname,pquantity,pprice,equantity,mobile,email,address;
    DBHelperone db;
    MyAdapterone myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdetailspage);


        db=new DBHelperone(this);

        pname=new ArrayList<>();
        pquantity=new ArrayList<>();
        pprice=new ArrayList<>();
        equantity=new ArrayList<>();
        mobile=new ArrayList<>();
        email=new ArrayList<>();
        address=new ArrayList<>();
        recyclerView=findViewById(R.id.recycleview);
        myAdapter= new MyAdapterone(this,pname,pquantity,pprice,equantity,mobile,email,address);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displaydata();

           }

    private void displaydata() {
        Cursor cursor=db.getdata();
        if (cursor.getCount()==0)
        {
            Toast.makeText(Orderdetailspage.this, "No data", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            while (cursor.moveToNext())
            {
                pname.add(cursor.getString(0));
                pquantity.add(cursor.getString(1));
                pprice.add(cursor.getString(2));
                equantity.add(cursor.getString(3));
                mobile.add(cursor.getString(4));
                email.add(cursor.getString(5));
                address.add(cursor.getString(6));

            }
        }
    }
}