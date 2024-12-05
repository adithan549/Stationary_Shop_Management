package com.example.StationaryShop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class RegisterOrderdetails extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> pname, pquantity, pprice, equantity, mobile, email, address;
    DBHelperone db;
    MyAdapterone myAdapter;

    Button delete;  // Added refresh button
    EditText Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_orderdetails);

        // Initialize database and lists
        db = new DBHelperone(this);
        pname = new ArrayList<>();
        pquantity = new ArrayList<>();
        pprice = new ArrayList<>();
        equantity = new ArrayList<>();
        mobile = new ArrayList<>();
        email = new ArrayList<>();
        address = new ArrayList<>();

        // Set up RecyclerView
        recyclerView = findViewById(R.id.recycerview);
        myAdapter = new MyAdapterone(this, pname, pquantity, pprice, equantity, mobile, email, address);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Display data
        displaydata();

        // Initialize buttons
        delete = findViewById(R.id.b2);
        Email = findViewById(R.id.b3);  // Assuming this is the email EditText

        // Set up delete button listener
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString();
                Boolean checkudeletedata = db.delete(email);
                if (checkudeletedata == true) {
                    Toast.makeText(RegisterOrderdetails.this, "Data Deleted", Toast.LENGTH_SHORT).show();
                    refreshPage();  // Refresh the page after deletion
                } else {
                    Toast.makeText(RegisterOrderdetails.this, "Data Not Deleted", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void displaydata() {
        Cursor cursor = db.getdata();
        if (cursor.getCount() == 0) {
            Toast.makeText(RegisterOrderdetails.this, "No data", Toast.LENGTH_SHORT).show();
            return;
        } else {
            while (cursor.moveToNext()) {
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

    // Function to refresh the current activity
    private void refreshPage() {
        Intent intent = getIntent();  // Get the current intent
        finish();  // Finish the current activity
        startActivity(intent);  // Restart the activity
    }
}
