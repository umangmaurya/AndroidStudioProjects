package softwaretech.umang.myadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /*final String  [] str= new String[26]; //= {"a","b","c","d"};

       char[] alpha = new char[26];
       int k = 0;
       for(int i = 0; i < 26; i++){
           alpha[i] = (char)(65 + (k++));

          str[i] = String.valueOf(alpha[i]);
       }*/
     final String str[]={"Rahul","Rajat","Umang","Indramani","Shubham","Parvez","Prateek","Suneel",};


        ListView listView = (ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this,R.layout.custom,str);

        listView.setAdapter(myadapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, str[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
