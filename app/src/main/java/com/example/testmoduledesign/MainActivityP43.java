package com.example.testmoduledesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testmoduledesign.Adapters.PerformanceCardAdapterP42;

import java.util.ArrayList;

public class MainActivityP43 extends AppCompatActivity {

    ArrayList<PerformaceCardP42> availableCard;
    RecyclerView recyclerView1,recyclerView2;
    RecyclerView.LayoutManager layoutManager1,layoutManager2;
    RecyclerView.Adapter adapter1,adapter2;
    Button button;
    ConstraintLayout scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_p43);
        button=findViewById(R.id.button6p43);
        createCard1();
        buildRecyclerView1();
        createCard2();
        buildRecyclerView2();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),MainActivityP46.class);
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
        recyclerView2 = findViewById(R.id.recyclerViewP43);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2 = new PerformanceCardAdapterP42(availableCard, getApplicationContext());
        recyclerView2.setAdapter(adapter2);

    }
    private void buildRecyclerView2() {
        recyclerView2 = findViewById(R.id.recycler2p43);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2 = new PerformanceCardAdapterP42(availableCard, getApplicationContext());
        recyclerView2.setAdapter(adapter2);

    }

}