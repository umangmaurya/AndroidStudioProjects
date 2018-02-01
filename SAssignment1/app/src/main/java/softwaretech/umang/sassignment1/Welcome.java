package softwaretech.umang.sassignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView  textView=  (TextView)findViewById(R.id.tv1);

        textView.setText(getIntent().getStringExtra("mytext"));
    }
}
