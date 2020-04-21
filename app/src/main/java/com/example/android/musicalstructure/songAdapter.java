package com.example.android.musicalstructure;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class songAdapter extends ArrayAdapter<songe> {

    songAdapter(Activity context, ArrayList<songe> song) {
        super(context, 0, song);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listsong_item, parent, false);

        }

        songe CurrentSong = getItem(position);
        TextView songeName = (TextView) listItemView.findViewById(R.id.artistName);
        songeName.setText(CurrentSong.getSongName());
        TextView artistName = (TextView) listItemView.findViewById(R.id.Name);
        artistName.setText(CurrentSong.getArtistName());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.MusicImage);
        iconView.setImageResource(CurrentSong.getSongImage());


        return listItemView;
    }

}
