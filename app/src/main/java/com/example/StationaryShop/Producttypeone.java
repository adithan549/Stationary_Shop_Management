package com.example.StationaryShop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Producttypeone extends AppCompatActivity {
ImageView image1,image2,image3,image4,image5,image6,image7,image8,image9,image10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producttypeone);
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttypeone.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book1, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttypeone.this,Orderdetails.class);
                                i.putExtra("rice","RICE");
                                i.putExtra("quan","1KG");
                                i.putExtra("price","$50");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();

            }

        });

    }
}