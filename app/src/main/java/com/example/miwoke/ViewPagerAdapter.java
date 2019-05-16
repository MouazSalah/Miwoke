package com.example.miwoke;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter
{
    public ViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int i)
    {
        Fragment fragment = null;
        switch (i)
        {
            case 0:
                fragment = new FamilyFragment();
                break;
            case 1:
                fragment = new NumbersFragment();
                break;
            case 2:
                fragment = new ColorsFragment();
                break;
            case 3:
                fragment = new PhrasesFragment();
                break;

        }
        return fragment;
    }

    @Override
    public int getCount()
    {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        if (position == 0)
        {
            return "Family";
        }
        else if (position == 1)
        {
            return "Numbers";
        }
        else if (position == 2)
        {
            return "Colors";
        }
        else
        {
            return "Phrases";
        }
    }
}
