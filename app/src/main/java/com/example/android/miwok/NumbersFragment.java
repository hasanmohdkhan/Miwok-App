package com.example.android.miwok;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NumbersFragment extends Fragment {

    private MediaPlayer mMediaPlayer;

    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_numbers, container, false);

        //String Array to store words -> english
        /** WHat we r doing here is passing two args in construtor of Words class
         * @param 1st arg in Words is English word
         *
         * @param 2st arg in Words is miwok wors
         */
        final ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("One", "Lutti", R.drawable.number_one, R.raw.number_one));
        words.add(new Words("Two", "otiiko", R.drawable.number_two, R.raw.number_two));
        words.add(new Words("Three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        words.add(new Words("Four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        words.add(new Words("Five", "massokka", R.drawable.number_five, R.raw.number_five));
        words.add(new Words("Six", "temmokka", R.drawable.number_six, R.raw.number_six));
        words.add(new Words("Seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Words("Eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Words("Nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Words("Ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));


        WordsAdapter itemAdapter = new WordsAdapter(getActivity(), words, R.color.category_numbers);


        ListView listView = (ListView) rootview.findViewById(R.id.list_view);


        listView.setAdapter(itemAdapter);


        //onItemOnClickListener here

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Words word = words.get(position);

                mMediaPlayer = MediaPlayer.create(getActivity(), word.getmResourceAduioID());
                mMediaPlayer.start();


            }
        });


        // === EOD onItemOnClickListener here


        return rootview;
    }

}
