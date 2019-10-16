package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mBgColorId;
    private MediaPlayer mPlayer;

    public WordAdapter(Activity context, ArrayList<Word> words, int BgColorId){
        super(context, 0, words);

        mBgColorId = BgColorId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentWord = getItem(position);
        View listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokWord);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultWord);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView wordImage = (ImageView) listItemView.findViewById(R.id.miwokImage);
        if (currentWord.hasImage()) {
            wordImage.setImageResource(currentWord.getImageId());
            wordImage.setVisibility(View.VISIBLE);
        }
        else{
            wordImage.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mBgColorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
