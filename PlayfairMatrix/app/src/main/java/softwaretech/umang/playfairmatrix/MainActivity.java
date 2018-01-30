package softwaretech.umang.playfairmatrix;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enc= (Button)findViewById(R.id.encrypt);
        dec= (Button)findViewById(R.id.decrypt);
        plain=(EditText)findViewById(R.id.pltext);
        key=(EditText)findViewById(R.id.keyword);
         res= (TextView)findViewById(R.id.res);

       enc.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


               String keyword = key.getText().toString();

               String plaintext = plain.getText().toString();

               if (plaintext !=""&& keyword !="")
               {
                   PlayfairCipherEncryption x = new PlayfairCipherEncryption();

                   //System.out.println("Enter a keyword:");
                   //String keyword = sc.next();

                   x.setKey(keyword);
                   x.KeyGen();
                   //System.out.println("Enter word to encrypt: (Make sure length of message is even)");
                   //String key_input = sc.next();

                   if (plaintext.length() % 2 == 0)
                   {
                        res.setText(x.encryptMessage(plaintext).toString());
                   }
                   else
                   {
                       //System.out.println("Message length should be even");
                       Toast.makeText(MainActivity.this,"Message length should be even",Toast.LENGTH_SHORT).show();
                   }
                  // sc.close();

               }
               else {
                   Toast.makeText(MainActivity.this,"Please fill all the fields",Toast.LENGTH_SHORT).show();
               }
           }
       });




    }
}
