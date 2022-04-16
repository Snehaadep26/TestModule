package com.example.testmoduledesign.Fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testmoduledesign.MainActivityP23;
import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class FragmentMathsP20 extends Fragment {

    View v;
    TextView textView;
    ImageView imageView,imageView1;
    Button button;
    BottomSheetDialog bottomSheetDialog;


    public FragmentMathsP20() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_maths_p20, container, false);
        textView=v.findViewById(R.id.aBorderP20);
        imageView=v.findViewById(R.id.image1p20);
        button=v.findViewById(R.id.button2p20);



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogBuilder;
                AlertDialog alertDialog;
                alertDialogBuilder = new AlertDialog.Builder(getContext());
                View view1=View.inflate(getContext(),R.layout.popup_img,null);
                view1.setClipToOutline(true);
                alertDialogBuilder.setView(view1);
                alertDialog = alertDialogBuilder.create();

                alertDialog.show();

            }
        });
        imageView1=v.findViewById(R.id.downArrowp15p20);


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
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.isSelected())
                    textView.setBackgroundColor(Color.parseColor("#FFFFFF"));

                else
                    textView.setBackgroundColor(Color.parseColor("#594099"));
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MainActivityP23.class);
                startActivity(intent);
            }
        });
        return  v;
    }
}