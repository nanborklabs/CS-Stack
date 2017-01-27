package com.csstack.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.csstack.TopicFragment;

/**
 * Created by nandhu on 26/1/17.
 *
 *
 */
public class ChapterPagerAdapter extends FragmentPagerAdapter {
    public ChapterPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        TopicFragment mFragment = null;

        return mFragment;
    }

    @Override
    public int getCount() {
        return 0;
    }
}
