package com.example.umang.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multNum();
    }

    public void multNum()
    {
        final EditText t1 = (EditText)findViewById(R.id.editText);
        final EditText t2 = (EditText)findViewById(R.id.editText2);

        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try
                {
                    int n1= Integer.parseInt(t1.getText().toString());
                    int n2 = Integer.parseInt(t2.getText().toString());
                    int mul = n1*n2;
                    Toast.makeText(MainActivity.this, String.valueOf(mul),Toast.LENGTH_LONG).show();
                }
                catch (Exception k)
                {
                    Toast.makeText(MainActivity.this,k.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });


        Button b1 = (Button) findViewById(R.id.button2) ;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this, Main2Activity.class);

                startActivity(intent);




            }
        });

        ;
    }
}

