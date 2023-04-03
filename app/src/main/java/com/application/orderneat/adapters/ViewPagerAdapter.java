package com.application.orderneat.adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.application.orderneat.ui.login.LoginFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {
    int totalTabs;

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, int totalTabs) {
        super(fragmentActivity);
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                LoginFragment loginFragment = new LoginFragment();
                return loginFragment;
//            case 1:
//                SportFragment sportFragment = new SportFragment();
//                return sportFragment;
//            case 2:
//                MovieFragment movieFragment = new MovieFragment();
//                return movieFragment;
            default:
                return null;
        }
    }

    // this counts total number of tabs
    @Override
    public int getItemCount() {
        return totalTabs;
    }
}
