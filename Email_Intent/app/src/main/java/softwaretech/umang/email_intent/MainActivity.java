package softwaretech.umang.email_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText semail, rcemail, subject, msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  semail = (EditText) findViewById(R.id.semail);
        rcemail = (EditText) findViewById(R.id.rcemail);
        subject = (EditText) findViewById(R.id.subject);
        msg = (EditText) findViewById(R.id.msg);
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  String s = semail.getText().toString();
                String r = rcemail.getText().toString();
                String sub = subject.getText().toString();
                String mssg = msg.getText().toString();

                if(r!=" " && sub!=" " && mssg!=" ") {
                    try {
                        Intent email = new Intent();
                        email.setAction(Intent.ACTION_SEND);
                        email.setType("text/plain");
                        email.putExtra(Intent.EXTRA_EMAIL, new String[]{r});
                        email.putExtra(Intent.EXTRA_SUBJECT, sub);
                        email.putExtra(Intent.EXTRA_TEXT, mssg);

                        startActivity(email);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_LONG).show();
                    }
                }else
                {
                    Toast.makeText(MainActivity.this, "Fill all the fields", Toast.LENGTH_LONG).show();
                }



            }
        });


    }






    }


