package softwaretech.umang.myadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MyGridDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_grid_demo);

        final String str[]={"Rahul","Rajat","Umang","Indramani","Shubham","Parvez","Prateek","Suneel",};


        GridView gView = (GridView)findViewById(R.id.gv1);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this,R.layout.custom,str);

        gView.setAdapter(myadapter);

        gView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MyGridDemo.this, str[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
