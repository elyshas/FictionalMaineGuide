package com.example.android.fictitiousmaineguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Referenced Miwok app and https://guides.codepath.com/android/google-play-style-tabs-using-tablayout#sliding-tabs-layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find viewpager that allows users to swipe between fragments --- **NOT CURRENTLY WORKING?**
        ViewPager viewPager = findViewById(R.id.viewpager);
        // Create adapter that displays the proper fragment per page/tab
        TabAdapter adapter = new TabAdapter(this, getSupportFragmentManager());
        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);
        // locate tab layout to display tabs
        TabLayout tabLayout = findViewById(R.id.tabs);

        // Connect tab layout to view pager
        tabLayout.setupWithViewPager(viewPager);

    }
}
