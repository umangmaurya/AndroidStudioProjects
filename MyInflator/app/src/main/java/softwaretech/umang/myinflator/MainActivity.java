package softwaretech.umang.myinflator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LayoutInflater inflater= getLayoutInflater();
        LinearLayout ll= (LinearLayout)findViewById(R.id.l1);
      RelativeLayout r1=(RelativeLayout)findViewById(R.id.r1);
        //View v = inflater.inflate(R.layout.mybutton,ll);
       //r1.addView(v);
        RelativeLayout r2=(RelativeLayout)findViewById(R.id.r2);
        View v1 = inflater.inflate(R.layout.my_layout,null);



    }
}
