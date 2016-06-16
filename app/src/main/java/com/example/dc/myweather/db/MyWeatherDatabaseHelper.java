package com.example.dc.myweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dc on 2016/6/14.
 */
public class MyWeatherDatabaseHelper extends SQLiteOpenHelper {
    /**
     * Province建表语句
     */
    public static final String CREATE_PROVINCE="create table province("
            +"id integer primary key autoincrement,"
            +"province_name text"
            +"province_code text)";
    /**
     * City建表语句
     */
    public static final String CREATE_CITY="create table city("
            +"id integer primary key autoincrement,"
            +"city_name text"
            +"city_code text"
            +"province_id integer)";
    /**
     * Country建表语句
     */
    public static final String CREATE_COUNTY="create table county("
            +"id integer primary key autoincrement,"
            +"county_name text"
            +"county_code text"
            +"city_id integer)";
    public MyWeatherDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
