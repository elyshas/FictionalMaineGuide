package com.example.android.fictitiousmaineguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by elysh on 8/15/2018.
 */

// Code bits taken from Miwok App and video lesson ("Tabs and ViewPager (Android Development Patterns Ep 9")
public class TabAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public TabAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Location1Fragment();
        } else if (position == 1) {
            return new Location2Fragment();
        } else if (position == 2) {
            return new Location3Fragment();
        } else {
            return new Location4Fragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.cabotCoveTab);
        } else if (position == 1) {
            return mContext.getString(R.string.derryTab);
        } else if (position == 2) {
            return mContext.getString(R.string.darkScoreLakeTab);
        } else {
            return mContext.getString(R.string.littleTallIslandTab);
        }
    }

}
