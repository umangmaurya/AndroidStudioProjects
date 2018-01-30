package softwaretech.umang.popmenuaug4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       final CheckBox cb1= (CheckBox)findViewById(R.id.cb1);
       final CheckBox cb2= (CheckBox)findViewById(R.id.cb2);
       final CheckBox cb3= (CheckBox)findViewById(R.id.cb3);
        Button button=(Button)findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s="";

                if(cb1.isChecked())
                {
                   s= s+cb1.getText()+"\n";
                }
                if(cb2.isChecked())
                {
                    s= s+cb2.getText()+"\n";
                }
                if(cb3.isChecked())
                {
                    s= s+cb3.getText()+"\n";
                }

                Toast.makeText(Main2Activity.this,"You have Selected Following Language \n"+s,Toast.LENGTH_LONG).show();
            }
        });

    }
}
