package com.example.umang.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CheckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        Bundle bun = getIntent().getExtras();

        String userid= bun.getString("userid");
        String pwd= bun.getString("pwd");
        int count = bun.getInt("count");
        double sal= bun.getDouble("sal");

        TextView t = (TextView)findViewById(R.id.tv3);
        TextView t2 = (TextView)findViewById(R.id.tv4);

        t.setText("Hello Mr "+userid);
       if(pwd.equals("icsd"))
       {
           t2.setText("Your Password is Correct"+ " "+ count+ " Salary is " + sal);

       }
       else
           t2.setText("Your Password is InCorrect");

    }
}
