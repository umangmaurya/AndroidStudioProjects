package softwaretech.umang.mytextbox;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb1;
    Switch sw1;
    SeekBar sbar;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb1=(ToggleButton)findViewById(R.id.tb1);
        sw1=(Switch)findViewById(R.id.sw1);
        textView=(TextView)findViewById(R.id.tv) ;

        tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this,tb1.getText(),Toast.LENGTH_LONG).show();

               if(tb1.isChecked())
               {
                   textView.setTypeface(null,Typeface.BOLD);
               }
               else {
                   textView.setTypeface(null,Typeface.NORMAL);
               }

            }
        });

        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // Toast.makeText(MainActivity.this,"Wifi Status:"+sw1.isChecked(),Toast.LENGTH_LONG).show();
                if(sw1.isChecked()){
                    textView.setTypeface(null, Typeface.ITALIC);

                }
                else{
                    textView.setTypeface(null,Typeface.NORMAL);
                }

            }
        });

        sbar= (SeekBar)findViewById(R.id.seekb1);

        sbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                //Toast.makeText(MainActivity.this,"Current Value:"+i,Toast.LENGTH_LONG).show();
                textView.setTextSize(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                //Toast.makeText(MainActivity.this,"Start",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Toast.makeText(MainActivity.this,"Stop",Toast.LENGTH_LONG).show();

            }
        });



    }
}
