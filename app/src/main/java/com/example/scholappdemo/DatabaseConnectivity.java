package com.example.scholappdemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.SQLException;

import androidx.annotation.Nullable;

public class DatabaseConnectivity extends  SQLiteOpenHelper
{

    public static  final String DBNAME="Login.db";

    public DatabaseConnectivity(Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String q ="create table users(_id integer primary key autoincrement,name text,password text,email text)";
        db.execSQL(q);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists users");
        onCreate(db);

    }

    public boolean insert_data(String name,String email,String password)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put("name",name);
        c.put("email",email);
        c.put("password",password);
        long r=db.insert("users",null,c);
        if(r==-1)
            return false;
        else
            return true;
    }


    public boolean check_email(String email)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from users where email = ?",new String[]{email});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public boolean check_phonepassword(String email,String password)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from users where email = ? and password =? ",new String[]{email,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public boolean update_data(String email,String password,String name)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put("password",password);
        c.put("email",email);
        Cursor cursor=db.rawQuery("Select * from users where name = ? ",new String[]{name});

        if(cursor.getCount()>0){
            long r=db.update("users",c,"name = ?",new String[]{name});
            if(r==-1)
                return false;
            else
               return true;
        }
        else
            return false;

    }

    public boolean update_password (String email,String password)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put("password",password);
        long r=db.update("users",c,"email=?",new String[]{email});
        if(r==-1)
            return false;
        else
            return true;
    }

    public Cursor getinfo(String email,String password,String name)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * from users where email=?",new String[]{email});
        return cursor;

    }

}


