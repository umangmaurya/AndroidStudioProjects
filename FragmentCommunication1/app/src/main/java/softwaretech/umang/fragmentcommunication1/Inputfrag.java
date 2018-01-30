package softwaretech.umang.fragmentcommunication1;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by UMANG on 08-11-2017.
 */

public class Inputfrag extends Fragment {

    Button count;
    Communicator cmr;
    int c=0;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState == null)
        {
            c=0;

        }
        else{
            c=savedInstanceState.getInt("name",0);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        View view =inflater.inflate(R.layout.inputfragment,container,false);

       count= (Button)view.findViewById(R.id.count);

       count.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               cmr= (Communicator)getActivity();
               c++;
               cmr.communicate("You have clicked "+c+" times");
           }
       });



        return view;



    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("name",c);

    }
}
