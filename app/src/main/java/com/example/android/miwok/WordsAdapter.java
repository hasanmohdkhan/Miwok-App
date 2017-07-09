package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hasanZian on 09-07-2017.
 */

public class WordsAdapter extends ArrayAdapter<Words> {

    //construtor
    public WordsAdapter(Activity context, ArrayList<Words> words) {
        super(context, 0, words);
    }
    //Words currentWords=getItem(position);


    /**
     * {@inheritDoc}
     *
     * @param position
     * @param convertView
     * @param parent
     */

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Convertview is assign in listItemView
        View listItemView = convertView;
        // if block for checking that listView is Null or not
        if (listItemView == null) {
            //inflating layout into
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //getting object of Words class and getting its postion for list
        Words currentWords = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_words
        TextView mWimok = (TextView) listItemView.findViewById(R.id.miwok_words);

        //setting wimok words to textview via getmMiwokWord
        //
        mWimok.setText(currentWords.getmMiwokWord());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView mEnglishCurrent = (TextView) listItemView.findViewById(R.id.englis_words);
        //setting english words to textview via method getMenglish
        //
        mEnglishCurrent.setText(currentWords.getmEnglishWord());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
