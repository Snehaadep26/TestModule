package com.example.testmoduledesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ProgressBar;

import com.example.testmoduledesign.Fragments.AssignmentFragment;
import com.example.testmoduledesign.Fragments.DigitalLibrFragment;
import com.example.testmoduledesign.Fragments.MoreFragment;
import com.example.testmoduledesign.Fragments.ScheduleFragment;
import com.example.testmoduledesign.Fragments.TestFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {


    NavController navController;
    Toolbar toolbar;
    ConstraintLayout parent_layout;
    AppBarConfiguration appBarConfiguration;
    int c=0;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        BottomNavigationView bottomNavigationView=findViewById(R.id.nav_bar_indicator);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer,new TestFragment()).commit();




    }
    public  BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment selectedFragment=null;
            switch (item.getItemId())
            {
                case R.id.schedule2:
                    selectedFragment=new ScheduleFragment();
                    break;
                case R.id.assignment:
                selectedFragment=new AssignmentFragment();
                break;
                case R.id.test2:
                    selectedFragment=new TestFragment();
                    break;
                case R.id.library2:
                selectedFragment=new DigitalLibrFragment();
                break;
                case R.id.more2:
                selectedFragment=new MoreFragment();
                break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.frameContainer,selectedFragment).commit();


            return true;
        }
    };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.tool_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


}