package com.example.StationaryShop;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelperfile extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "xerox.db";
    private static final String TABLE_NAME = "pdf_table";
    private static final int DATABASE_VERSION = 1;

    public DBHelperfile(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_NAME + " ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "pdf_name TEXT, "
                + "pdf_data BLOB);";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertPDF(String name, byte[] pdfData) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("pdf_name", name);
        contentValues.put("pdf_data", pdfData);

        long result = db.insert(TABLE_NAME, null, contentValues);
        return result != -1; // returns true if the insert was successful
    }

    public byte[] getPDFByName(String name) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_NAME, new String[]{"pdf_data"}, "pdf_name=?", new String[]{name}, null, null, null);
        if (cursor != null && cursor.moveToFirst()) {
            byte[] pdfData = cursor.getBlob(cursor.getColumnIndex("pdf_data"));
            cursor.close();
            return pdfData;
        }
        return null;
    }
    public boolean deletePDFByName(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "pdf_name=?", new String[]{name}) > 0;
    }


    public Cursor getAllPDFs() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(TABLE_NAME, new String[]{"pdf_name"}, null, null, null, null, null);
    }
}

