package com.training.sahil.resumemaker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by USER on 6/14/2017.
 */

public class UserDbHelper extends SQLiteOpenHelper{

    private static final String DB_NAME = "resume";
    private static final int DB_VERSION = 1;

    private static final String TABLE_NAME = "users";
    private static final String COL_1 = "id";
    private static final String COL_2 = "contact";
    private static final String COL_3 = "academic";
    private static final String COL_4 = "work";
    private static final String COL_5="project";
    private static final String COL_6="skills";
    private static final String COL_7="achievements";
    private static final String COL_8="id";


    private static final String QUERY = "CREATE TABLE " + TABLE_NAME + "( " + COL_1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            COL_2 + " TEXT, " + COL_3 + " TEXT, " + COL_4 + " TEXT, " + COL_5 + " TEXT, " + COL_6 + " TEXT, " + COL_7 + " TEXT, " + COL_8 + " TEXT)";


    public UserDbHelper(Context context) {

        super(context, DB_NAME, null, DB_VERSION);
        Log.i("Database Message", "Database created successfully");

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(QUERY);
        Log.i("Database Message", "Table created successfully");


    }

    public boolean insertData(String contact, String academic, String work, String project, String skills, String achievements, String id, SQLiteDatabase db){

        ContentValues content = new ContentValues();

        content.put(COL_2, contact);
        content.put(COL_3, academic);
        content.put(COL_4, work);
        content.put(COL_5, project);
        content.put(COL_6, skills);
        content.put(COL_7, achievements);
        content.put(COL_8, id);

        db.insert(TABLE_NAME, null, content);

        return true;
    }




    public Cursor searchData(SQLiteDatabase db, String id) {

        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE " + COL_8 + " LIKE " + "'" + "%" + id + "%" +
                "'", null);
        return cursor;
    }


    public int deleteData(SQLiteDatabase db, int id) {

        String[] whereArgs = new String[] {String.valueOf(id)};

        int num_rows = db.delete(TABLE_NAME, "id=?", whereArgs);
        return num_rows;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}

