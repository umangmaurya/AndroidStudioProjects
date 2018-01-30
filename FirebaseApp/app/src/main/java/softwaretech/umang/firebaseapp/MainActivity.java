package softwaretech.umang.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button msend;
      DatabaseReference root,demo;
      EditText txt,user;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msend = (Button)findViewById(R.id.msend);
        txt= (EditText)findViewById(R.id.str);
        user= (EditText)findViewById(R.id.user);


        root = FirebaseDatabase.getInstance().getReference();
//        demo = root.child("Name");

        msend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value= txt.getText().toString();
                String key =  user.getText().toString();

                if(value!=null && key!= null)
                {
                    demo = root.child(key);
                    demo.setValue(value);
                    Toast.makeText(MainActivity.this, "Successfull", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Enter both fields",Toast.LENGTH_LONG).show();
                }





            }
        });
    }
}
