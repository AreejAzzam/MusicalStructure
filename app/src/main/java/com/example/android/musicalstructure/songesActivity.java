package com.example.android.musicalstructure;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.TextView;
import android.widget.Toast;
public class songesActivity extends AppCompatActivity {
    int idd;
    final ArrayList<songe> song = new ArrayList<songe>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_layout);
        song.add(new songe(R.drawable.dinasor, "CairoKee", "Dinasor"));
        song.add(new songe(R.drawable.ensan, "Hamza Namira", "ensan"));
        song.add(new songe(R.drawable.hello, "Adele", "Hello"));
        song.add(new songe(R.drawable.haymn, "Coldplay", "hyman for the weekend"));
        song.add(new songe(R.drawable.believer, "Imagine Dragons", "believer "));
        song.add(new songe(R.drawable.thunder, "Imagine Dragons", "Thunder"));
        song.add(new songe(R.drawable.mar, " Marshmello", "Find me"));
        song.add(new songe(R.drawable.kodaline, " kodaline", "high hopes"));
        song.add(new songe(R.drawable.scientidt, " coldplay", "scientist"));
        songAdapter adapter = new songAdapter(this, song);
        final ListView listView = (ListView) findViewById(R.id.listOfSongs);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setContentView(R.layout.activity_playing_now);
                ImageView img = (ImageView) findViewById(R.id.playedSongImage);
                img.setImageResource(song.get(position).getSongImage());
                TextView txt = (TextView) findViewById(R.id.songName);
                txt.setText(song.get(position).getSongName());
            }


        });
    }

}
