
package softwaretech.umang.mycursorwithadapter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;


/**
 * Created by UMANG on 7/22/2017.
 */


public class MyCursorAdapter extends CursorAdapter {


    public MyCursorAdapter(Context context, Cursor c) {
        super(context, c,0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.single_row,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {


        TextView tv1 = (TextView)view.findViewById(R.id.t1);
        TextView tv2 = (TextView)view.findViewById(R.id.t2);
        TextView tv3 = (TextView)view.findViewById(R.id.t3);

        String name= cursor.getString(cursor.getColumnIndex("NAME"));
        String mobile= cursor.getString(cursor.getColumnIndex("MOBILE"));
        String email= cursor.getString(cursor.getColumnIndex("EMAIL"));

       tv1.setText(name);
        tv2.setText(mobile);
        tv3.setText(email);



    }
}

