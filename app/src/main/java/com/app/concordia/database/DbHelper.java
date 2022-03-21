package com.app.concordia.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.app.concordia.utils.Variables;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = Variables.DB_NAME;
    public static final String DB_TABLE = Variables.DB_TABLE;
    public static final String PRODUCT_ID = Variables.PRODUCT_ID;
    public static final String PRODUCT_NAME = Variables.PRODUCT_NAME;
    public static final String PRODUCT_PRICE = Variables.PRODUCT_PRICE;

    public DbHelper(Context context) {
        super(context, DB_NAME,null, 1);
        SQLiteDatabase database = this.getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ DB_TABLE + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, PID TEXT, PNAME TEXT, PQUANTITY TEXT," +
                " TPRICE TEXT, URL TEXT, PRICEID TEXT, TOPPINGID TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
