package com.example.newapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FollowFragment extends Fragment {

    Button button;

    public FollowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_follow_up, container, false);

        button = view.findViewById(R.id.followbtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                button.setBackgroundColor(getResources().getColor(R.color.white));
            }
        });
        return view;
    }
}