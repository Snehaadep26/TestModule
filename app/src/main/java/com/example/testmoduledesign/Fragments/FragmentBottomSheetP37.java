package com.example.testmoduledesign.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class FragmentBottomSheetP37 extends BottomSheetDialogFragment {

    View v;
    TextView textView;
    Button button;
    ScrollView scrollView;
    //BottomSheetListener bottomSheetListener;
    public FragmentBottomSheetP37() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_bottom_sheet_p37, container, false);
        button=v.findViewById(R.id.submitButtonP37);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),FragmentMathsTestP38.class);
                startActivity(intent);
            }
        });
        return v;


    }
//    public interface BottomSheetListener{
//        void onTextClicked(Class<FragmentMathsP20> fragment);
//    }
//    @Override
//    public void onAttach(Context context)
//    {
//        super.onAttach(context);
//        try {
//            bottomSheetListener=(BottomSheetListener) context;
//        }catch (ClassCastException e){
//            throw  new ClassCastException(context.toString()+"implemented");
//
//        }
//    }
}