package softwaretech.umang.august30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText um =  (EditText) findViewById(R.id.um);

        Linkify.addLinks(um,Linkify.ALL);

    }
}
