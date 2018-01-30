package softwaretech.umang.mymenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        String selectedItem = "";
        switch (item.getItemId())
        {
            case R.id.item1:
                selectedItem="Allahabad";
                break;
            case R.id.item2:
                selectedItem="Lucknow";
                break;
            case R.id.item3:
                selectedItem="Kanpur";
                break;

        }


        Toast.makeText(MainActivity.this,selectedItem,Toast.LENGTH_LONG).show();
        return super.onOptionsItemSelected(item);
    }
}
