package com.example.StationaryShop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Admindeliverydetails extends AppCompatActivity {
    EditText productname,quality,price,deliveryurl;
    Button sendme;
    DBHelperone db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindeliveryfile);
        productname=findViewById(R.id.productname);
        quality=findViewById(R.id.quality);
        price=findViewById(R.id.price);
        deliveryurl=findViewById(R.id.deliveryurl);
        sendme=findViewById(R.id.sendme);
        db=new DBHelperone(this);

        sendme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!productname.getText().toString().equals("")) && (!quality.getText().toString().equals("")) && (!price.getText().toString().equals(""))&& (!deliveryurl.getText().toString().equals("")))
                {
                    String NAME=productname.getText().toString();
                    String QUALITY=quality.getText().toString();
                    String PRICE=price.getText().toString();
                    String DELIVERYURL=deliveryurl.getText().toString();
                    db.adddev(NAME,QUALITY,PRICE,DELIVERYURL);
                    Toast.makeText(Admindeliverydetails.this, "Data inserted Successfully...", Toast.LENGTH_SHORT).show();
                    refreshPage();
                    productname.setText("");
                    quality.setText("");
                    price.setText("");
                    deliveryurl.setText("");

                }
                else {
                    Toast.makeText(Admindeliverydetails.this, "Please Enter All The Data...", Toast.LENGTH_SHORT).show();
                }

            }
        });

           }
 private void refreshPage() {
    Intent intent = getIntent();  // Get the current intent
    finish();  // Finish the current activity
    startActivity(intent);  // Restart the activity
}
}