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

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("red", "weṭeṭṭi"));
        words.add(new Words("green", "chokokki"));
        words.add(new Words("brown", "ṭakaakki"));
        words.add(new Words("gray", "ṭopoppi"));
        words.add(new Words("black", "kululli"));
        words.add(new Words("white", "kelelli"));
        words.add(new Words("dusty yellow", "ṭopiisә"));
        words.add(new Words("mustard yellow", "chiwiiṭә"));


        WordsAdapter itemAdapter = new WordsAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.list_view);


        listView.setAdapter(itemAdapter);


    }


}

