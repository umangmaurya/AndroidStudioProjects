package softwaretech.umang.loginapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Welcome extends AppCompatActivity {

    Button reset,exit;
    SharedPreferences setting;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        setting = getSharedPreferences("Name", Context.MODE_PRIVATE);

        reset= (Button)findViewById(R.id.reset);
        exit = (Button)findViewById(R.id.close);
        tv1 =(TextView)findViewById(R.id.userview) ;
        String s1=setting.getString("Name",null);
       // String s2=setting.getString("Email",null);
        tv1.setText(s1);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // setting = getSharedPreferences("Name", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = setting.edit();
                editor.clear();
                editor.apply();
                Toast.makeText(Welcome.this,"Logout Success",Toast.LENGTH_LONG).show();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
