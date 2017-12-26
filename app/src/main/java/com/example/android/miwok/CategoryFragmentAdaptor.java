package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by hasanZian on 27-12-2017.
 */

public class CategoryFragmentAdaptor extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"Numbers", "Family", "Colors", "Phrases"};
    private Context context;


    public CategoryFragmentAdaptor(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();

        } else if (position == 1) {
            return new FamilyFragment();

        } else if (position == 2) {
            return new ColorsFragment();
        } else
            return new PhrasesFragment();
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
