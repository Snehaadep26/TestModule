package com.example.testmoduledesign;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

import java.util.Calendar;
import java.util.TimeZone;

public class BottomSheetCalender extends Fragment {


    View v;
    TextView textView;
    Calendar calendar;
    BottomSheetDialog bottomSheetDialog;
    public BottomSheetCalender() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.bottom_sheet_calender, container, false);
//        textView=v.findViewById(R.id.textView14);
//        bottomSheetDialog.setOnShowListener(new DialogInterface.OnShowListener() {
//            @Override
//            public void onClick(View view) {
//                bottomSheetDialog = new BottomSheetDialog(getContext(), R.style.BottomSheetTheme);
//
//                View sheetView = LayoutInflater.from(getContext()).inflate(R.layout.bottom_sheet_calender, null);
//
//                sheetView.findViewById(R.id.cal_layout).setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                    }
//                });
//                bottomSheetDialog.setContentView(sheetView);
//                bottomSheetDialog.show();
//            }
//        });


        return  v;
    }
}