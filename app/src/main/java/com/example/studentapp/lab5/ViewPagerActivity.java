package com.example.studentapp.lab5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.studentapp.R;
import com.google.android.material.tabs.TabLayout;

public class ViewPagerActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        InitPagerView();
    }

    private void InitPagerView() {
        viewPager=findViewById(R.id.studentViewPager);
        tabLayout=findViewById(R.id.studentTabLayout);
        viewPagerAdapter vpa=new viewPagerAdapter(getSupportFragmentManager());

        vpa.addFragment(new BlankFragment1(),"Fragment A");
        vpa.addFragment(new BlankFragment2(),"Fragment B");
        vpa.addFragment(new BlankFragment3(),"Fragment C");
        vpa.addFragment(new BlankFragment4(),"Fragment D");

        viewPager.setAdapter(vpa);
        //to set limit of initilaized fragment, by default 1( 1-current-1 )
        viewPager.setOffscreenPageLimit(3);
        tabLayout.setupWithViewPager(viewPager);

    }
}