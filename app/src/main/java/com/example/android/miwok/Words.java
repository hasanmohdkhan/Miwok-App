package com.example.android.miwok;

/**
 * Created by hasanZian on 09-07-2017.
 * Class word it is used to set listview item for two field
 * i.e english word and miwok word
 * used in adapter to set more than two value in ArrayList
 */

public class Words {
    /*
    * private variables to protect class
    * from outside access
    *
    * */
    private String mMiwokWord;
    private String mEnglishWord;

    /*Construtor here with two argruments
    * */

    /**
     * @param vMiwokWord   args for miwok word
     * @param vEnglishWord args for miwok English
     */
    public Words(String vEnglishWord, String vMiwokWord) {
        mEnglishWord = vEnglishWord;
        mMiwokWord = vMiwokWord;

    }

    //
    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public String getmEnglishWord() {
        return mEnglishWord;
    }
}
