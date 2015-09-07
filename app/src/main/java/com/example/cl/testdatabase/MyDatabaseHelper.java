package com.example.cl.testdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by cl on 2015/9/7.
 */




public class MyDatabaseHelper  extends SQLiteOpenHelper{

    public static final String CREATE_BOOK = "create table book ("
            +"id integer primary key autoincrement,"
            +"author text,"
            +"price real,"
            +"pages integer,"
            +"name text)";
    public static final String CREATE_CATEGORY = "create table Category("
            +"id integer primary key autoincrement,"
            +"category_name text,"
            +"category_code integer)";
    public static final String CREATE_TEST = "create table Test("
            +"id integer primary key autoincrement,"
            +"category_name text,"
            +"category_code integer)";

    private Context mContext;
    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
         mContext = context;
        Toast.makeText(mContext,"Open succeeded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//         db.execSQL(CREATE_BOOK);
 //        db.execSQL(CREATE_CATEGORY);
         db.execSQL(CREATE_TEST);
         Toast.makeText(mContext,"Create succeeded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
  //     db.execSQL("drop table if exists Book");
//        db.execSQL("drop table if exists Category");
        onCreate(db);
        Toast.makeText(mContext,"Update succeeded",Toast.LENGTH_SHORT).show();
    }
}
