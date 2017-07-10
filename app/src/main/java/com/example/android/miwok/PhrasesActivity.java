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

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("Where are you going?", "minto wuksus"));
        words.add(new Words(" What is your name?", "tinnә oyaase'nә"));
        words.add(new Words("My name is...", "oyaaset..."));
        words.add(new Words("How are you feeling?", "michәksәs?"));
        words.add(new Words("I’m feeling good.", "kuchi achit"));
        words.add(new Words("Are you coming?", "әәnәs'aa?"));
        words.add(new Words("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Words("I’m coming.", "әәnәm"));
        words.add(new Words("Let’s go.", "yoowutis"));
        words.add(new Words("Come here.", "әnni'nem"));


        WordsAdapter itemAdapter = new WordsAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.list_view);


        listView.setAdapter(itemAdapter);


    }

}
