package com.example.testmoduledesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;

import com.example.testmoduledesign.Fragments.FragmentAvailable;
import com.example.testmoduledesign.Fragments.FragmentMissed;
import com.example.testmoduledesign.Fragments.FragmentSubmitted;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import javax.security.auth.Subject;

public class MainActivityP6 extends AppCompatActivity {
    Toolbar toolbar;


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private Button bottomSheet;
    private BottomSheetDialog bottomSheetDialog;
    private Toolbar customToolbar;
    RecyclerView recyclerViewDue;

    RecyclerView.LayoutManager DueCardLayoutManager;
    ArrayList<Subject> subjects = new ArrayList<>();
    RecyclerView recyclerViewSubject;
    RecyclerView.Adapter subjectAdapter;
    RecyclerView.LayoutManager SubjectCardLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p6);
        toolbar=findViewById(R.id.customToolbar);
        setSupportActionBar(customToolbar);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.AddFragment(new FragmentAvailable(), "Available");
        adapter.AddFragment(new FragmentSubmitted(), "Submitted");
        adapter.AddFragment(new FragmentMissed(), "Missed");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#594099"));


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
}