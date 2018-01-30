package com.example.umang.phonebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
    }



    public void onClearclick(View view)
    {
        EditText t1 = (EditText)findViewById(R.id.t1);
        EditText t2 = (EditText)findViewById(R.id.t2);
        EditText t3 = (EditText)findViewById(R.id.t3);
        t1.setText("");
       t2.setText("");
        t3.setText("");

        t1.requestFocus();
    }
}
