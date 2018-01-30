package softwaretech.umang.myfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1= (Button)findViewById(R.id.show);
        b2=(Button)findViewById(R.id.hide);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MyFragment f= new MyFragment();
                FragmentManager manager= getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();

                MyFragment f1 =(MyFragment)manager.findFragmentByTag("Frag1");
                if(f1==null) {
                    transaction.add(R.id.rl1, f, "Frag1");
                    transaction.commit();
                }
                else {
                    Toast.makeText(MainActivity.this,"Fragment already attached",Toast.LENGTH_LONG).show();
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();

                MyFragment f =(MyFragment)manager.findFragmentByTag("Frag1");
                FragmentTransaction transaction = manager.beginTransaction();
                if(f!=null) {
                    transaction.remove(f);
                    transaction.commit();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Fragment not Exist",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
