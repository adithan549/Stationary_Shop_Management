package com.example.StationaryShop;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private Context context;

    public DBHelper(@Nullable Context context) {
        super(context, "admin.db", null, 1);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("CREATE TABLE \"RegisterData\" (\n" +
                "\t\"username\"\tTEXT,\n" +
                "\t\"phono\"\tTEXT,\n" +
                "\t\"email\"\tTEXT ,\n" +
                "\t\"password\"\tTEXT);");


        DB.execSQL("CREATE TABLE \"OrderData\" (\n" +
                "\t\"pname\"\tTEXT,\n" +
                "\t\"pquantity\"\tTEXT,\n" +
                "\t\"pprice\"\tTEXT,\n" +
                "\t\"equantity\"\tTEXT,\n" +
                "\t\"pmoile\"\tTEXT,\n" +
                "\t\"email\"\tTEXT ,\n" +
                "\t\"address\"\tTEXT);");
        DB.execSQL("CREATE TABLE \"orders\" (\n" +
                "\t\"pname\"\tTEXT,\n" +
                "\t\"pqty\"\tTEXT,\n" +
                "\t\"pprice\"\tTEXT,\n" +
                "\t\"eqty\"\tTEXT,\n" +
                "\t\"mobile\"\tTEXT,\n" +
                "\t\"email\"\tTEXT ,\n" +
                "\t\"address\"\tTEXT);");

        DB.execSQL("CREATE TABLE \"ContactUsData\" (\n" +
                "\t\"name\"\tTEXT,\n" +
                "\t\"email\"\tTEXT ,\n" +
                "\t\"message\"\tTEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVersion, int newVersion) {
        DB.execSQL("drop Table if exists RegisterData");
        DB.execSQL("drop Table if exists OrderData");
        DB.execSQL("drop Table if exists ContactUsData");
        DB.execSQL("drop Table if exists orders");
    }

    public void addnew(String Uname, String Pho, String Email, String Pass) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("username", Uname);
        values.put("phono", Pho);
        values.put("email", Email);
        values.put("password", Pass);
        db.insert("RegisterData", null, values);
        db.close();
    }

    public void addorder(String pname, String pquantity, String pprice, String equantity, String pmobile, String email, String paddress) {

        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("pname", pname);
        values.put("pquantity", pquantity);
        values.put("pprice", pprice);
        values.put("equantity", equantity);
        values.put("pmobile", pmobile);
        values.put("email", email);
        values.put("paddress", paddress);
        DB.insert("OrderData", null, values);
        DB.close();
    }

    public void addmessages(String name, String email, String message) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("name", name);
        values.put("email", email);
        values.put("message", message);
        db.insert("ContactUsData", null, values);
        db.close();
    }


    public Cursor getuserlogincrct(String Username) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM RegisterData WHERE email = '" + Username + "'", null);
        return cursor;
    }

    public Cursor getdata() {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from OrderData", null);
        return cursor;
    }

    public Cursor getregisterdata() {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from RegisterData", null);
        return cursor;
    }

    public Cursor getcontactUsData() {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("select * from ContactUsData", null);
        return cursor;
    }
    public Cursor getUserByEmail(String email) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM Registerdata WHERE  email  = ?", null);
        return cursor;
    }

    public Boolean deletedata(String email) {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from RegisterData where email = ?", new String[]{email});
        if (cursor.getCount() > 0) {
            long result = DB.delete("RegisterData", "email=?", new String[]{email});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;

        }
    }

    public Boolean delete(String email) {
        SQLiteDatabase DB = this.getWritableDatabase();
        Cursor cursor = DB.rawQuery("Select * from OrderData where email = ?", new String[]{email});
        if (cursor.getCount() > 0) {
            long result = DB.delete("OrderData", "email=?", new String[]{email});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}