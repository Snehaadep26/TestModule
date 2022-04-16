package com.example.testmoduledesign.Fragments;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.testmoduledesign.Adapters.SubjectsTestAdapter;
import com.example.testmoduledesign.R;
import com.example.testmoduledesign.SubjectsTest;
import com.example.testmoduledesign.TestAdapterOT;
import com.example.testmoduledesign.TestAdapterRecentPub;
import com.example.testmoduledesign.TestAdapterUpCoLive;
import com.example.testmoduledesign.TestOT;
import com.example.testmoduledesign.TestRecentPub;
import com.example.testmoduledesign.TestUpCoLive;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;


public class TestFragment extends Fragment {
    ConstraintLayout constraintLayout;
    BottomSheetDialog bottomSheetDialog,bottomSheetDialog1;
    TextView textView;
    View v;
    TextView range;
    ArrayList<TestOT> progressP8;
    ArrayList<TestRecentPub> testRecentPub;
    ArrayList<TestUpCoLive> testUpCoLive;
    ArrayList<SubjectsTest> subjectsTest;
    RecyclerView recyclerViewPP8,recyclerView2,recyclerView3,recyclerView4;
    RecyclerView.LayoutManager layoutManagerPP8,layoutManager2,layoutManager3,layoutManager4;
    RecyclerView.Adapter adapterPP8,adapter2,adapter3,adapter4;


    public TestFragment() {

    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_test, container, false);
//        Spinner spinnerLanguages=v.findViewById(R.id.spinner1);
//        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getContext(), R.array.Days, android.R.layout.simple_spinner_item);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
  //      spinnerLanguages.setAdapter(adapter);
         range=v.findViewById(R.id.customizeText);
        createCard1();
        buildRecyclerView1();
        createCard2();
        buildRecyclerView2();
        createCard3();
        buildRecyclerView3();
        createCard4();
        buildRecyclerView4();

        constraintLayout=v.findViewById(R.id.constraintLayoutp1);
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetTheme);

                View sheetView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_bottom_sheet, null);

                sheetView.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
            }

        });

        return v;
    }

    public void createCard4() {
        subjectsTest=new ArrayList<>();
        subjectsTest.add(new SubjectsTest(R.drawable.maths,"Mathematics","1 Test"));
        subjectsTest.add(new SubjectsTest(R.drawable.phy,"Physics","24 Test"));
        subjectsTest.add(new SubjectsTest(R.drawable.chem,"Chemistry","24 Test"));
        subjectsTest.add(new SubjectsTest(R.drawable.combined,"Combined test","24 Test"));


    }

    public void buildRecyclerView4()
    {
        recyclerView4 = v.findViewById(R.id.recycler4Subj);
        recyclerView4.setHasFixedSize(true);
        layoutManager4 = new GridLayoutManager(getContext(),2,RecyclerView.VERTICAL,false);
        recyclerView4.setLayoutManager(layoutManager4);
        adapter4 = new SubjectsTestAdapter(subjectsTest, getContext());
        recyclerView4.setAdapter(adapter4);

    }
    public void createCard3() {
        testUpCoLive=new ArrayList<>();
        testUpCoLive.add(new TestUpCoLive("All India Mock Test - 10","Mathematics","AUG15","9AM","Chemistry","Physics","72Q","90mins","100marks"));
        testUpCoLive.add(new TestUpCoLive("All India Mock Test - 10","Mathematics","AUG15","9AM","Chemistry","Physics","72Q","90mins","100marks"));

    }

    public void buildRecyclerView3() {
        recyclerView3 = v.findViewById(R.id.recyclerView3);
        recyclerView3.setHasFixedSize(true);
        layoutManager3 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView3.setLayoutManager(layoutManager3);
        adapter3 = new TestAdapterUpCoLive(testUpCoLive, getContext());
        recyclerView3.setAdapter(adapter3);

    }

    public void buildRecyclerView2() {
        recyclerView2 = v.findViewById(R.id.recyclerView2);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        adapter2 = new TestAdapterRecentPub(testRecentPub, getContext());
        recyclerView2.setAdapter(adapter2);
    }

    public void createCard2() {
        testRecentPub=new ArrayList<>();
        testRecentPub.add(new TestRecentPub("JEE Mock Test 2021","Mathematics","Physics","Chemistry","45Q","60min","75 marks","Result published on 12th July,2021"));

    }

    public void buildRecyclerView1() {
        recyclerViewPP8 = v.findViewById(R.id.recyclerViewOT);
        recyclerViewPP8.setHasFixedSize(true);
        layoutManagerPP8 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerViewPP8.setLayoutManager(layoutManagerPP8);
        adapterPP8 = new TestAdapterOT(progressP8, getContext());
        recyclerViewPP8.setAdapter(adapterPP8);

    }

    public void createCard1() {
        progressP8 = new ArrayList<>();
        progressP8.add(new TestOT("JEE Mock Test 2021","Mathematics","Physics","Chemistry","45Q","60min","75 marks"));

    }
}

