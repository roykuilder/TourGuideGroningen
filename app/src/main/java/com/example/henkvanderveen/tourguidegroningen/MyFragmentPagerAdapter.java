package com.example.henkvanderveen.tourguidegroningen;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter{

    /** String array holding the title for the fragment pages */
    private String tabTitles[] = new String[] {"Hotel", "Dinner", "Theatre", "Leisure"};

    /** Number of pages show in the ViewPager */
    private static final int NUMBER_OF_PAGES = 4;

    /** Constructor for MyFragmentPagerAdapter */
    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HotelFragment();
        } else if (position == 1) {
            return new DinnerFragment();
        } else if (position == 2) {
            return new TheatreFragment();
        } else {
            return new LeisureFragment();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_PAGES;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
