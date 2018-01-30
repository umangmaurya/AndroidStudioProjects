package softwaretech.umang.mycalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int preVal;
    String opr="";
    int curVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText ed1 = (EditText)findViewById(R.id.ed1);
        ed1.setEnabled(false);

        final Button b1=(Button)findViewById(R.id.b1);

        Button b2=(Button)findViewById(R.id.b2);

        Button b3=(Button)findViewById(R.id.b3);

        Button b4=(Button)findViewById(R.id.b4);

        Button b5=(Button)findViewById(R.id.b5);

        Button b6=(Button)findViewById(R.id.b6);

        Button b7=(Button)findViewById(R.id.b7);

        Button b8=(Button)findViewById(R.id.b8);

        Button b9=(Button)findViewById(R.id.b9);

        Button b0=(Button)findViewById(R.id.b0);

        Button eq=(Button)findViewById(R.id.eq);

        Button clr=(Button)findViewById(R.id.clr);

        Button add=(Button)findViewById(R.id.add);

        Button min=(Button)findViewById(R.id.min);

        Button mul=(Button)findViewById(R.id.mul);

        Button div=(Button)findViewById(R.id.div);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("1");
                else
                    ed1.setText(s+"1");


            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("2");
                else
                    ed1.setText(s+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("3");
                else
                    ed1.setText(s+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("4");
                else
                    ed1.setText(s+"4");

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("5");
                else
                    ed1.setText(s+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("6");
                else
                    ed1.setText(s+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("7");
                else
                    ed1.setText(s+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("8");
                else
                    ed1.setText(s+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("9");
                else
                    ed1.setText(s+"9");

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = ed1.getText().toString();
                if (s.equals("0"))
                    ed1.setText("0");
                else
                    ed1.setText(s+"0");
            }
        });
        eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    curVal = Integer.parseInt(ed1.getText().toString());
                    if (opr.equals("+"))
                        ed1.setText(""+(preVal + curVal));
                    else if (opr.equals("-"))
                        ed1.setText(""+(preVal - curVal));
                    else if (opr.equals("*"))
                        ed1.setText(""+(preVal * curVal));
                    else if (opr.equals("/"))
                        ed1.setText(""+(preVal / curVal));
                }
                catch (Exception e)
                {
Toast.makeText(MainActivity.this,e.toString(),Toast.LENGTH_LONG).show();
                }

            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ed1.setText("0");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                preVal= Integer.parseInt(ed1.getText().toString());
                ed1.setText("0");
                opr="+";


            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preVal= Integer.parseInt(ed1.getText().toString());
                ed1.setText("0");
                opr="-";
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preVal= Integer.parseInt(ed1.getText().toString());
                ed1.setText("0");
                opr="*";

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preVal= Integer.parseInt(ed1.getText().toString());
                ed1.setText("0");
                opr="/";
            }
        });




    }


}
