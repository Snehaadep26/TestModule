package com.example.testmoduledesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.testmoduledesign.Fragments.FragmentChemistryP18;
import com.example.testmoduledesign.Fragments.FragmentMathsP46;
import com.example.testmoduledesign.Fragments.FragmentPhysicsP59;
import com.example.testmoduledesign.Fragments.FragmentPhysicsP60;
import com.google.android.material.tabs.TabLayout;

public class MainActivityP60 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p60);
        tabLayout=(TabLayout)findViewById(R.id.tablayoutP60);
        viewPager=(ViewPager) findViewById(R.id.viewPagerP60);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentMathsP46(),"Mathematics(1-10)");
        adapter.AddFragment(new FragmentPhysicsP60(),"Physics(11-20)");
        adapter.AddFragment(new FragmentChemistryP18(),"Chemistry(21-30)");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}