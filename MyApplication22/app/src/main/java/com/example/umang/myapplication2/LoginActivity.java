package com.example.umang.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.umang.myapplication2.R.id.ed1;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       final EditText t1=(EditText)findViewById(R.id.ed1);
        final EditText t2 = (EditText)findViewById(R.id.ed2);

        Button b1= (Button)findViewById(R.id.btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Intent intent = new Intent(LoginActivity.this,CheckActivity.class);
                    intent.putExtra("userid",t1.getText().toString());
                    intent.putExtra("pwd",t2.getText().toString());
                    intent.putExtra("count",15);
                    intent.putExtra("sal",4.5);
                    startActivity(intent);
                }
                catch (Exception e)
                {
                    Toast.makeText(LoginActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
