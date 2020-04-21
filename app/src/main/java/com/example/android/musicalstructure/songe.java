package com.example.android.musicalstructure;


public class songe {

    String ArtistName;
    String songName;
    int songImage;

    public songe(int songImage, String ArtistName, String songName) {
        this.songName = songName;
        this.ArtistName = ArtistName;
        this.songImage = songImage;
    }

    public int getSongImage() {
        return songImage;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public String getSongName() {
        return songName;
    }


}

