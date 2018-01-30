package softwaretech.umang.myapplicationjuly12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public void onShowClick(View view){

        LinearLayout l1 = (LinearLayout)findViewById(R.id.l1);

        l1.setVisibility(View.VISIBLE);

    }

    public void onHideClick(View view){

        LinearLayout l1 = (LinearLayout)findViewById(R.id.l1);
        l1.setVisibility(View.INVISIBLE);

    }
    public void onShowClick1(View view){

        LinearLayout l2 = (LinearLayout)findViewById(R.id.l2);

        l2.setVisibility(View.VISIBLE);

    }

    public void onHideClick2(View view){

        LinearLayout l2 = (LinearLayout)findViewById(R.id.l2);
        l2.setVisibility(View.INVISIBLE);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout l2 = (LinearLayout)findViewById(R.id.l2);
        l2.setVisibility(View.INVISIBLE);

    }
}
