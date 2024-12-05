package com.example.StationaryShop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Adminpage extends AppCompatActivity {
    ImageView imag1,imag2,imag3,imag4,imag5,imag6,imag7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);
        imag2=findViewById(R.id.image2);
        imag3=findViewById(R.id.image11);
        imag1=findViewById(R.id.aa);
        imag4=findViewById(R.id.image12);
        imag5=findViewById(R.id.image24);
        imag6=findViewById(R.id.image15);
        imag7=findViewById(R.id.imagemenu);


        imag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Adminpage.this,Producttype.class);
                startActivity(i);
            }
        });
        imag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Adminpage.this,RegisterOrderdetails.class);
                startActivity(i);
            }
        });
        imag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Adminpage.this,DisplayPDFActivity.class);
                startActivity(i);
            }
        });
        imag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Adminpage.this,Registerdetails.class);
                startActivity(i);
            }
        });
        imag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Adminpage.this, Contactuspage.class);
                startActivity(i);
            }
        });
        imag6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Adminpage.this,Admindeliverydetails.class);
                startActivity(i);
            }
        });
        imag7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Logout Successfully...", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Adminpage.this,Login.class);
                refreshPage();
            }
        });

    }
    private void refreshPage() {
        Intent intent = getIntent();  // Get the current intent
        finish();  // Finish the current activity
        startActivity(intent);  // Restart the activity
    }
}
