package com.example.StationaryShop;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Contactuspage extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<String> name, email, message;
    DBHelperone db;
    MyAdaptercontact myAdapter;
    Button delete1, backButton;
    EditText EMAIL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedbackpage);

        db = new DBHelperone(this);

        name = new ArrayList<>();
        message = new ArrayList<>();
        email = new ArrayList<>();
        recyclerView = findViewById(R.id.recycleview);
        myAdapter = new MyAdaptercontact(this, name, email, message);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displaydata();

        EMAIL = findViewById(R.id.email1);
        delete1 = findViewById(R.id.b3);

        delete1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = EMAIL.getText().toString();
                Boolean checkudeletedata = db.delete1(Email);
                if (checkudeletedata) {
                    Toast.makeText(Contactuspage.this, "Data Deleted", Toast.LENGTH_SHORT).show();
                    refreshPage();
                } else {
                    Toast.makeText(Contactuspage.this, "Data Not found", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void displaydata() {
        Cursor cursor = db.getdata1();
        if (cursor.getCount() == 0) {
            Toast.makeText(Contactuspage.this, "No data", Toast.LENGTH_SHORT).show();
            return;
        } else {
            while (cursor.moveToNext()) {
                name.add(cursor.getString(0));
                email.add(cursor.getString(1));
                message.add(cursor.getString(2));
            }
        }
    }

    private void refreshPage() {
        name.clear();
        email.clear();
        message.clear();
        displaydata();
        myAdapter.notifyDataSetChanged();
    }
}
