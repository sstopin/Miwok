package com.example.android.tourguideapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
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

        TextView eventName = (TextView) listItemView.findViewById(R.id.eventName);
        eventName.setText(currentWord.getEventName());

        TextView eventAddress = (TextView) listItemView.findViewById(R.id.eventAddress);
        eventAddress.setText(currentWord.getEventAddress());

        TextView eventCity = (TextView) listItemView.findViewById(R.id.eventCity);
        eventCity.setText(currentWord.getEventCity());

        TextView eventHours = (TextView) listItemView.findViewById(R.id.eventHours);
        eventHours.setText(currentWord.getEventHours());

        ImageView eventImage = (ImageView) listItemView.findViewById(R.id.listImage);
        if (currentWord.hasImage()) {
            eventImage.setImageResource(currentWord.getImageId());
            eventImage.setVisibility(View.VISIBLE);
        }
        else{
            eventImage.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mBgColorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
