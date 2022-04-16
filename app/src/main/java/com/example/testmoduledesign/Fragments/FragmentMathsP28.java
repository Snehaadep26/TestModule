package com.example.testmoduledesign.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testmoduledesign.MainActivityP28;
import com.example.testmoduledesign.MainActivityP31;
import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class FragmentMathsP28 extends Fragment {

   View v;
   Button button;
   TextView textView;
   BottomSheetDialog bottomSheetDialog;
   ImageView imageView;
    public FragmentMathsP28() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_maths_p28, container, false);
        button=v.findViewById(R.id.button4p28);
        imageView=v.findViewById(R.id.downArrowp15p28);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetTheme);

                View sheetView = LayoutInflater.from(getContext()).inflate(R.layout.bottom_sheetp19, null);

                sheetView.findViewById(R.id.sharep19).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MainActivityP31.class);
                startActivity(intent);
            }
        });
        return  v;

    }
}