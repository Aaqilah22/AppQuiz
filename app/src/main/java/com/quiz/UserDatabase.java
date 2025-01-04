package com.quiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UserDatabase {
    private UserDatabaseHelper dbHelper;

    public UserDatabase(Context context) {
        dbHelper = new UserDatabaseHelper(context);
    }

    // Fungsi untuk menambahkan pengguna baru
    public boolean addUser(String email, String username, String password) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("email", email);
        values.put("username", username);
        values.put("password", password);

        long result = db.insert("users", null, values);
        return result != -1; // Mengembalikan true jika sukses
    }

    // Fungsi untuk memvalidasi login
    public boolean validateLogin(String email, String password) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";
        Cursor cursor = db.rawQuery(query, new String[]{email, password});

        boolean isValid = cursor.moveToFirst();
        cursor.close();
        return isValid;
    }

    // Fungsi untuk memeriksa apakah email sudah terdaftar
    public boolean isEmailRegistered(String email) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM users WHERE email = ?";
        Cursor cursor = db.rawQuery(query, new String[]{email});

        boolean exists = cursor.moveToFirst();
        cursor.close();
        return exists;
    }
}

