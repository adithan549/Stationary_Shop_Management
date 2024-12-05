package com.example.StationaryShop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    TextView tv;
    EditText inputUsername,phonum,inputEmail,inputPassword;
    Button btnRegister;
    private DBHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        tv=findViewById(R.id.alreadyHaveAccount);
        inputUsername=findViewById(R.id.inputUsername);
        phonum=findViewById(R.id.phonum);
        inputEmail=findViewById(R.id.inputEmail);
        inputPassword=findViewById(R.id.inputPassword);
        btnRegister=findViewById(R.id.btnRegister);

        dbHelper=new DBHelper(this);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Register.this,Login.class);
                startActivity(i);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!inputUsername.getText().toString().equals("")) && (!phonum.getText().toString().equals("")) && (!inputEmail.getText().toString().equals("")) && (!inputPassword.getText().toString().equals("")))
                {
                    String NAME=inputUsername.getText().toString();
                    String PHONE=phonum.getText().toString();
                    String EMAIL=inputEmail.getText().toString();
                    String PASSWORD=inputPassword.getText().toString();
                    dbHelper.addnew(NAME,PHONE,EMAIL,PASSWORD);
                    Toast.makeText(Register.this, "Data inserted Successfully...", Toast.LENGTH_SHORT).show();
                    inputUsername.setText("");
                    phonum.setText("");
                    inputEmail.setText("");
                    inputPassword.setText("");
                    Intent i=new Intent(Register.this,Login.class);
                    startActivity(i);

                }
                else {
                    Toast.makeText(Register.this, "Please Enter All The Data...", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}