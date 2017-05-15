package id.sch.smktelkom_mlg.privateassignment.xirpl210.mydailywth;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Ilham Izzul on 5/15/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private int DATABASE_VERSION = 1;
    private String DATABASE_NAME = "db_moview";

    public DatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
