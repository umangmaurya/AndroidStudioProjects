package softwaretech.umang.fileio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    TextView tv;
    Button ip,op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed=(EditText)findViewById(R.id.input);
        tv=(TextView)findViewById(R.id.output);
        ip=(Button)findViewById(R.id.read);
        op=(Button)findViewById(R.id.write);

        ip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = ed.getText().toString();

                if(s1.length()>0)
                {
                    try {

                        FileOutputStream fos= openFileOutput("umang.txt",MODE_PRIVATE);

                        fos.write(s1.getBytes());
                        fos.close();
                        Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_SHORT).show();
                    } catch (IOException e) {
                        Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Please Enter Text",Toast.LENGTH_SHORT).show();
                }
            }
        });


        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    FileInputStream fis = openFileInput("umang.txt");
                    int ch;
                    String s="";
                    while((ch= fis.read())!= -1){
                        s= s+ String.valueOf((char) ch)  ;
                    }
                    fis.close();
                    tv.setText(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }


}
