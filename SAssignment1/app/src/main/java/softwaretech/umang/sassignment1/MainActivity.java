package softwaretech.umang.sassignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText msg;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = (EditText) findViewById(R.id.text);
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mssg = msg.getText().toString();
                if(mssg.length()>0){

                    in = new Intent(MainActivity.this, Welcome.class);
                    in.putExtra("mytext", mssg);
                    startActivity(in);
                }
                else {
                    Toast.makeText(MainActivity.this, "Please fill text", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}
