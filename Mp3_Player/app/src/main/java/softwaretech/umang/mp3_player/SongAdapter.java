package softwaretech.umang.mp3_player;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by UMANG on 9/10/2017.
 */

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongHolder> {

    ArrayList<SongInfo> songs;

    Context context;
    OnItemClickListener onItemClickListener;

    SongAdapter(Context context, ArrayList<SongInfo> songs){
        this.context= context;
        this.songs= songs;
    }

    public interface OnItemClickListener
    {
        void onItemClick(Button b, View view,SongInfo obj,int position);
    }

    public  void  setOnItemClickListener(OnItemClickListener onItemClickListener)
    {
        this.onItemClickListener=onItemClickListener;
    }



    @Override
    public SongAdapter.SongHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(context).inflate(R.layout.row_song, parent, false);
        return new SongHolder(myView);
    }

    @Override
    public void onBindViewHolder(final SongAdapter.SongHolder holder, final int i) {


        final SongInfo c = songs.get(i);

        holder.songName.setText(c.songName);
        holder.artistName.setText(c.artistName);

        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(onItemClickListener != null)
                {
                    onItemClickListener.onItemClick(holder.btn,view,c,i);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class SongHolder extends RecyclerView.ViewHolder {

        TextView songName,artistName;
        Button btn;


        public SongHolder(View itemView) {
            super(itemView);


            songName = (TextView)itemView.findViewById(R.id.tvSongName);
            artistName=(TextView)itemView.findViewById(R.id.tvArtistName);
            btn= (Button)itemView.findViewById(R.id.btn);
        }
    }
}
