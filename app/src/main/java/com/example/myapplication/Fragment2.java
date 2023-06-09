package com.example.myapplication;

import android.content.ClipData;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {



    public Fragment2() {
        // Required empty public constructor
    }


    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
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

        View view = inflater.inflate(R.layout.fragment_2, container, false);
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 200; i++){
            itemList.add(new Item(R.drawable.test,"Test"+i));
        }
        ListView LiVi = view.findViewById(R.id.itemsList);
        CustomAdapter adapter = new CustomAdapter(getContext(),R.layout.custom,itemList);
        LiVi.setAdapter(adapter);

        LiVi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(),((TextView) view.findViewById(R.id.CustomTextView)).getText(),
                        Toast.LENGTH_SHORT).show();
                Log.d("ListView", (String) ((TextView) view.findViewById(R.id.CustomTextView)).getText());
            }
        });
        return view;
    }

}