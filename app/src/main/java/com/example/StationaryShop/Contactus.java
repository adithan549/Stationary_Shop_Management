package com.example.StationaryShop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Contactus extends AppCompatActivity {
    EditText name, email, message;
    Button sendme;
    TextView phoneTextView;
    TextView emailTextView;
    TextView addressTextView;
    DBHelperone db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        message = findViewById(R.id.message);
        sendme = findViewById(R.id.sendme);
        phoneTextView = findViewById(R.id.phoneTextView);
        emailTextView = findViewById(R.id.emailTextView);
        addressTextView = findViewById(R.id.addressTextView);
        db = new DBHelperone(this);

        sendme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name.getText().toString().equals("") && !email.getText().toString().equals("") && !message.getText().toString().equals("")) {
                    String NAME = name.getText().toString();
                    String EMAIL = email.getText().toString();
                    String MESSAGE = message.getText().toString();
                    db.addmsg(NAME, EMAIL, MESSAGE);
                    Toast.makeText(Contactus.this, "Data inserted Successfully...", Toast.LENGTH_SHORT).show();
                    name.setText("");
                    email.setText("");
                    message.setText("");
                    Intent i = new Intent(Contactus.this, MainActivity2.class);
                    startActivity(i);
                } else {
                    Toast.makeText(Contactus.this, "Please Enter All The Data...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set OnClickListener for the telephone TextView
        phoneTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "+91-9042726893"; // Phone number to dial
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
            }
        });

        // Set OnClickListener for the email TextView
        emailTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailAddress = "adithan548@gmail.com"; // Email address
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + emailAddress)); // Only email apps should handle this
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here"); // Optional subject
                intent.putExtra(Intent.EXTRA_TEXT, "Message Here"); // Optional message body
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(Contactus.this, "No email client found.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set OnClickListener for the address TextView
        addressTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mapUrl = "https://maps.app.goo.gl/cxCo6TqUKqtmKTdT7"; // Link to Google Maps
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
                startActivity(intent);
            }
        });
    }
}
