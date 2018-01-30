package softwaretech.umang.myadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

public class MySpinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_spinner);


        final String str[]={"Rahul","Rajat","Umang","Indramani","Shubham","Parvez","Prateek","Suneel",};


        Spinner sView = (Spinner)findViewById(R.id.sv1);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this,R.layout.custom,str);

        sView.setAdapter(myadapter);

       sView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
               Toast.makeText(MySpinner.this, str[i],Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> adapterView) {

           }
       });
    }
}
