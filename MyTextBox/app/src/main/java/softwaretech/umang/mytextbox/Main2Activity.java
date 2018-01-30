package softwaretech.umang.mytextbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        AutoCompleteTextView a1 = (AutoCompleteTextView)findViewById(R.id.actv);
        MultiAutoCompleteTextView a2=(MultiAutoCompleteTextView)findViewById(R.id.mactv);

        String cities[]={"Allahabad","Mumbai","Agra","Banaras","Banglore","Lucknow","Ahemdabad","Meghalaya","Chennai","Laxminagar"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,cities);

        a1.setThreshold(1);
        a2.setThreshold(1);
        a2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        a1.setAdapter(adapter);
        a2.setAdapter(adapter);

    }
}
