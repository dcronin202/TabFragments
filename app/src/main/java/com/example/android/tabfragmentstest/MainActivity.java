package com.example.android.tabfragmentstest;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Toolbar toolbar;

    private MoviePagerAdapter mMoviePagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Starting.");

        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        mMoviePagerAdapter = new MoviePagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        MoviePagerAdapter adapter = new MoviePagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MovieOverviewFragment(),"Summary");
        adapter.addFragment(new MovieVideosFragment(),"Videos");
        adapter.addFragment(new MovieReviewsFragment(),"Reviews");
        mViewPager.setAdapter(adapter);
    }

}
