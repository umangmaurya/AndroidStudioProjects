package softwaretech.umang.myapplication13july;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by UMANG on 7/14/2017.
 */

public class MyToast {
    public static void show(Context context,String msg)
    {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
