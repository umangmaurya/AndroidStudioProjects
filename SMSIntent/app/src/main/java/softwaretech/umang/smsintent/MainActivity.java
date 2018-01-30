package softwaretech.umang.smsintent;

import android.Manifest;
import android.content.Intent;
import android.media.audiofx.BassBoost;
import android.net.Uri;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText sms_addr, sms_body;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sms_addr = (EditText) findViewById(R.id.cont);
                sms_body = (EditText) findViewById(R.id.msg);

                String message = sms_body.getText().toString();

                String phone = sms_addr.getText().toString();

                try {
                    Intent sms = new Intent(Intent.ACTION_VIEW);
                    sms.setData(Uri.parse("sms:"));
                    sms.setType("vnd.android-dir/mms-sms");
                    sms.putExtra("address", phone);
                    sms.putExtra("sms-body", message);

                    startActivity(Intent.createChooser(sms,"Select"));

                  //  ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.SEND_SMS},1);

                   // SmsManager.getDefault().sendTextMessage(phone,null,message,null,null);
                    Toast.makeText(MainActivity.this,"Message Sent",Toast.LENGTH_LONG).show();
                   Intent i = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                    startActivity(i);

                } catch (Exception e) {
                   // e.printStackTrace();
                    Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
