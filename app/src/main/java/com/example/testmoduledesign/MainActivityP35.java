package com.example.testmoduledesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testmoduledesign.Fragments.FragmentBottomSheetP36;
import com.example.testmoduledesign.Fragments.FragmentChemistryP18;
import com.example.testmoduledesign.Fragments.FragmentMathsP35;
import com.example.testmoduledesign.Fragments.FragmentPhysicsP18;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;

public class MainActivityP35 extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter adapter;
    BottomSheetDialog bottomSheetDialog1;
    ImageView imageView;
    TextView button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p35);
        tabLayout=(TabLayout)findViewById(R.id.tablayoutP35);
        viewPager=(ViewPager) findViewById(R.id.viewPagerP35);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());
        imageView=(ImageView)findViewById(R.id.backButtonp35);
        button=findViewById(R.id.submitbuttonp35);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertDialogBuilder;
                AlertDialog alertDialog;
                alertDialogBuilder = new AlertDialog.Builder(getApplicationContext());
                View view1=View.inflate(getApplicationContext(),R.layout.dialogbox_p39,null);
                view1.setClipToOutline(true);
                alertDialogBuilder.setView(view1);
                alertDialog = alertDialogBuilder.create();

                alertDialog.show();
            }
        });


        adapter.AddFragment(new FragmentMathsP35(),"Mathematics(1-10)");
        adapter.AddFragment(new FragmentPhysicsP18(),"Physics(11-20)");
        adapter.AddFragment(new FragmentChemistryP18(),"Chemistry(21-30)");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentBottomSheetP36 fragmentBottomSheet= new FragmentBottomSheetP36();
                fragmentBottomSheet.show(getSupportFragmentManager(),fragmentBottomSheet.getTag());
            }

        });
    }
}