package softwaretech.umang.tictactoegame;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int activePlayer =0;
    int [] gameState = {2,2,2,2,2,2,2,2,2};
    int [][] winlocs ={{0,1,2},{3,4,5},{6,7,8,},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};

    boolean gameOver = false;
   int c=0;
    public  void gameLogic(View view){
        ImageView tappedview = (ImageView) view;
            int tpl = Integer.parseInt(view.getTag().toString());


             c++;

        if(gameState[tpl]==2 && !gameOver) {

            gameState[tpl]=activePlayer;

            tappedview.setTranslationY(-3000f);
            if (activePlayer == 0) {

                tappedview.setImageResource(R.drawable.y);
                activePlayer = 1;
            } else if (activePlayer == 1) {
                tappedview.setImageResource(R.drawable.r);
                activePlayer = 0;
            }
            tappedview.animate().translationYBy(3000f).setDuration(500);
        }


        for(int[] winningPosition : winlocs){
            if(gameState[winningPosition[0]]== gameState[winningPosition[1]] &&
                    gameState[winningPosition[1]]==gameState[winningPosition[2]] &&
                    gameState[winningPosition[0]]!=2){


              //  AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);



                if(activePlayer==0)

                    //alertDialogBuilder.setMessage("RED is Winner, want to Restart the GAME ?");
                    Toast.makeText(MainActivity.this,"Red is Winner",Toast.LENGTH_SHORT).show();

               else if(activePlayer==1)
                    Toast.makeText(MainActivity.this,"Yellow is Winner",Toast.LENGTH_SHORT).show();
                    //alertDialogBuilder.setMessage("TELLOW is Winner, want to Restart the GAME ?");
                gameOver = true;


               /* alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent=new Intent(MainActivity.this, MainActivity.class);


                        startActivity(intent);
                        finish();
                    }
                });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();

                    }
                });


                AlertDialog alertDialog=alertDialogBuilder.create();
                alertDialog.show();

*/

            }




        }



        if(c==9){
            Toast.makeText(MainActivity.this,"Game is Draw",Toast.LENGTH_SHORT).show();
            gameOver =  true;}

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
