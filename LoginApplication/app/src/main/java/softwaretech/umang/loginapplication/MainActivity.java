package softwaretech.umang.loginapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,email,pass;
    Intent in;
    Button save,clear,rem,get,login;
    SharedPreferences setting ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setting = getSharedPreferences("Name", Context.MODE_PRIVATE);
        String s1=setting.getString("Name","");
        String s2=setting.getString("Email","");
        String s3=setting.getString("Password","");

        if((s1.length()>0)&&(s2.length()>0)&&(s3.length()>0)){

            in = new Intent(MainActivity.this,Welcome.class);
            startActivity(in);
        }
        else
        {

        }





        setting = getSharedPreferences("Name", Context.MODE_PRIVATE);
        name=(EditText)findViewById(R.id.user);
        email= (EditText)findViewById(R.id.email);
       /* save =(Button)findViewById(R.id.sbtn);
        clear =(Button)findViewById(R.id.cbtn);
        rem=(Button)findViewById(R.id.rbtn);
        get=(Button)findViewById(R.id.get);*/
        login=(Button)findViewById(R.id.login);
        pass= (EditText)findViewById(R.id.pass) ;



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n  = name.getText().toString();
                String ph  = pass.getText().toString();
                String e  = email.getText().toString();


              //  Toast.makeText(MainActivity.this,n+"---"+n.length(),Toast.LENGTH_LONG).show();


               // if((n!=null)&&(ph!=null)&&(e!=null))


                try {
                    if((n.length()>0)&&(ph.length()>0)&&(e.length()>0)){

                        SharedPreferences.Editor editor = setting.edit();

                        editor.putString("Name", n);
                        editor.putString("Password", ph);
                        editor.putString("Email", e);
                        editor.commit();

                    in = new Intent(MainActivity.this,Welcome.class);
                    startActivity(in);
                }
                else{
                        Toast.makeText(MainActivity.this,"Please Enter the Details",Toast.LENGTH_LONG).show();
                    }

                } catch (Exception e1) {
                    Toast.makeText(MainActivity.this,e1.toString()+"Please Enter the Details",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
