package softwaretech.umang.myapplication13july;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.widget.Toast;

import java.sql.SQLException;

/**
 * Created by UMANG on 7/13/2017.
 */

public class MyDBHelper extends SQLiteOpenHelper {

    public MyDBHelper(Context context) {

        super(context, "MyContacts", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table CONTACT(ID integer primary key autoincrement,NAME varchar(100),MOBILE varchar(100),EMAIL varchar(200))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exist CONTACT");
        onCreate(db);

    }

    public long insertData(String Name, String Mobile, String Email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("NAME", Name);
        cv.put("MOBILE", Mobile);
        cv.put("EMAIL", Email);
        long res = db.insert("CONTACT", null, cv);
        db.close();
        return res;

    }

    public long updateData(String Name, String Mobile, String Email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("NAME", Name);
        cv.put("MOBILE", Mobile);
        cv.put("EMAIL", Email);


        long res = db.update("CONTACT",cv,"NAME=?",new String[]{Name});


        db.close();
        return res;

    }
    public long deleteData(String Name) {
        SQLiteDatabase db = this.getWritableDatabase();


        long res = db.delete("CONTACT","NAME=?",new String[]{Name});


        db.close();
        return res;

    }


    public String retrieveData() {
        SQLiteDatabase db = this.getWritableDatabase();
       // Cursor cursor = db.rawQuery("Select *from CONTACT", null);
        String [] columns = {"ID","NAME","MOBILE","EMAIL"};
        Cursor cursor = db.query("CONTACT",columns,null,null,null,null,null);
        String s= "";
        while (cursor.moveToNext())
        {
            s= s+"ID"+cursor.getString(0);
            s= s+"  Name-"+cursor.getString(1);
            s= s+"  Mobile"+cursor.getString(2);
            s= s+"  Email"+cursor.getString(3);
            s=s+"\n";
        }
            db.close();
        return s;
    }
    public String searchData(String Name) {
        SQLiteDatabase db = this.getWritableDatabase();
        // Cursor cursor = db.rawQuery("Select *from CONTACT", null);
        String [] columns = {"ID","NAME","MOBILE","EMAIL"};
        Cursor cursor = db.query("CONTACT",columns,"NAME=?",new String[]{Name},null,null,null);
        String s= "";
        if(cursor.moveToNext())
        {
            s= s+"ID"+cursor.getString(0);
            s= s+"  Name-"+cursor.getString(1);
            s= s+"  Mobile"+cursor.getString(2);
            s= s+"  Email"+cursor.getString(3);
            s=s+"\n";
        }
        else
            s="Record Not Found";
        db.close();
        return s;
    }


}
