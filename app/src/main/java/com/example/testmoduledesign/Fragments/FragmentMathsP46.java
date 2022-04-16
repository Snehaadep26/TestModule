package com.example.testmoduledesign.Fragments;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testmoduledesign.R;


public class FragmentMathsP46 extends Fragment {

    View v;
    ConstraintLayout constraintLayout,constraintLayout2;


    public FragmentMathsP46() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_maths_p46, container, false);



        return v;
    }
}