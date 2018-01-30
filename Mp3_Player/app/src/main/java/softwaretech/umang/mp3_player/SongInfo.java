package softwaretech.umang.mp3_player;

/**
 * Created by UMANG on 9/10/2017.
 */

public class SongInfo {

    public String songUrl,artistName,songName;

    public SongInfo()
    {


    }
    public SongInfo(String songName,String artistName,String songUrl)
    {
        this.songName= songName;
        this.artistName= artistName;
        this.songUrl= songUrl;
    }
    public String getSongname() {
        return songName;
    }

    public void setSongname(String songname) {
        songname = songname;
    }

    public String getArtistname() {
        return artistName;
    }

    public void setArtistname(String artistname) {
        artistname = artistname;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        songUrl = songUrl;
    }
}

