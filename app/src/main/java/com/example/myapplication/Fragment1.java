package com.example.myapplication;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment {

    public Fragment1() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1, container, false);

        Button BtnFragment2 = v.findViewById(R.id.btnFragment2);
        Button BtnFragment3 = v.findViewById(R.id.btnFragment3);

        BtnFragment2.setOnClickListener(new View.OnClickListener() {
            Fragment2 fragment2 = new Fragment2();
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity())replaceFragments(fragment2);
            }
        });
        BtnFragment3.setOnClickListener(new View.OnClickListener() {
            Fragment3 fragment3 = new Fragment3();
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity())replaceFragments(fragment3);
            }
        });
        return v;
    }
}