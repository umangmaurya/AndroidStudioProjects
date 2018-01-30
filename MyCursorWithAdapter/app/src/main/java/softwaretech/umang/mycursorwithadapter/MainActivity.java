package softwaretech.umang.mycursorwithadapter;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    MyDBHelper mdb;
    MyCursorAdapter mca;
    EditText t1;
    EditText t2;
    EditText t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onShow(View view) {
        try {
            ListView listView = (ListView) findViewById(R.id.List1);
            mdb = new MyDBHelper(this);
            SQLiteDatabase db = mdb.getReadableDatabase();
            Cursor c = db.rawQuery("select _id,NAME,MOBILE,EMAIL from CONTACTS", null);

            mca = new MyCursorAdapter(this, c);
            listView.setAdapter(mca);


        } catch (Exception e) {
            Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }


    public void saveData(View view){

        t1 = (EditText)findViewById(R.id.t1);
        t2 = (EditText)findViewById(R.id.t2);
        t3 = (EditText)findViewById(R.id.t3);
        String Name = t1.getText().toString();
        String Mobile = t2.getText().toString();
        String Email = t3.getText().toString();

        mdb= new MyDBHelper(this);
        long res = mdb.insertData(Name,Mobile,Email);
        if(res <0) {
            Toast.makeText(this,"UnSuccesfull",Toast.LENGTH_LONG);

        }else
            Toast.makeText(this,"Sucessful",Toast.LENGTH_LONG).show();

        onClearclick(view);
    }

    public void onClearclick(View view)
    {
        t1 = (EditText)findViewById(R.id.t1);
        t2 = (EditText)findViewById(R.id.t2);
        t3 = (EditText)findViewById(R.id.t3);
        t1.setText("");
        t2.setText("");
        t3.setText("");

        t1.requestFocus();
    }




}

