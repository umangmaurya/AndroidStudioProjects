package softwaretech.umang.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText cvalue;
    EditText fvalue;
    TextView cresult;
    TextView fresult;

    public void temperatureConverter(View view){

         cvalue= (EditText)findViewById(R.id.cvalue)  ;
         fvalue= (EditText)findViewById(R.id.fvalue);
        cresult= (TextView)findViewById(R.id.cresult);
        fresult= (TextView)findViewById(R.id.fresult);

        double cr,fr;

        if(cvalue.getText().toString().isEmpty())
        {
            fresult.setText(null);
        }
        else{
            double c = Double.parseDouble(cvalue.getText().toString());
            fr = c*9/5+32;
            fresult.setText(String.valueOf("Fahrenheit: "+(double)Math.round(fr*100)/100));

        }


       if(fvalue.getText().toString().isEmpty())
       {
           cresult.setText(null);
       }
        else {
           double f = Double.parseDouble(fvalue.getText().toString());
           cr = (f - 32) * 5 / 9;
           cresult.setText(String.valueOf("Celsius: " + (double) Math.round(cr * 100) / 100));
       }



    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
