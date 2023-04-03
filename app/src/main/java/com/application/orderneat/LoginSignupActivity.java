package com.application.orderneat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.application.orderneat.adapters.ViewPagerAdapter;
import com.application.orderneat.databinding.ActivityLoginSignupBinding;

public class LoginSignupActivity extends AppCompatActivity {
    private ActivityLoginSignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login_signup);

        binding = ActivityLoginSignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.getSupportActionBar().hide();

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Log In"));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Sign Up"));
        final ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, binding.tabLayout.getTabCount());
        binding.viewPager2.setAdapter(viewPagerAdapter);

    }
}