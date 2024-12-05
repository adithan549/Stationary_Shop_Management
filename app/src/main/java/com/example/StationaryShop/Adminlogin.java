package com.example.StationaryShop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Adminlogin extends AppCompatActivity {
    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlogin);
        username = findViewById(R.id.loginid);
        password = findViewById(R.id.loginpass);
        login = findViewById(R.id.loginbtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    EditText username = (EditText) findViewById(R.id.loginid);
                    EditText password = (EditText) findViewById(R.id.loginpass);
                if ((!username.equals("") && username != null) && (!password.equals("") && password != null)) {
                    if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                        username.setText("");
                        password.setText("");
                        Toast.makeText(getApplicationContext(),
                                "Admin Login Successfully...", Toast.LENGTH_SHORT).show();
                        Intent ii = new Intent(Adminlogin.this, Adminpage.class);
                        startActivity(ii);
                    } else {
                        Toast.makeText(getApplicationContext(), "UserName and Password Not match", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Enter Above Details", Toast.LENGTH_SHORT).show();

                }
            }

        });

    }
}
