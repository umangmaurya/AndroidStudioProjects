package softwaretech.umang.vigenerecipher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button enc,dec;
    EditText plain,key;
    TextView res;
   String Encrypted;
    String keyword,plaintext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        enc= (Button)findViewById(R.id.enc);
        dec= (Button)findViewById(R.id.dec);
        plain=(EditText)findViewById(R.id.plain);
        key=(EditText)findViewById(R.id.key);
        res= (TextView)findViewById(R.id.res);


        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                 keyword = key.getText().toString();

                 plaintext = plain.getText().toString();

                if (plaintext != "" && keyword != "") {
                    VigenereCipherEncryption u = new VigenereCipherEncryption();
                    Encrypted = u.encrypt(plaintext,keyword);

                    res.setText(Encrypted.toString());


                }
                // sc.close();
                else {
                    Toast.makeText(MainActivity.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                }
            }
    });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VigenereCipherEncryption u = new VigenereCipherEncryption();

                String Decrypted= u.decrypt(Encrypted,keyword);
                res.setText(Decrypted.toString());

            }
        });

}
}
