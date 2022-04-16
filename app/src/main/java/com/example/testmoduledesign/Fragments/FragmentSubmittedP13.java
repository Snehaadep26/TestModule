package com.example.testmoduledesign.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testmoduledesign.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentSubmittedP13#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentSubmittedP13 extends Fragment {

    View v;

    public FragmentSubmittedP13() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_submitted_p13, container, false);
        return  v;
    }
}