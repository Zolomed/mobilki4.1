package com.example.myapplication;

import android.content.ClipData;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {

    public Fragment2() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 200; i++){
            itemList.add(new Item(R.drawable.test,"Test"+i));
        }
        ListView List = view.findViewById(R.id.itemsList);
        CustomAdapter adapter = new CustomeAdapter(getContext(),R.layout.custom, itemList);
        List.setAdapter(adapter);
        List<ClipData.Item> itemList = new ArrayList<>();
    }
}