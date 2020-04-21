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

public class musicAdapter extends ArrayAdapter<Music> {
    musicAdapter(Activity context, ArrayList<Music> words) {
        super(context, 0, words);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }
        Music CurrentMusic = getItem(position);
        TextView musicGenerTextView = (TextView) listItemView.findViewById(R.id.musicType);
        musicGenerTextView.setText(CurrentMusic.getMusicgenres());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.MusicImage);
        iconView.setImageResource(CurrentMusic.getMusicphoto());
        return listItemView;
    }
}
