package com.example.testmoduledesign.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testmoduledesign.MainActivityP47;
import com.example.testmoduledesign.MainActivityP53;
import com.example.testmoduledesign.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentPhysicsP49#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentPhysicsP49 extends Fragment {
    View view;
    TextView textView,textView2,textView3,textView4,textView5,nextText;
    ImageView imageView,imageView2,imageView3,imageView4,imageView5;
    ConstraintLayout constraintLayout,constraintLayout1;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentPhysicsP49() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentPhysicsP49.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentPhysicsP49 newInstance(String param1, String param2) {
        FragmentPhysicsP49 fragment = new FragmentPhysicsP49();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_physics_p49, container, false);
        textView= view.findViewById(R.id.textView102p49);
        constraintLayout=view.findViewById(R.id.constraintLayout4p49);
        constraintLayout1=view.findViewById(R.id.constraintLayout4);
        imageView=view.findViewById(R.id.imageView12);
        imageView2=view.findViewById(R.id.gateimgp49);
        textView2=view.findViewById(R.id.textView121);
        textView3=view.findViewById(R.id.infoGatep49);
        textView4=view.findViewById(R.id.unattemptTextp49);
        imageView3=view.findViewById(R.id.imageViewp49);
        imageView4=view.findViewById(R.id.unseenimageViewp49);
        textView5=view.findViewById(R.id.unseenTextp49);
        imageView5=view.findViewById(R.id.nextimgp49);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MainActivityP53.class);
                startActivity(intent);
            }
        });
        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  constraintLayout1.setVisibility(View.GONE);
                  imageView.setVisibility(View.GONE);
                imageView2.setVisibility(View.GONE);
                textView2.setVisibility(View.GONE);
                textView3.setVisibility(View.GONE);
                textView4.setVisibility(View.VISIBLE);
                imageView3.setVisibility(View.VISIBLE);
               textView5.setVisibility(View.GONE);
                imageView4.setVisibility(View.GONE);



            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView5.setVisibility(View.VISIBLE);
                imageView4.setVisibility(View.VISIBLE);
//                constraintLayout1.setVisibility(View.GONE);
//                imageView.setVisibility(View.GONE);
//                imageView2.setVisibility(View.GONE);
//                textView2.setVisibility(View.GONE);
//                textView3.setVisibility(View.GONE);
                textView4.setVisibility(View.GONE);
                imageView3.setVisibility(View.GONE);
            }
        });
        return  view;
    }

}