package softwaretech.umang.fragmentcommunication1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by UMANG on 08-11-2017.
 */

public class Outputfrag extends Fragment {

    TextView tv1;
   String message;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState==null)
        {

        }
        else{
            message = savedInstanceState.getString("mes");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.outputfragment,container,false);

        tv1= (TextView)view.findViewById(R.id.tv1);
        if(savedInstanceState!= null) {
            tv1.setText(message);
        }

        return  view;

    }

    void  setText(String msg)
    {
        tv1.setText(msg);
        message= msg;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("mes",message);
    }
}
