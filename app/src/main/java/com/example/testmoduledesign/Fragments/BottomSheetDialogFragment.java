package com.example.testmoduledesign.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;


public class BottomSheetDialogFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    TextView textView;
    BottomSheetDialog bottomSheetDialog;






    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_bottom_sheet, container, false);
        textView=view.findViewById(R.id.customizeText);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetTheme);

                View sheetView = LayoutInflater.from(getContext()).inflate(R.layout.bottom_sheet_calender, null);

                sheetView.findViewById(R.id.cal_layout).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                });
                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
            }

        });
        //textView=view.findViewById(R.id.)

        // Inflate the layout for this fragment
        return view;
    }
}