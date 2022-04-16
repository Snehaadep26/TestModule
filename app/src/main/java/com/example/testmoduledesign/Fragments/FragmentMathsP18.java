package com.example.testmoduledesign.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.testmoduledesign.MainActivityP20;
import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class FragmentMathsP18 extends Fragment {

    View v;
    ImageView imageView;
    TextView textView,textView2;
    ScrollView scrollView;
    BottomSheetDialog bottomSheetDialog;

    public FragmentMathsP18() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v=inflater.inflate(R.layout.fragment_maths_p18, container, false);
        imageView=v.findViewById(R.id.downArrowp15p18);
        scrollView=v.findViewById(R.id.sharep19);
        textView=v.findViewById(R.id.textView102p18);



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentBottomSheetDialogP18 fragmentBottomSheet= new FragmentBottomSheetDialogP18();
                fragmentBottomSheet.show(getFragmentManager(),fragmentBottomSheet.getTag());
            }

        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MainActivityP20.class);
                startActivity(intent);
//                Fragment fragment=new FragmentMathsP20();
//                FragmentTransaction fm=getActivity().getSupportFragmentManager().beginTransaction();
//                fm.replace(R.id.viewPagerP18,fragment);


            }
        });


        return  v;
    }


}