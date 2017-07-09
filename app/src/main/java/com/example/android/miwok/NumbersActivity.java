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
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //String Array to store words -> english
       ArrayList<String> words=new ArrayList<>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        //Logs
      //  Log.v("NumbersActivity","Words At index 6 "+words.get(5));
       // Log.v("NumbersActivity","Words At index 0 "+words.get(0));
         //

        LinearLayout rootView=(LinearLayout)findViewById(R.id.rootview);

      // for loop for updating list in rootview
        for (int i=0;  i <  words.size() ; i++)
            //Log.v("NumbersActivity","Index: "+index+ " Value: "+ words.get(index));
           {
               TextView wordsview = new TextView(this);
               wordsview.setText(words.get(i));
               rootView.addView(wordsview);
               // TODO: 08-07-2017  Video no: 45 view it
           }















    }
}
