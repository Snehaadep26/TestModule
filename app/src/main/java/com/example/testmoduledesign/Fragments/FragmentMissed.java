package com.example.testmoduledesign.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testmoduledesign.Adapters.MissedCardAdapter;
import com.example.testmoduledesign.MissedCard;
import com.example.testmoduledesign.R;

import java.util.ArrayList;


public class FragmentMissed extends Fragment {

    ArrayList<MissedCard> missedCard;
    RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3,layoutManager4;
    RecyclerView.Adapter adapter1,adapter2,adapter3,adapter4;
    View v;


    public FragmentMissed() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_missed, container, false);
       createCard1();
       buildRecyclerView1();
        return  v;
    }

    public void createCard1() {
        missedCard=new ArrayList<>();
        missedCard.add(new MissedCard("JEE Mock Test 2021","Mathematics","Physics","Chemistry","45Q","60mins","75marks","Test expired"));
        missedCard.add(new MissedCard("JEE Mock Test 2021","Mathematics","Physics","Chemistry","45Q","60mins","75marks","Test expired"));

    }

    public void buildRecyclerView1() {
        recyclerView1 = v.findViewById(R.id.recyclerViewMisd);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        adapter1 = new MissedCardAdapter(missedCard, getContext());
        recyclerView1.setAdapter(adapter1);
    }
}