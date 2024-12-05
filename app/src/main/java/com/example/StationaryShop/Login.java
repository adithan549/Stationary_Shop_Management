package com.example.StationaryShop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText loginid, loginpass;
    Button login;
    TextView REg;
    Button register;
    private DBHelper dbHelper;
    ImageView image,image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginid = findViewById(R.id.loginid);
        loginpass = findViewById(R.id.loginpass);
        login = findViewById(R.id.loginbtn);
        register = findViewById(R.id.Register);

        dbHelper = new DBHelper(this);
        image = findViewById(R.id.Admin);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, Adminlogin.class);
                startActivity(i);
            }
        });
        image1= findViewById(R.id.Xerorone);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this, UploadActivity.class);
                startActivity(i);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = loginid.getText().toString();
                String Password = loginpass.getText().toString();

                if ((!Username.equals("") && Username != null) && (!Password.equals("") && Password != null)) {
                    String uname = "", upass = "";

                    Cursor cursor = dbHelper.getuserlogincrct(loginid.getText().toString());
                    if (cursor.getCount() == 0) {
                        Toast.makeText(Login.this, "Username OR Password Incorrect...", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (cursor.moveToFirst()) {
                        do {
                            String uName = cursor.getString(0);
                            String upone = cursor.getString(1);
                            String uemail = cursor.getString(2);
                            String pupass = cursor.getString(3);

                            uname = uemail;
                            upass = pupass;

                        } while (cursor.moveToNext());
                    }

                    if (Username.equals(uname) && (Password.equals(upass))) {
                        loginid.setText("");
                        loginpass.setText("");
                        Toast.makeText(Login.this, "Login Successfull...", Toast.LENGTH_SHORT).show();
                        Intent ii = new Intent(Login.this, MainActivity2.class);
                        startActivity(ii);

                    } else {
                        Toast.makeText(Login.this, "Invalid Login Details...", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Login.this, "Please Enter All The Data..!", Toast.LENGTH_SHORT).show();


                }

            }
        });



        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(Login.this, Register.class);
                startActivity(ii);
            }
        });

    }
}
