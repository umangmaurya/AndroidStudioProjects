package softwaretech.umang.fragmentdialogue;

import android.app.DialogFragment;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by UMANG on 06-11-2017.
 */

public class FragmentDia extends DialogFragment {

    Button b1,b2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        setCancelable(false);
        View view = inflater.inflate(R.layout.dialogfrag,null);

        b1= (Button)view.findViewById(R.id.ok);
        b2= (Button)view.findViewById(R.id.can);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"You Click on ok",Toast.LENGTH_LONG).show();
                dismiss();
            }
        });

        return  view;
    }
}
