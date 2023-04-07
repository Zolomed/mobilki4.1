package com.example.myapplication;

import android.content.ClipData;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment {

    public Fragment3() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_3, container, false);

        List <ClipData.Item> itemList = new ArrayList<>();
        for (int i = 0;i < 200;i++) {
            itemList.add(new ClipData.Item(R.drawable.test,"Test"+i));
        }

        RecyclerView recyclerView = view.findViewById(R.id.recycleid);
        CustomRecycleAdapter customRecycleAdapter = new CustomRecycleAdapter(getContext(),itemList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(customRecycleAdapter);
        return  view;
    }
}