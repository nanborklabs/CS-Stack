package com.csstack;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by nandhu on 26/1/17.
 *
 */

public class ChapterActivity extends AppCompatActivity {



    ChapterPagerAdapter mAdapter = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_activity);

        ViewPager mPager  = (ViewPager) findViewById(R.id.chapter_pager);



        /*Based on year and Subject get The Titles for Chapter */
        mAdapter = new ChapterPagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mAdapter);





    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
