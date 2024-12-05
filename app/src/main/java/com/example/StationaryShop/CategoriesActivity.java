package com.example.StationaryShop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class CategoriesActivity extends AppCompatActivity {

    // Declare ImageView variables
    private ImageView aa, a1, a3, a4, a5, a6, a7, a8, a9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);  // Set the XML layout to the 'categories.xml'

        // Initialize ImageViews
        aa = findViewById(R.id.aa);
        a1 = findViewById(R.id.a1);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        a6 = findViewById(R.id.a6);
        a7 = findViewById(R.id.a7);
        a8 = findViewById(R.id.a8);
        a9 = findViewById(R.id.a9);

        // Set onClickListeners for each ImageView (Example for navigation or actions)
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesActivity.this, Notelist.class);
                startActivity(i);
            }
        });

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CategoriesActivity.this, booklist.class);
                startActivity(i);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Book 3");
            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Book 4");
            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Book 5");
            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Book 6");
            }
        });

        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Book 7");
            }
        });

        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Book 8");
            }
        });

        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Book 9");
            }
        });
    }

    // Method to navigate to a detail page or perform action when an ImageView is clicked
    private void openDetailActivity(String bookName) {
        Intent intent = new Intent(CategoriesActivity.this,CategoriesActivity.class);
        intent.putExtra("BOOK_NAME", bookName);  // Pass the book name to the next activity
        startActivity(intent);
    }
}
