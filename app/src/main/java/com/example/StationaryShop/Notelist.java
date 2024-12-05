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

public class Notelist extends AppCompatActivity {
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
        setContentView(R.layout.notelist);
        layout1=findViewById(R.id.i1);
        layout2=findViewById(R.id.i2);
        lay3=findViewById(R.id.i3);
        lay4=findViewById(R.id.i4);
        lay5=findViewById(R.id.i5);
        lay6=findViewById(R.id.i6);
        lay7=findViewById(R.id.i7);
        lay8=findViewById(R.id.i8);
        lay9=findViewById(R.id.i9);
        lay10=findViewById(R.id.i10);


        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book1, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","ClassMate Notebook-unruled 172pages-240mm*180mm");
                                i.putExtra("quan","12");
                                i.putExtra("price","$1");
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
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book2, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","ClassMate Notebook-Ruled 140pages-297mm*210mm");
                                i.putExtra("quan","Pack 12");
                                i.putExtra("price","$612");
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
        lay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book3, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","ClassMate Notebook-Unruled 140pages-297mm*210mm");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","$720");
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
        lay4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book4, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","ClassMate Notebook-Ruled 172pages-240mm*180mm");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","$650");
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
        lay5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book5, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","Classmate Notebook Single Line 120 Pages 240 mm *180 mm");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","$432");
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
        lay6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book6, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","Classmate Notebook Single Line 120 Pages 240 mm *180 mm");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","$800");
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
        lay7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book7, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","Joy RECORD Notebook PRACTICAL NOTEBOOK SCIENCE ONE SIDE RULED LAB RECORD 22 x 28 cm - 176 pages ");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","$1700");
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
        lay8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book8, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","Classmate Itc Practical Notebook - Chemistry - 28 X 22 Cm, Hard Cover, Single Line ");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","$1200");
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
        lay9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book9, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","Classmate Pulse Notebook 267 X 203mm 160 Pages, Single Line, Wiro Binding, Multicolor");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","$2150");
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
        lay10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Notelist.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book10, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Notelist.this,Orderdetails.class);
                                i.putExtra("rice","DASM UNITED Set of 2 Combo Pack Anime Fans Series");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","$1200");
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