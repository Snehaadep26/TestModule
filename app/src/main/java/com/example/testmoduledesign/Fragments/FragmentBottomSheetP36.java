package com.example.testmoduledesign.Fragments;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class FragmentBottomSheetP36 extends BottomSheetDialogFragment {

    View v;
    Button scrollView;

    //BottomSheetListener bottomSheetListener;
    public FragmentBottomSheetP36() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_bottom_sheet_p36, container, false);

        scrollView=v.findViewById(R.id.button5p36);
        scrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentBottomSheetP37 fragmentBottomSheet= new FragmentBottomSheetP37();
                fragmentBottomSheet.show(getFragmentManager(),fragmentBottomSheet.getTag());
            }
        });




        return v;


    }

}