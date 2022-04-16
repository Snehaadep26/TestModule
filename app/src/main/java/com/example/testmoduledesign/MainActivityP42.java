package com.example.testmoduledesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import com.example.testmoduledesign.Adapters.AvailableCard2Adapter;
import com.example.testmoduledesign.Adapters.PerformanceCardAdapterP42;

import java.util.ArrayList;

public class MainActivityP42 extends AppCompatActivity {

    ArrayList<PerformaceCardP42> availableCard;
    RecyclerView recyclerView1,recyclerView2;
    RecyclerView.LayoutManager layoutManager1,layoutManager2;
    RecyclerView.Adapter adapter1,adapter2;
    Button button;
    ConstraintLayout scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p42);
        button=findViewById(R.id.button6p42);
//        scrollView=findViewById(R.id.const1P42);
//        scrollView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(getApplicationContext(),MainActivityP43.class);
//                startActivity(intent);
//            }
//        });
        createCard1();
        buildRecyclerView1();

        createCard2();
        buildRecyclerView2();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivityP43.class);
                startActivity(intent);
            }
        });
    }
    private void createCard1() {
        availableCard=new ArrayList<>();
        availableCard.add(new PerformaceCardP42("Rank","23","/45",R.drawable.rankimg));
        availableCard.add(new PerformaceCardP42("Accuracy","8","%",R.drawable.accuracy));



    }

    private void createCard2() {
        availableCard=new ArrayList<>();

        availableCard.add(new PerformaceCardP42("Speed","2","Mins/Qs",R.drawable.speed));
        availableCard.add(new PerformaceCardP42("Percentile","96","%",R.drawable.percentile));


    }
    private void buildRecyclerView1() {
        recyclerView2 = findViewById(R.id.recyclerViewP42);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2 = new PerformanceCardAdapterP42(availableCard, getApplicationContext());
        recyclerView2.setAdapter(adapter2);

    }
    private void buildRecyclerView2() {
        recyclerView2 = findViewById(R.id.recycler2p42);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2 = new PerformanceCardAdapterP42(availableCard, getApplicationContext());
        recyclerView2.setAdapter(adapter2);

    }


}