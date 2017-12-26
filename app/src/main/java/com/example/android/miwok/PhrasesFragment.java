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
public class PhrasesFragment extends Fragment {

    /*** Media Player Class varibale  init ***/
    private MediaPlayer mMediaPlayer;

    /***End  Media Player Class varibale  init ***/
    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_phrases, container, false);


        /**   Final to access word class varible in side this class or locally */


        final ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new Words("What is your name?", "tinnә oyaase'nә", R.raw.phrase_my_name_is));
        words.add(new Words("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        words.add(new Words("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        words.add(new Words("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Words("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        words.add(new Words("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        words.add(new Words("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        words.add(new Words("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        words.add(new Words("Come here.", "әnni'nem", R.raw.phrase_come_here));


        WordsAdapter itemAdapter = new WordsAdapter(getActivity(), words, R.color.category_phrases);


        ListView listView = (ListView) rootView.findViewById(R.id.list_view);


        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //getting current postion in list

                Words word = words.get(position);
                //using word for example here it is 0 th postion
                // now using this to get the mp3 file from raw dirctory
                //word.getmResourceAduioID()
                mMediaPlayer = MediaPlayer.create(getActivity(), word.getmResourceAduioID());
                mMediaPlayer.start();


            }
        });


        return rootView;
    }

}
