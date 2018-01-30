package softwaretech.umang.fragmentdialogue;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
                FragmentManager mane= getFragmentManager();
                FragmentDia fd= new FragmentDia();
                fd.show(mane,"dialog");
            }
        });
    }
}
