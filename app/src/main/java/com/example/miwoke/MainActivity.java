package com.example.miwoke;



import android.os.Bundle;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener {

    ActionBar actionBar;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int i, float v, int i1)
            {

            }

            @Override
            public void onPageSelected(int i)
            {
                actionBar.setSelectedNavigationItem(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        
        actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab familyTab = actionBar.newTab();
        familyTab.setText("Family");
        familyTab.setTabListener(this);

        ActionBar.Tab numbersTab = actionBar.newTab();
        numbersTab.setText("Numbers");
        numbersTab.setTabListener(this);

        ActionBar.Tab colorsTab = actionBar.newTab();
        colorsTab.setText("Colors");
        colorsTab.setTabListener(this);


        ActionBar.Tab phrasesTab = actionBar.newTab();
        phrasesTab.setText("Phrase");
        phrasesTab.setTabListener(this);


        actionBar.addTab(familyTab);
        actionBar.addTab(numbersTab);
        actionBar.addTab(colorsTab);
        actionBar.addTab(phrasesTab);

    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction)
    {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

    }
}
