package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        Word currentWord = getItem(position);
        View listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);

        Activity act = (Activity) getContext();
        String testss = (String) act.getTitle();

        if (act.getTitle().equals("Numbers")) {
            LinearLayout linearLayoutList = (LinearLayout) listItemView.findViewById(R.id.listItemLinearLayout);
            linearLayoutList.setBackgroundResource(R.color.category_numbers);
        }
        else if (act.getTitle().equals("Family")) {
            LinearLayout linearLayoutList = (LinearLayout) listItemView.findViewById(R.id.listItemLinearLayout);
            linearLayoutList.setBackgroundResource(R.color.category_family);
        }
        else if (act.getTitle().equals("Colors")) {
            LinearLayout linearLayoutList = (LinearLayout) listItemView.findViewById(R.id.listItemLinearLayout);
            linearLayoutList.setBackgroundResource(R.color.category_colors);
        }
        else if (act.getTitle().equals("Phrases")) {
            LinearLayout linearLayoutList = (LinearLayout) listItemView.findViewById(R.id.listItemLinearLayout);
            linearLayoutList.setBackgroundResource(R.color.category_phrases);
        }


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

        return listItemView;
    }
}
