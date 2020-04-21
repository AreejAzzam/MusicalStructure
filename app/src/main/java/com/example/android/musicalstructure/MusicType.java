package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class MusicType extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_type);
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music(R.drawable.adele, "Adele"));
        music.add(new Music(R.drawable.coldplayy, "ColdPlay"));
        music.add(new Music(R.drawable.cairokee, "CairoKee"));
        music.add(new Music(R.drawable.hamza, "Hamza Namira"));
        music.add(new Music(R.drawable.kodaline, "Kodaline"));
        music.add(new Music(R.drawable.maeshimalo, "Maeshimalo"));
        musicAdapter adapter = new musicAdapter(this, music);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
