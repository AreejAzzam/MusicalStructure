package com.example.android.musicalstructure;

public class Music {
    private int musicImage;
    private String musicgenres;

    public Music(int musicImage, String musicType) {
        this.musicImage = musicImage;
        this.musicgenres = musicType;
    }

    public String getMusicgenres() {
        return musicgenres;
    }

    public int getMusicphoto() {
        return musicImage;
    }
}
