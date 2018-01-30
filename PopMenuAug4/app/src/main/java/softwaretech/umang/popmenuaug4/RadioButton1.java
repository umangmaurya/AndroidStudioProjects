package softwaretech.umang.popmenuaug4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class RadioButton1 extends AppCompatActivity {

    Button btn;
    RadioGroup rg;
    ToggleButton tb1;
    Switch sw1;
    SeekBar sbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        btn= (Button)findViewById(R.id.btn);
        rg= (RadioGroup)findViewById(R.id.rg1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sel_id = rg.getCheckedRadioButtonId();
                RadioButton rb = (RadioButton)findViewById(sel_id) ;
             // String s= findViewById(sel_id).toString();



                Toast.makeText(RadioButton1.this,rb.getText(),Toast.LENGTH_LONG).show();


            }
        });

        tb1=(ToggleButton)findViewById(R.id.tb1);
        sw1=(Switch)findViewById(R.id.sw1);

        tb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RadioButton1.this,tb1.getText(),Toast.LENGTH_LONG).show();
            }
        });

        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(RadioButton1.this,"Wifi Status:"+sw1.isChecked(),Toast.LENGTH_LONG).show();
            }
        });

        sbar= (SeekBar)findViewById(R.id.seekb1);

        sbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                Toast.makeText(RadioButton1.this,"Current Value:"+i,Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                Toast.makeText(RadioButton1.this,"Start",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(RadioButton1.this,"Stop",Toast.LENGTH_LONG).show();

            }
        });


    }
}
