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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("father", "әpә"));
        words.add(new Words("mother", "әṭa"));
        words.add(new Words("son", "angsi"));
        words.add(new Words("daughter", "tune"));
        words.add(new Words("older brother", "taachi"));
        words.add(new Words("younger brother", "chalitti"));
        words.add(new Words("older sister", "teṭe"));
        words.add(new Words("younger sister", "kolliti"));
        words.add(new Words("grandmother", "ama"));
        words.add(new Words("grandfather", "paapa"));


        WordsAdapter itemAdapter = new WordsAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.list_view);


        listView.setAdapter(itemAdapter);


    }


}
