package com.example.StationaryShop;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

public class UserProfileActivity extends AppCompatActivity {

    private TextView userNameTextView;
    private TextView emailTextView;
    private ImageView profileImageView;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        // Initialize views
        userNameTextView = findViewById(R.id.user_name);
        emailTextView = findViewById(R.id.email);
        profileImageView = findViewById(R.id.profile_image);

        // Initialize DBHelper
        dbHelper = new DBHelper(this);

        // Assuming email is passed from a previous activity (or retrieve from saved state)
        String email = "john.doe@example.com"; // Example email, replace this dynamically

        // Fetch user details from database
        Cursor cursor = dbHelper.getUserByEmail(email);

        if (cursor != null && cursor.moveToFirst()) {
            String userName = cursor.getString(cursor.getColumnIndex("username"));
            String profileImageUrl = cursor.getString(cursor.getColumnIndex("profile_image_url"));

            // Set user data
            userNameTextView.setText(userName);
            emailTextView.setText(email);

            // Load profile image using Glide
            Glide.with(this)
                    .load(profileImageUrl)
                    .placeholder(R.drawable.default_profile) // Fallback image
                    .into(profileImageView);

            cursor.close();
        } else {
            Toast.makeText(this, "User not found", Toast.LENGTH_SHORT).show();
        }
    }
}
