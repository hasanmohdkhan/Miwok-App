package com.example.android.miwok;

/**
 * Created by hasanZian on 09-07-2017.
 * Class word it is used to set listview item for two field
 * i.e english word and miwok word
 * used in adapter to set more than two value in ArrayList
 */

public class Words {

    private static final int NO_IMAGE_IS_PROVIDED = -1;
    /*
    * private variables to protect class
    * from outside access
    *
    * */
    private String mMiwokWord;

    //variable i.e CONSTANT so we will able to check the that actvity having image or not
    // -1 here it make sure that no resources id matach to it
    // so we used -1 here :-)


    //setting imageresorceid as constant
    /* We are starting imageresource is in NO Image resourves as defalult
     * As it have one then image --> mImageResourceID = R.drawbale.color_one
     * */
    private String mEnglishWord;
    private int mImageResourceID = NO_IMAGE_IS_PROVIDED;

    private int mResourceAduioID;


    /*Construtor here with two argruments
    *
    *  vMiwokWord for miwok word
    *   vEnglishWord for english word
    *   For phrase layout which not having image in them
    *  ResourceAduioID for audio resources
    *   */


    public Words(String mMiwokWord, String mEnglishWord, int ResourceAduioID) {
        this.mMiwokWord = mMiwokWord;
        this.mEnglishWord = mEnglishWord;
        this.mResourceAduioID = ResourceAduioID;
    }











    /*Construtor here with three argruments
    *   vMiwokWord for miwok word
    *   vEnglishWord for english word
    *   vImageResource for image resource
    *  ResourceAduioID for audio resources
    *
    *   */


    public Words(String mMiwokWord, String mEnglishWord, int mImageResourceID, int ResourceAduioID) {
        this.mMiwokWord = mMiwokWord;
        this.mEnglishWord = mEnglishWord;
        this.mImageResourceID = mImageResourceID;
        this.mResourceAduioID = ResourceAduioID;
    }


    //getter method declare public
    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public String getmEnglishWord() {
        return mEnglishWord;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public int getmResourceAduioID() {
        return mResourceAduioID;
    }

   /* Here is the method that return true or false
    *  if image is present then true or if not then false
    *
    * We later use this value in WordsAdapter to check
    * that image is present or not
    *
    *
    *
    * */


    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_IS_PROVIDED;


    }


}
