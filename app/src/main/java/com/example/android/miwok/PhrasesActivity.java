/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    /*** Media Player Class varibale  init ***/
    private MediaPlayer mMediaPlayer;

    /***End  Media Player Class varibale  init ***/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

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


        WordsAdapter itemAdapter = new WordsAdapter(this, words, R.color.category_phrases);


        ListView listView = (ListView) findViewById(R.id.list_view);


        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //getting current postion in list

                Words word = words.get(position);
                //using word for example here it is 0 th postion
                // now using this to get the mp3 file from raw dirctory
                //word.getmResourceAduioID()
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getmResourceAduioID());
                mMediaPlayer.start();


            }
        });




    }

}
