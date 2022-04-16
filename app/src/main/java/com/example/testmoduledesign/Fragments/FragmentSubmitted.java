package com.example.testmoduledesign.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testmoduledesign.Adapters.SubmittedCard1Adapter;
import com.example.testmoduledesign.Adapters.SubmittedCard2Adapter;
import com.example.testmoduledesign.R;
import com.example.testmoduledesign.SubmittedCard1;
import com.example.testmoduledesign.SubmittedCard2;

import java.util.ArrayList;


public class FragmentSubmitted extends Fragment {

    ArrayList<SubmittedCard1> submittedCard1;
    ArrayList<SubmittedCard2> submittedCard2;
    RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3,layoutManager4;
    RecyclerView.Adapter adapter1,adapter2,adapter3,adapter4;
    View v;

    public FragmentSubmitted() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_submitted, container, false);
        createCard1();
        buildRecyclerView1();
        createCard2();
        buildRecyclerView2();
        buildRecyclerView3();
        buildRecyclerView4();

        return  v;
    }

    public void buildRecyclerView2() {
        recyclerView2 = v.findViewById(R.id.recyclerViewSC);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2 = new SubmittedCard2Adapter(submittedCard2, getContext());
        recyclerView2.setAdapter(adapter2);

    }

    public void createCard2() {
        submittedCard2=new ArrayList<>();
        submittedCard2.add(new SubmittedCard2("JEE Mock Test 2021","Mathematics","Physics","Chemistry","45Q","60mins","75marks","Result published on 12th July,2021"));

    }

    public void buildRecyclerView1() {
        recyclerView1 = v.findViewById(R.id.recyclerView2SC);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        adapter1 = new SubmittedCard1Adapter(submittedCard1, getContext());
        recyclerView1.setAdapter(adapter1);
    }

    public void createCard1() {
        submittedCard1=new ArrayList<>();
        submittedCard1.add(new SubmittedCard1("JEE Mock Test 2021","Mathematics","Physics","Chemistry","45Q","60mins","75marks","Result published on 12th July,2021"));

    }
    public void buildRecyclerView3() {
        recyclerView3 = v.findViewById(R.id.recyclerView3SC);
        recyclerView3.setHasFixedSize(true);
        layoutManager3 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView3.setLayoutManager(layoutManager3);
        adapter3 = new SubmittedCard2Adapter(submittedCard2, getContext());
        recyclerView3.setAdapter(adapter3);
    }
    public void buildRecyclerView4() {
        recyclerView4 = v.findViewById(R.id.recyclerView4SC);
        recyclerView4.setHasFixedSize(true);
        layoutManager4 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView4.setLayoutManager(layoutManager4);
        adapter4 = new SubmittedCard1Adapter(submittedCard1, getContext());
        recyclerView4.setAdapter(adapter4);
    }
}