package softwaretech.umang.baseadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Name[]= {"Rahul","Umang","Indramani","Rajat","Shubham"};
        int img[]={R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

        ListView listView = (ListView)findViewById(R.id.lv1);

        MyBaseAdapter adapter= new MyBaseAdapter(this,Name,img);

        listView.setAdapter(adapter);


    }
}
