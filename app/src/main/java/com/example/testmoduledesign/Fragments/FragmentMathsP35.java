package com.example.testmoduledesign.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.testmoduledesign.MainActivityP42;
import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class FragmentMathsP35 extends Fragment {


    ImageView imageView;

    Button button;
        public FragmentMathsP35() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_maths_p35, container, false);
        button=v.findViewById(R.id.button4p35);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MainActivityP42.class);
                startActivity(intent);
            }
        });


        return v;
    }
}