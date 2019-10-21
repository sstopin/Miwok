package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new com.example.android.tourguideapp.SimpleFragmentAdapterPage(getSupportFragmentManager(),
                EventsActivity.this));

        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new com.example.android.tourguideapp.EventsFragment())
                .commit();
    }
}