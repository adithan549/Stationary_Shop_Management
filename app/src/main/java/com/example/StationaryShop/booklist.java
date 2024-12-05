package com.example.StationaryShop;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class booklist extends AppCompatActivity {
    ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, image13,
            image14, image15, image16, image17, image18, image19, image20, image21, image22, image23, image24, img6, image25, image26;
    LinearLayout layout1,layout2,lay3,lay4,lay5,lay6,lay7,lay8,lay9,lay10,lay11,lay12,lay13,lay14,lay15,lay16,lay17,lay18,lay19,lay20,lay28,lay22,lay23,lay24,lay25,lay26,lay29,lay30,lay31,lay32,lay33,lay34,lay35,lay36,lay37,lay38,lay39,lay40,lay41,lay42,lay43,lay44,lay45;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booklist);

        lay29=findViewById(R.id.i29);
        lay30=findViewById(R.id.i30);
        lay31=findViewById(R.id.i31);
        lay32=findViewById(R.id.i32);
        lay33=findViewById(R.id.i33);

        lay29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(booklist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tentamil, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(booklist.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std Tamil");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","$1800");
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
        lay30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(booklist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tenenglish, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(booklist.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std English");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","$1800");
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
        lay31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(booklist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tenmaths, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(booklist.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std English");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","$1800");
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
        lay32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(booklist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tenscience, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(booklist.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std Science");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","$1800");
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
        lay33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(booklist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tensocial, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(booklist.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std Social Science");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","$1800");
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