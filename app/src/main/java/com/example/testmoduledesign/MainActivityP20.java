package com.example.testmoduledesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.testmoduledesign.Fragments.FragmentChemistryP18;
import com.example.testmoduledesign.Fragments.FragmentMathsP20;
import com.example.testmoduledesign.Fragments.FragmentPhysicsP18;
import com.google.android.material.tabs.TabLayout;

public class MainActivityP20 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p20);
        tabLayout=(TabLayout)findViewById(R.id.tablayoutP20);
        viewPager=(ViewPager) findViewById(R.id.viewPagerP20);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentMathsP20(),"Mathematics(1-10)");
        adapter.AddFragment(new FragmentPhysicsP18(),"Physics(11-20)");
        adapter.AddFragment(new FragmentChemistryP18(),"Chemistry(21-30)");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}