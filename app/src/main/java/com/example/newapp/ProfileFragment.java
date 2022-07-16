package com.example.newapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class ProfileFragment extends Fragment {

    Button view_profile, edit_profile;

    public ProfileFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        view_profile = view.findViewById(R.id.View_profile);
        edit_profile = view.findViewById(R.id.Edit_profile);



        return view;
    }
}

