package com.example.testmoduledesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.testmoduledesign.Fragments.FragmentAvailableP13;
import com.example.testmoduledesign.Fragments.FragmentMissedP13;
import com.example.testmoduledesign.Fragments.FragmentSubmittedP13;
import com.google.android.material.tabs.TabLayout;

public class MainActivityP13 extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    private ViewPagerAdapter adapter;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p13);
        toolbar=findViewById(R.id.toolbarp13);
        setSupportActionBar(toolbar);
        imageView=findViewById(R.id.backButtonp13);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        tabLayout = (TabLayout) findViewById(R.id.tablayoutp13);
        viewPager = (ViewPager) findViewById(R.id.viewPagerp13);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentAvailableP13(), "Available");
        adapter.AddFragment(new FragmentSubmittedP13(), "Submitted");
        adapter.AddFragment(new FragmentMissedP13(), "Missed");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#594099"));


    }
}