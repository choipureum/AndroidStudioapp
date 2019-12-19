package com.example.tabmaker;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class tabPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public tabPagerAdapter(FragmentManager fm,int tabCount){
        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                tabFragment1 tabFragment1 = new tabFragment1();
                return tabFragment1;
            case 1:
                tabFragment1 tabFragment2 = new tabFragment2();
                return tabFragment2;
            case 2:
                tabFragment1 tabFragment3 = new tabFragment3();
                return tabFragment3;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return tabCount;
    }
}
