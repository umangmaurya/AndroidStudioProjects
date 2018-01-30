package softwaretech.umang.notificationeg;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1;
    String MyId="My Channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=  (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this,MyId);

                builder.setSmallIcon(R.drawable.ic_stat_name);
                builder.setContentTitle("Umang");
                builder.setContentText("Helllo there");
//  To set Action on Notification 
                Intent i= new Intent (MainActivity.this,Main2Activity.class);
                PendingIntent pi= PendingIntent.getActivity(MainActivity.this,3,i,0);
                builder.setContentIntent(pi);


                NotificationManager mgr = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                mgr.notify(1,builder.build());
            }
        });
    }
}
