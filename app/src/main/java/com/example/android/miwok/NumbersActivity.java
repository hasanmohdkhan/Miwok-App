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

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //String Array to store words -> english
        /** WHat we r doing here is passing two args in construtor of Words class
         * @param 1st arg in Words is English word
         *
         * @param 2st arg in Words is miwok wors
         */
        ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("One", "Lutti"));
        words.add(new Words("Two", "otiiko"));
        words.add(new Words("Three", "tolookosu"));
        words.add(new Words("Four", "oyyisa"));
        words.add(new Words("Five", "massokka"));
        words.add(new Words("Six", "temmokka"));
        words.add(new Words("Seven", "kenekaku"));
        words.add(new Words("Eight", "kawinta"));
        words.add(new Words("Nine", "wo’e"));
        words.add(new Words("Ten", "na’aacha"));


        WordsAdapter itemAdapter = new WordsAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.list_view);



        listView.setAdapter(itemAdapter);


    }


}
