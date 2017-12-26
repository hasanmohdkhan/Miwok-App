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
public class FamilyFragment extends Fragment {

    private MediaPlayer mMediaPlayer;

    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_family, container, false);


        final ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("father", "әpә", R.drawable.family_father, R.raw.family_father));
        words.add(new Words("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Words("son", "angsi", R.drawable.family_son, R.raw.family_son));
        words.add(new Words("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Words("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Words("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Words("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Words("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Words("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Words("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));


        WordsAdapter itemAdapter = new WordsAdapter(getActivity(), words, R.color.category_family);


        ListView listView = (ListView) rootView.findViewById(R.id.list_view);


        listView.setAdapter(itemAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Words word = words.get(position);

                mMediaPlayer = MediaPlayer.create(getActivity(), word.getmResourceAduioID());
                mMediaPlayer.start();


            }
        });

        return rootView;
    }


}


