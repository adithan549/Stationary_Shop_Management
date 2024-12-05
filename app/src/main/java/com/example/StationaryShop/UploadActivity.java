package com.example.StationaryShop;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;

public class UploadActivity extends AppCompatActivity {

    private static final int PICK_FILE = 1;
    private TextView tvFileName;
    private Button btnUploadFile, btnSubmitFile;
    private String fileName;
    private Uri fileUri;
    private DBHelperfile dbHelper;
    private byte[] fileBytes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        tvFileName = findViewById(R.id.tvFileName);
        btnUploadFile = findViewById(R.id.btnUploadFile);
        btnSubmitFile = findViewById(R.id.btnSubmitFile);
        dbHelper = new DBHelperfile(this);

        btnUploadFile.setOnClickListener(v -> openFilePicker());

        btnSubmitFile.setOnClickListener(v -> {
            if (fileUri != null && fileName != null && fileBytes != null) {
                boolean isInserted = dbHelper.insertPDF(fileName, fileBytes);
                if (isInserted) {
                    Toast.makeText(UploadActivity.this, "File Saved in Database", Toast.LENGTH_SHORT).show();
                    refreshPage();
                } else {
                    Toast.makeText(this, "Error saving file", Toast.LENGTH_SHORT).show();
                    refreshPage();
                }
            } else {
                Toast.makeText(this, "No file selected", Toast.LENGTH_SHORT).show();
                refreshPage();
            }
        });
    }

    private void openFilePicker() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_MIME_TYPES, new String[]{"application/pdf", "application/msword"});
        startActivityForResult(intent, PICK_FILE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_FILE && resultCode == RESULT_OK && data != null) {
            fileUri = data.getData();
            fileName = getFileName(fileUri);
            if (fileName != null) {
                tvFileName.setText(fileName);
                fileBytes = readBytesFromUri(fileUri);
                btnSubmitFile.setVisibility(View.VISIBLE);
            }
        }
    }

    private String getFileName(Uri uri) {
        String result = null;
        if ("content".equals(uri.getScheme())) {
            try (Cursor cursor = getContentResolver().query(uri, null, null, null, null)) {
                if (cursor != null && cursor.moveToFirst()) {
                    result = cursor.getString(cursor.getColumnIndexOrThrow(OpenableColumns.DISPLAY_NAME));
                }
            }
        }
        return result;
    }

    private byte[] readBytesFromUri(Uri uri) {
        try (InputStream inputStream = getContentResolver().openInputStream(uri)) {
            return inputStream.readAllBytes();
        } catch (Exception e) {
            Log.e("FileError", "Error reading file bytes", e);
            return null;
        }
    }

    private void refreshPage() {
        Intent intent = getIntent();  // Get the current intent
        finish();  // Finish the current activity
        startActivity(intent);  // Restart the activity
    }
}
