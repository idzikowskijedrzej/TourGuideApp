package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguideapp.SightsFragment;

/**
 * {@link CategoryPagerAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Attraction} objects.
 */
public class CategoryPagerAdapter extends FragmentPagerAdapter {

    // Application context
    private Context mContext;

    /**
     * Create a new {@link CategoryPagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new CultureFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else {
            return new NightlifeFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_sights);
        } else if (position == 1) {
            return mContext.getString(R.string.category_culture);
        } else if (position == 2) {
            return mContext.getString(R.string.category_food);
        } else {
            return mContext.getString(R.string.category_nightlife);
        }
    }
}
