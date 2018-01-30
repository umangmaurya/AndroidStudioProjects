package softwaretech.umang.myapplication13july;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  MyDBHelper mdb;

    EditText t1;
    EditText t2;
    EditText t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
          MyToast.show(this,"UnSuccesfull");

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


    public   void onShow(View view){

        mdb= new MyDBHelper(this);

    Toast.makeText(this,mdb.retrieveData(),Toast.LENGTH_LONG).show();

    }

    public void onSearch(View view)
    {
        t1 = (EditText)findViewById(R.id.t1);
        String Name = t1.getText().toString();
        mdb= new MyDBHelper(this);
        String res = mdb.searchData(Name);

            Toast.makeText(this,res,Toast.LENGTH_LONG).show();

        //onClearclick(view);

    }
    public void onDelete(View view)
    {

        t1 = (EditText)findViewById(R.id.t1);
        String Name = t1.getText().toString();
        mdb= new MyDBHelper(this);
        long res = mdb.deleteData(Name);
        if(res <0) {
            MyToast.show(this,"Deletion UnSuccesfull ");

        }else
            Toast.makeText(this,"Sucessfully Deleted",Toast.LENGTH_LONG).show();

        onClearclick(view);


    }
    public void onUpdate(View view)
    {
        t1 = (EditText)findViewById(R.id.t1);
        t2 = (EditText)findViewById(R.id.t2);
        t3 = (EditText)findViewById(R.id.t3);
        String Name = t1.getText().toString();
        String Mobile = t2.getText().toString();
        String Email = t3.getText().toString();

        mdb= new MyDBHelper(this);
        long res = mdb.updateData(Name,Mobile,Email);
        if(res <0) {
            MyToast.show(this,"Updation UnSuccesfull ");

        }else
            Toast.makeText(this,"Sucessfully Update",Toast.LENGTH_LONG).show();

        onClearclick(view);

    }
}
