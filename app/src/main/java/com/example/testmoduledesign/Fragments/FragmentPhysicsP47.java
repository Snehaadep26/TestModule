package com.example.testmoduledesign.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.testmoduledesign.MainActivityP47;
import com.example.testmoduledesign.MainActivityP49;
import com.example.testmoduledesign.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentPhysicsP47#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentPhysicsP47 extends Fragment {
    TextView textView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentPhysicsP47() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentPhysicsP47.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentPhysicsP47 newInstance(String param1, String param2) {
        FragmentPhysicsP47 fragment = new FragmentPhysicsP47();
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
        View view= inflater.inflate(R.layout.fragment_physics_p47, container, false);
        textView= view.findViewById(R.id.textView102p47);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(), MainActivityP49.class);
                startActivity(intent);
            }
        });
        return  view;
    }
}