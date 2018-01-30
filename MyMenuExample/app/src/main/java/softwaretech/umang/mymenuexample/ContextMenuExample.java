package softwaretech.umang.mymenuexample;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ContextMenuExample extends AppCompatActivity {

    ListView sView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu_example);

        final String str[]={"Rahul","Rajat","Umang","Indramani","Shubham","Parvez","Prateek","Suneel",};


        sView = (ListView) findViewById(R.id.lv1);

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,str);

        sView.setAdapter(myadapter);


        sView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ContextMenuExample.this,str[i],Toast.LENGTH_LONG).show();
            }
        });

       registerForContextMenu(sView);

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.mainmenu,menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();


        String selectedItem= sView.getItemAtPosition(info.position).toString();

        switch (item.getItemId())
        {
            case R.id.item1:
                selectedItem= selectedItem +" " +"Allahabad";
                break;
            case R.id.item2:
                selectedItem=selectedItem +" " +"Lucknow";
                break;
            case R.id.item3:
                selectedItem=selectedItem +" "+ "Kanpur";
                break;

        }
        Toast.makeText(this,selectedItem,Toast.LENGTH_LONG).show();

        return super.onContextItemSelected(item);

    }

}
