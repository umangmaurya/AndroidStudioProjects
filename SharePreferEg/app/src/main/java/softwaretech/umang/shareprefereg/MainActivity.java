package softwaretech.umang.shareprefereg;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,email;

    Button save,clear,rem,get;
    SharedPreferences setting ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       setting = getSharedPreferences("Name", Context.MODE_PRIVATE);
        name=(EditText)findViewById(R.id.user);
        email= (EditText)findViewById(R.id.email);
        save =(Button)findViewById(R.id.sbtn);
        clear =(Button)findViewById(R.id.cbtn);
        rem=(Button)findViewById(R.id.rbtn);
        get=(Button)findViewById(R.id.get);

        try {
            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    SharedPreferences.Editor edit = setting.edit();
                   edit.putString("User",name.getText().toString());
                    edit.putString("Email",email.getText().toString());
                    edit.apply();

                    Toast.makeText(MainActivity.this,"Saved",Toast.LENGTH_LONG).show();

                }
            });
        } catch (Exception e) {
            Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
        }

        try {
            get.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {



                    String s1=setting.getString("User",null);
                    String s2=setting.getString("Email",null);

                    Toast.makeText(MainActivity.this,s1+" "+s2,Toast.LENGTH_LONG).show();


                }
            });
        } catch (Exception e) {
            Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
        }

        rem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor edit = setting.edit();
                edit.remove("Email");
                edit.apply();
                Toast.makeText(MainActivity.this,"Email Id removed",Toast.LENGTH_LONG).show();

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor edit = setting.edit();
                edit.clear();
                edit.apply();
                Toast.makeText(MainActivity.this,"Settings are Cleared",Toast.LENGTH_LONG).show();
            }
        });

    }
}
