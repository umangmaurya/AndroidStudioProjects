package softwaretech.umang.fragmentcommunication1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {



    Outputfrag fo,fo1;
    Inputfrag fi,fi1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fi= new Inputfrag();
        fo= new Outputfrag();

        FragmentManager manager = getFragmentManager();

        FragmentTransaction transaction= manager.beginTransaction();


       fo1= (Outputfrag)getFragmentManager().findFragmentByTag("output");
        fi1= (Inputfrag) getFragmentManager().findFragmentByTag("Input");

    if(fo1==null && fi1==null)
    {
        transaction.add(R.id.ll1,fi,"Input");
        //   transaction.commit();
        transaction.add(R.id.ll1,fo,"output");
        transaction.commit();
    }




       /* transaction.add(R.id.ll1,fi,"Input");
     //   transaction.commit();
        transaction.add(R.id.ll1,fo,"output");
        transaction.commit();*/





    }
    @Override
    public void communicate(String message) {

        fo= (Outputfrag)getFragmentManager().findFragmentByTag("output");
        fo.setText(message);

    }

}
