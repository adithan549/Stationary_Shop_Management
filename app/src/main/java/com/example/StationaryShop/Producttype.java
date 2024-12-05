package com.example.StationaryShop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Producttype extends AppCompatActivity {
    ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, image13,
            image14, image15, image16, image17, image18, image19, image20, image21, image22, image23, image24, img6, image25, image26;
    LinearLayout layout1,layout2,lay3,lay4,lay5,lay6,lay7,lay8,lay9,lay10,lay11,lay12,lay13,lay14,lay15,lay16,lay17,lay18,lay19,lay20,lay28,lay22,lay23,lay24,lay25,lay26,lay29,lay30,lay31,lay32,lay33,lay34,lay35,lay36,lay37,lay38,lay39,lay40,lay41,lay42,lay43,lay44,lay45;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menuhome1) {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Producttype.this, MainActivity2.class);
            startActivity(i);
        }
        if (id == R.id.product1) {
            Toast.makeText(this, "product", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Producttype.this, Producttype.class);
            startActivity(i);
        }
        if (id == R.id.about1) {
            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Producttype.this, Aboutus.class);
            startActivity(i);
        }
        if (id == R.id.contact1) {
            Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Producttype.this, Contactus.class);
            startActivity(i);
        }
        if (id == R.id.logout) {
            Toast.makeText(this, "Account", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Producttype.this, Login.class);
            startActivity(i);
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producttype);
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
        lay11=findViewById(R.id.i11);
        lay12=findViewById(R.id.i12);
        lay13=findViewById(R.id.i13);
        lay14=findViewById(R.id.i14);
        lay15=findViewById(R.id.i15);
        lay16=findViewById(R.id.i16);
        lay17=findViewById(R.id.i17);
        lay18=findViewById(R.id.i18);
        lay19=findViewById(R.id.i19);
        lay20=findViewById(R.id.i20);
        lay22=findViewById(R.id.i22);
        lay23=findViewById(R.id.i23);
        lay24=findViewById(R.id.i24);
        lay25=findViewById(R.id.i25);
        img6=findViewById(R.id.imageView6);
        lay26=findViewById(R.id.i26);
        lay28=findViewById(R.id.i28);
        lay29=findViewById(R.id.i29);
        lay30=findViewById(R.id.i30);
        lay31=findViewById(R.id.i31);
        lay32=findViewById(R.id.i32);
        lay33=findViewById(R.id.i33);
        lay34=findViewById(R.id.i34);
        lay35=findViewById(R.id.i35);
        lay36=findViewById(R.id.i36);
        lay37=findViewById(R.id.i37);
        lay38=findViewById(R.id.i38);





        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book1, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","ClassMate Notebook-unruled 172pages-240mm*180mm");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹500");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book2, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","ClassMate Notebook-Ruled 140pages-297mm*210mm");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹612");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book3, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","ClassMate Notebook-Unruled 140pages-297mm*210mm");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹720");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book4, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","ClassMate Notebook-Ruled 172pages-240mm*180mm");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹650");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book5, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Classmate Notebook Single Line 120 Pages 240 mm *180 mm");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹432");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book6, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Classmate Notebook Single Line 120 Pages 240 mm *180 mm");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹800");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book7, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Joy RECORD Notebook PRACTICAL NOTEBOOK SCIENCE ONE SIDE RULED LAB RECORD 22 x 28 cm - 176 pages ");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","₹1700");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book8, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Classmate Itc Practical Notebook - Chemistry - 28 X 22 Cm, Hard Cover, Single Line ");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","₹1200");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book9, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Classmate Pulse Notebook 267 X 203mm 160 Pages, Single Line, Wiro Binding, Multicolor");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","₹2150");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.book10, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","DASM UNITED Set of 2 Combo Pack Anime Fans Series");
                                i.putExtra("quan","Pack-12");
                                i.putExtra("price","₹1200");
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
        lay11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pencil1, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","BRUSTRO Mechanical Pencil Set | HB-20 leads, 2B-20 leads, Spare eraser- 8 units|Tip size- 0.5 mm |Ideal for Students,Adults, Home,School,Office,Stationery Use |Writing, Sketching, Drawing, Mandala Art");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹300");
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
        lay12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pencil2, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","THE CUBBY CART Infinty Pencil (4 Pcs) (Multicolor)");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹400");
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
        lay13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pen4, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Success Stationery Hero Pen Original Fountain Ink Pen Smooth Iridium Tip Nib Refillable Gold Arrow Pattern Model 329 Silver Trim Cap Black Green Maroon");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹2100");
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
        lay14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pen3, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Reynolds LUMINO GEL Pen SET - 50 PENS (45 BLUE 5 BLACK) | PENS WITH COMFORTABLE GRIP | GEL PENS FOR WRITING | PEN FOR STUDENTS & OFFICE STATIONERY | 0.5 mm TIP SIZE");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹3600");
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
        lay17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pen5, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Pentonic 0.7mm Ball Point Pen Blister Pack | Black Body | Black & Blue Ink | Set of 10 Pens");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹240");
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
        lay18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pen6, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Hauser XO 0.7mm Ball Pen Box Pack | Sleek Body & Minimalistic Design | Matt Finish & Solid Body Type | Low Viscosity Ink With Ultra Durable Tip | Blue Ink, Pack of 10 Pens");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹840");
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
        lay15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pen7, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Parker Classic Matte Black Gold Trim Ball Pen| Ink Color - Blue | Unique Gift For Employees | Leading Pen For Corporate");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹4800");
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
        lay16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pencil3, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Nataraj 621 Pencils-Pack Of 10|Multicolor");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹540    ");
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
        lay19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pencil4, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Apsara Absolute Extra Dark Pencils-Pack Of 10|Black");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹720");
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
        lay20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.pencil5, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Camlin Kokuyo Supreme Writing And Drawing Pencil, Pack Of 10, Black");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹480");
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
        lay22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.gift1, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Artistic Gifts 3D Illusion Personalized LED Table Lamp for Couples| Customized Name Night Lamp for Wedding Marriage Anniversary| Wedding Return Couple Gift for Friend, Parents, Wife, Husband. Design 3");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹1200");
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
        lay23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.gift2, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","CPENSUS Moving Sand Art Picture Glass Liquid Painting 3D Natural Landscape showpieces for Home Decor Antique Gifts for Kids Office Desktop Decoration Desk Table Decorative Items");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹4800");
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
        lay24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.gift3, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","ORORANY Forever Rose Gift For Her, Galaxy Glass Rose Flower And Butterfly With Led Light Great Gift Ideas For Valentine'S Day, Mother'S Day, Birthday, Anniversary, Engagement");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹4800");
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
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Producttype.this, MainActivity2.class);
                startActivity(i);
            }
        });
        lay26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.gift5, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","One94Store Panda Night Light for Kids- Rechargeable Silicone LED Lamp, 7-Color Changing, Perfect Room Decor & Gift for Toddler, Children, Teens- Cute Valentine's Day Present (Close Eye), Sandal");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹8400");
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
        lay25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.gift4, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","CraftVatika Golden Handcrafted Palm Buddha Idol for Home,Office and Gifts - Palm Buddha Hand Statues for Living Room Mandir Pooja Room Living Room Diwali Decor");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹1200");
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
        lay28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.gift6, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","INTERNATIONAL GIFT® Silver Laxmi Ganesh Sarswati Idol Statue Oxidized Finish with Red Velvet Box Packing with Beautiful Carry Bag (14 cm X 25 cm X 5 cm)");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹12000");
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
        lay29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tentamil, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std Tamil");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹1800");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tenenglish, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std English");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹1800");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tenmaths, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std English");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹1800");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tenscience, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std Science");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹1800");
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
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.tensocial, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Tamil Nadu Textbook For 10th Std Social Science");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹1800");
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
        lay34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.suratamilten, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Sura 10th Std Tamil Guide 2023-2024");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹3580");
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
        lay35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.suraenglishten, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Sura 10th Std English Guide 2023-2024");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹3580");
                                startActivity(i);
                            }
                        });
                dialog.setNegativeButton("cancel",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"cancel is clicked",Toast.LENGTH_LONG).show();
                    }
                });
                AlertDialog alertDialog=dialog.create();
                alertDialog.show();
            }
        });
        lay36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.suramathsten, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Sura 10th Std Maths Guide 2023-2024");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹3580");
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
        lay37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.surascienceten, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Sura 10th Std Science Guide 2023-2024");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹3580");
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
        lay38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog=new AlertDialog.Builder(Producttype.this);
                final View customLayout = getLayoutInflater().inflate(R.layout.surasocialten, null);
                dialog.setView(customLayout);
                dialog.setPositiveButton("Order Now",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                //Toast.makeText(getApplicationContext(),"ITEM IS ADDED TO CART",Toast.LENGTH_SHORT).show();

                                Intent i =new Intent(Producttype.this,Orderdetails.class);
                                i.putExtra("rice","Sura 10th Std Social Guide 2023-2024");
                                i.putExtra("quan","Pack of 12");
                                i.putExtra("price","₹3580");
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

