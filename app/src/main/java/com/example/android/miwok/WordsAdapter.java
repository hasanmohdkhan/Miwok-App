package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hasanZian on 09-07-2017.
 */

public class WordsAdapter extends ArrayAdapter<Words> {

    //variable for color to change color dynamically
    //
    private int mColorResourceID;

    //construtor
    public WordsAdapter(Activity context, ArrayList<Words> words, int colorResourceId) {

        super(context, 0, words);

        mColorResourceID = colorResourceId;
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

        /*
        *
        * Setting color of text_container
        *  1-find view with help of listview
        *  setting color to each passing activity
        * */

        View textContainer = listItemView.findViewById(R.id.text_container);

        //  Find the color that the resource ID  map it
        int color = ContextCompat.getColor(getContext(), mColorResourceID);

        //setting color we get to background in text_container
        textContainer.setBackgroundColor(color);




        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView mEnglishCurrent = (TextView) listItemView.findViewById(R.id.englis_words);
        //setting english words to textview via method getMenglish
        //
        mEnglishCurrent.setText(currentWords.getmEnglishWord());

        //Init... Image View in List
        ImageView mIcon = (ImageView) listItemView.findViewById(R.id.icon_view);

        /* Logic to check if herei s image or not
        * And set image visibility according to that
        *
        * */
        if (currentWords.hasImage()) {
            // Getting image from list vai construtor method getimageresoureId
            mIcon.setImageResource(currentWords.getmImageResourceID());
            mIcon.setVisibility(View.VISIBLE);
        } else {
            // There is no image so we remove iamge view
            mIcon.setVisibility(View.GONE);
        }










        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
