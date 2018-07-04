package com.example.android.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(FragmentManager fm, Context context){
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position){
        if (position == 0) {
            return new ParksFragment();
        } else if (position == 1) {
            return new TrailsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new LandmarksFragment();
        }
    }

    @Override
    public  int getCount(){
        return 4;
    }

    @Override
    public  CharSequence getPageTitle(int position){
        if (position == 0) {
            return mContext.getString(R.string.category_parks);
        } else if (position == 1) {
            return mContext.getString(R.string.category_trails);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurants);
        } else {
            return mContext.getString(R.string.category_landmarks);
        }
    }
}
