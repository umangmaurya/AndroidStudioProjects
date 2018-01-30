package softwaretech.umang.baseadapterexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by UMANG on 7/21/2017.
 */

public class MyBaseAdapter extends BaseAdapter{

    String contact [];
    int img[];
    Context context;
    LayoutInflater inflater;

    public MyBaseAdapter(Context context,String[] contact, int[] img ) {
        this.contact = contact;
        this.img = img;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }



    @Override
    public int getCount() {


        return contact.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view= inflater.inflate(R.layout.single_row,null);

        ImageView imageView = (ImageView)view.findViewById(R.id.i1);
        TextView textView = (TextView)view.findViewById(R.id.t1);

        imageView.setImageResource(img[i]);
        textView.setText(contact[i]);

        return view;


    }
}
