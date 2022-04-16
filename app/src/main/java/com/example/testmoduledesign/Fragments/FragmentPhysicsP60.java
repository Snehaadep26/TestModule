package com.example.testmoduledesign.Fragments;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testmoduledesign.R;


public class FragmentPhysicsP60 extends Fragment {

    TextView textView,textView2,textView3,textView4;
    ImageView imageView,imageView2;
    ConstraintLayout constraintLayout;


    public FragmentPhysicsP60() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_physics_p60, container, false);
        textView=view.findViewById(R.id.textView20p60);
        textView2=view.findViewById(R.id.textView20p601);
        textView3=view.findViewById(R.id.infoGatep60);
        imageView=view.findViewById(R.id.gateimgp60);
        imageView2=view.findViewById(R.id.paperimgp60);
        constraintLayout=view.findViewById(R.id.constraintLayout4p60);
        textView4=view.findViewById(R.id.textView102p60);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.GONE);
                textView2.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.GONE);
                imageView.setVisibility(View.GONE);
                imageView2.setVisibility(View.VISIBLE);
                constraintLayout.setVisibility(View.GONE);

            }
        });
        return  view;
    }
}