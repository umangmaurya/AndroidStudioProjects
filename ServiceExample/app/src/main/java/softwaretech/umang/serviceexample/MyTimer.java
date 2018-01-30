package softwaretech.umang.serviceexample;

import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by UMANG on 9/8/2017.
 */

public class MyTimer extends Service {
    MediaPlayer player;

    public class ABC implements Runnable{
        @Override
        public void run() {
            MediaPlayer player;
            player = MediaPlayer.create(MyTimer.this,R.raw.a);
            player.setLooping(true);
            player.start();
        }
    }


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(this,"Started",Toast.LENGTH_SHORT).show();

       /* synchronized (this) {
            try {
                wait(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }*/

       Thread t = new Thread(new ABC());
        t.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {

        Toast.makeText(this,"Stopped",Toast.LENGTH_SHORT).show();
        player.stop();
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
