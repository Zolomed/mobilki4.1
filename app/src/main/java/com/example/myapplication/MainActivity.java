package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void replaceFragments(Fragment2 inst) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_view, inst).commit();
    }
    public void replaceFragments(Fragment3 inst) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container_view, inst).commit();
    }
}