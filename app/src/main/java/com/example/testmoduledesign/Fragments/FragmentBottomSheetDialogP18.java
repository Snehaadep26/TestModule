package com.example.testmoduledesign.Fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.testmoduledesign.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class FragmentBottomSheetDialogP18 extends BottomSheetDialogFragment {

    View v;
    TextView textView;

    //BottomSheetListener bottomSheetListener;
    public FragmentBottomSheetDialogP18() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_bottom_sheetp18, container, false);
//        textView=v.findViewById(R.id.oneBorderP19);
//        TextView textView1=v.findViewById(R.id.oneBorderP19);
//        textView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                bottomSheetListener.onTextClicked(FragmentMathsP20.class);
//                dismiss();
//            }
//        });
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Fragment fragment=new FragmentMathsP20();
//                FragmentTransaction fm=getActivity().getSupportFragmentManager().beginTransaction();
//                fm.replace(R.id.frameContainer,fragment);
//                fm.commit();
//
//            }
//        });


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