package com.example.testmoduledesign.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testmoduledesign.Adapters.AvailableCard2Adapter;
import com.example.testmoduledesign.Adapters.AvailableCardAdapter;
import com.example.testmoduledesign.AvailableCard;
import com.example.testmoduledesign.AvailableCard2;
import com.example.testmoduledesign.R;

import java.util.ArrayList;

public class FragmentAvailable extends Fragment {
    ArrayList<AvailableCard> availableCard;
    ArrayList<AvailableCard2> availableCard2;
    RecyclerView recyclerView1,recyclerView2;
    RecyclerView.LayoutManager layoutManager1,layoutManager2;
    RecyclerView.Adapter adapter1,adapter2;
    View v;



    public FragmentAvailable() {
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_available, container, false);
        createCard1();
        buildRecyclerView1();
        createCard2();
        buildRecyclerView2();
        return  v;
    }

    private void createCard2() {
        availableCard2=new ArrayList<>();
        availableCard2.add(new AvailableCard2("All India Mock Test - 10","Mathematics","AUG15","9AM","Chemistry","Physics","72Q","90mins","100marks"));
        availableCard2.add(new AvailableCard2("All India Mock Test - 10","Mathematics","AUG15","9AM","Chemistry","Physics","72Q","90mins","100marks"));

    }

    private void buildRecyclerView2() {
        recyclerView2 = v.findViewById(R.id.recyclerView2AV);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2 = new AvailableCard2Adapter(availableCard2, getContext());
        recyclerView2.setAdapter(adapter2);

    }

    private void buildRecyclerView1() {
        recyclerView1 = v.findViewById(R.id.recyclerViewAV);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        adapter1 = new AvailableCardAdapter(availableCard, getContext());
        recyclerView1.setAdapter(adapter1);


    }

    public void createCard1() {
        availableCard=new ArrayList<>();
        availableCard.add(new AvailableCard("JEE Mock Test 2021","Mathematics","Physics","Chemistry","45Q","60min","75 marks"));

    }
}