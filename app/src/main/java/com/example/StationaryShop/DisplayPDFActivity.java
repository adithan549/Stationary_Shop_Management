package com.example.StationaryShop;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DisplayPDFActivity extends AppCompatActivity {

    private ListView listView;
    private DBHelperfile dbHelperfile;
    private String[] pdfNames;

    private static final String TAG = "DisplayPDFActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_pdfs);

        listView = findViewById(R.id.listView);
        dbHelperfile = new DBHelperfile(this);
        loadPDFs();
    }

    // Load all PDFs from the database and display them in the ListView
    private void loadPDFs() {
        Cursor cursor = dbHelperfile.getAllPDFs();
        if (cursor != null && cursor.getCount() > 0) {
            pdfNames = new String[cursor.getCount()];
            int index = 0;
            while (cursor.moveToNext()) {
                pdfNames[index++] = cursor.getString(cursor.getColumnIndexOrThrow("pdf_name"));
            }
            cursor.close();

            PDFAdapter adapter = new PDFAdapter(pdfNames);
            listView.setAdapter(adapter);

        } else {
            Toast.makeText(this, "No PDFs found", Toast.LENGTH_SHORT).show();
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    // Custom Adapter to handle displaying, deleting, and downloading PDFs
    private class PDFAdapter extends ArrayAdapter<String> {

        PDFAdapter(String[] pdfNames) {
            super(DisplayPDFActivity.this, R.layout.activity_display_pdfs, pdfNames);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_display_pdfs, parent, false);
            }

            String pdfName = getItem(position);

            TextView tvPdfName = convertView.findViewById(R.id.tvPdfName);
            Button btnDelete = convertView.findViewById(R.id.btnDelete);
            Button btnDownload = convertView.findViewById(R.id.btnDownload); // Download button

            tvPdfName.setText(pdfName);

            // Handle PDF open on TextView click
            tvPdfName.setOnClickListener(v -> openPDF(pdfName));

            // Handle PDF deletion on Delete button click
            btnDelete.setOnClickListener(v -> deletePDF(pdfName, position));

            // Handle PDF download on Download button click
            btnDownload.setOnClickListener(v -> downloadPDF(pdfName));

            return convertView;
        }
    }

    // Open the PDF by writing it to a temporary file and using FileProvider to display it
    private void openPDF(String fileName) {
        byte[] pdfData = dbHelperfile.getPDFByName(fileName);
        if (pdfData != null) {
            File tempFile = new File(getExternalFilesDir(null), fileName);
            try {
                writeFileInChunks(tempFile, pdfData);

                Uri pdfUri = FileProvider.getUriForFile(
                        this,
                        getApplicationContext().getPackageName() + ".fileprovider",
                        tempFile
                );

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(pdfUri, "application/pdf");
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                startActivity(intent);

            } catch (IOException e) {
                Log.e(TAG, "Failed to display PDF", e);
                Toast.makeText(this, "Error displaying PDF", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "PDF not found", Toast.LENGTH_SHORT).show();
        }
    }

    // Download PDF method to save the PDF to external storage (Downloads folder)
    private void downloadPDF(String fileName) {
        byte[] pdfData = dbHelperfile.getPDFByName(fileName);
        if (pdfData != null) {
            File downloadDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            File pdfFile = new File(downloadDir, fileName);
            try {
                writeFileInChunks(pdfFile, pdfData);
                Toast.makeText(this, "PDF saved to Downloads", Toast.LENGTH_SHORT).show();

                // Optionally, notify the media scanner to make it visible immediately in file browsers
                Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
                Uri contentUri = Uri.fromFile(pdfFile);
                mediaScanIntent.setData(contentUri);
                sendBroadcast(mediaScanIntent);

            } catch (IOException e) {
                Log.e(TAG, "Failed to save PDF", e);
                Toast.makeText(this, "Error saving PDF", Toast.LENGTH_SHORT).show();
                refreshPage();
            }
        } else {
            Toast.makeText(this, "PDF not found", Toast.LENGTH_SHORT).show();
            refreshPage();
        }
    }

    // Helper method to write large PDF files in chunks to avoid memory overflow
    private void writeFileInChunks(File file, byte[] data) throws IOException {
        try (OutputStream os = new FileOutputStream(file)) {
            int bufferSize = 4096; // Read/write 4KB at a time
            int length = data.length;
            for (int i = 0; i < length; i += bufferSize) {
                int chunkSize = Math.min(bufferSize, length - i);
                os.write(data, i, chunkSize);
            }
            os.flush();
        }
    }

    // Method to delete the selected PDF from the database and update the ListView
    private void deletePDF(String fileName, int position) {
        boolean isDeleted = dbHelperfile.deletePDFByName(fileName);
        if (isDeleted) {
            Toast.makeText(this, "PDF Deleted", Toast.LENGTH_SHORT).show();
            refreshPage();
            // Refresh the ListView by removing the deleted item
            pdfNames = removeItemFromArray(pdfNames, position);
            ((ArrayAdapter) listView.getAdapter()).notifyDataSetChanged();
        } else {
            Toast.makeText(this, "Error deleting PDF", Toast.LENGTH_SHORT).show();
            refreshPage();
        }
    }

    // Helper method to remove an item from an array
    private String[] removeItemFromArray(String[] array, int position) {
        String[] newArray = new String[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, position);
        System.arraycopy(array, position + 1, newArray, position, array.length - position - 1);
        return newArray;
    }
    private void refreshPage() {
        Intent intent = getIntent();  // Get the current intent
        finish();  // Finish the current activity
        startActivity(intent);  // Restart the activity
    }
}
