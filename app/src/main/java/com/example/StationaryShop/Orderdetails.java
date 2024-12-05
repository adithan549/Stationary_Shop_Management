package com.example.StationaryShop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Orderdetails extends AppCompatActivity {

    TextView pname, pquantity, pprice;
    EditText pemail, mobile, paddress;
    Button submit;
    Spinner spinner;
    DBHelperone dbHelper;
    final int UPI_PAYMENT_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdetails);

        Intent intent = getIntent();
        String a = intent.getStringExtra("rice");
        String b = intent.getStringExtra("quan");
        String c = intent.getStringExtra("price");

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        dbHelper = new DBHelperone(this);
        pname = findViewById(R.id.pname);
        pquantity = findViewById(R.id.pquantity);
        pprice = findViewById(R.id.pprice);
        submit = findViewById(R.id.submit);
        pemail = findViewById(R.id.pemail);
        mobile = findViewById(R.id.pmobile);
        paddress = findViewById(R.id.paddress);

        pname.setText(a);
        pquantity.setText(b);
        pprice.setText(c);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateInputs()) {
                    // Get order details
                    String NAME = pname.getText().toString();
                    String QUANTITY = pquantity.getText().toString();
                    String PRICE = pprice.getText().toString();
                    String SPINNER_SELECTION = spinner.getSelectedItem().toString();
                    String MOBILE = mobile.getText().toString();
                    String EMAIL = pemail.getText().toString();
                    String ADDRESS = paddress.getText().toString();

                    dbHelper.addorders(NAME, QUANTITY, PRICE, SPINNER_SELECTION, MOBILE, EMAIL, ADDRESS);
                    Toast.makeText(Orderdetails.this, "Products Ordered Successfully...", Toast.LENGTH_SHORT).show();

                    // Call UPI payment method
                    payUsingUPI(NAME, "8056857882@ybl", "Payment for Order", PRICE);

                } else {
                    Toast.makeText(Orderdetails.this, "Please Enter All Details...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Method to validate user input
    private boolean validateInputs() {
        return !pname.getText().toString().isEmpty() &&
                !pquantity.getText().toString().isEmpty() &&
                !pprice.getText().toString().isEmpty() &&
                !spinner.getSelectedItem().toString().isEmpty() &&
                !mobile.getText().toString().isEmpty() &&
                !pemail.getText().toString().isEmpty() &&
                !paddress.getText().toString().isEmpty();
    }

    // UPI Payment method with automatic price passed
    void payUsingUPI(String name, String upiId, String note, String amount) {
        // Ensure that the price is used as default in the UPI app
        Uri uri = Uri.parse("upi://pay").buildUpon()
                .appendQueryParameter("pa", upiId)  // UPI ID
                .appendQueryParameter("pn", name)   // Name of payee
                .appendQueryParameter("tn", note)   // Payment note
                .appendQueryParameter("am", amount) // Amount to pay, auto-filled from pprice
                .appendQueryParameter("cu", "INR")  // Currency
                .build();

        Intent upiPayIntent = new Intent(Intent.ACTION_VIEW);
        upiPayIntent.setData(uri);

        // Choose app for UPI payment (GPay, PhonePe, Paytm, etc.)
        Intent chooser = Intent.createChooser(upiPayIntent, "Pay with");
        try {
            startActivityForResult(chooser, UPI_PAYMENT_REQUEST_CODE);
        } catch (Exception e) {
            Toast.makeText(Orderdetails.this, "No UPI app found, please install one to continue", Toast.LENGTH_SHORT).show();
        }
    }

    // Handle UPI payment result
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == UPI_PAYMENT_REQUEST_CODE) {
            if (resultCode == RESULT_OK || resultCode == 11) {
                if (data != null) {
                    String response = data.getStringExtra("response");
                    processUPIPaymentResponse(response);
                } else {
                    Toast.makeText(this, "Payment cancelled by user", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Payment failed. Please try again", Toast.LENGTH_SHORT).show();
            }
        }
    }

    // Function to process UPI payment response
    private void processUPIPaymentResponse(String response) {
        if (response == null) response = "discard";
        String status = "";
        String approvalRefNo = "";
        String[] responseArray = response.split("&");
        for (String part : responseArray) {
            String[] keyValue = part.split("=");
            if (keyValue.length >= 2) {
                if (keyValue[0].equalsIgnoreCase("Status")) {
                    status = keyValue[1];
                } else if (keyValue[0].equalsIgnoreCase("ApprovalRefNo") || keyValue[0].equalsIgnoreCase("txnRef")) {
                    approvalRefNo = keyValue[1];
                }
            }
        }

        if (status.equalsIgnoreCase("success")) {
            Toast.makeText(Orderdetails.this, "Transaction successful. Reference: " + approvalRefNo, Toast.LENGTH_LONG).show();
            // Handle successful payment (optional: update DB)
        } else if ("Payment cancelled by user".equalsIgnoreCase(status)) {
            Toast.makeText(Orderdetails.this, "Payment cancelled by user", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(Orderdetails.this, "Transaction failed. Please try again", Toast.LENGTH_SHORT).show();
        }
    }
}
