package com.example.testmoduledesign.Fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testmoduledesign.MainActivityP35;
import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class FragmentMathsP31 extends Fragment {

    View v;
    ConstraintLayout constraintLayout;
    TextView textView;
    BottomSheetDialog bottomSheetDialog;
    ImageView imageView,imageView1;
    Button button;

    public FragmentMathsP31() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_maths_p31, container, false);
        textView=v.findViewById(R.id.aBorderP31);
        imageView=v.findViewById(R.id.imageView10p31);
        imageView1=v.findViewById(R.id.downArrowp15p31);
        button=v.findViewById(R.id.button4p31);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MainActivityP35.class);
                startActivity(intent);
            }
        });
//        constraintLayout=v.findViewById(R.id.const3p31);
//        constraintLayout=v.findViewById(R.id.constp31);
//        constraintLayout=v.findViewById(R.id.const2p31);
//        constraintLayout=v.findViewById(R.id.constraintLayout2p31);
//
//        constraintLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                textView.setOnClickListener(new View.OnClickListener() {
////                    @Override
////                    public void onClick(View view) {
////                        textView.setBackgroundColor(Color.BLUE);
////                    }
////                });
//
//
//            }
//        });
        imageView1.setOnClickListener(new View.OnClickListener() {
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
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder;
                AlertDialog alertDialog;
                alertDialogBuilder = new AlertDialog.Builder(getContext());
                View view1=View.inflate(getContext(),R.layout.popup_impp31,null);
                view1.setClipToOutline(true);
                alertDialogBuilder.setView(view1);
                alertDialog = alertDialogBuilder.create();

                alertDialog.show();

            }
        });
        return v;
    }
}