package com.example.testmoduledesign.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testmoduledesign.MainActivityP28;
import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

public class FragmentMathsP23 extends Fragment {

    View v;
    ImageView imageView,imageView2;
    TextView textView;
    Button button;
    BottomSheetDialog bottomSheetDialog,bottomSheetDialog1;
    ConstraintLayout constraintLayout;
    public FragmentMathsP23() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_maths_p23, container, false);
        imageView=v.findViewById(R.id.downArrowp15p23);
        button=v.findViewById(R.id.savebuttonp23);

        constraintLayout=v.findViewById(R.id.front_image_layout);
        imageView2=v.findViewById(R.id.addCirclep23);

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomSheetDialog1 = new BottomSheetDialog(getContext(), R.style.BottomSheetTheme);

                View sheetView = LayoutInflater.from(getContext()).inflate(R.layout.bottom_sheet_p23, null);

                sheetView.findViewById(R.id.sharep23).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                });
                bottomSheetDialog1.setContentView(sheetView);
                bottomSheetDialog1.show();
            }
        });


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
                Intent intent=new Intent(getContext(), MainActivityP28.class);
                startActivity(intent);
            }
        });


        return  v;
    }
//    public void onClick(View view) {
//        FragmentMathsP23 fragment2 = new FragmentMathsP23();
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frameContainer, fragment2);
//        fragmentTransaction.commit();
//    }

}