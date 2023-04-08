package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment {




    public Fragment1() {}


    public static Fragment1 newInstance(String param1, String param2) {
        Fragment1 fragment = new Fragment1();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_1, container, false);

        Button Log_button = v.findViewById(R.id.to_Log_button);
        Button Sign_up_button = v.findViewById(R.id.to_Sign_up_button);

        Log_button.setOnClickListener(new View.OnClickListener() {
            Fragment2 fragment2 = new Fragment2();
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragments(fragment2);
            }
        });
        Sign_up_button.setOnClickListener(new View.OnClickListener() {
            Fragment3 fragment3 = new Fragment3();
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).replaceFragments(fragment3);
            }
        });
        return v;
    }
}