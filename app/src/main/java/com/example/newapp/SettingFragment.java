package com.example.newapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SettingFragment extends Fragment {

    Button view_profile, edit_profile;
    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_setting, container, false);

        view_profile = view.findViewById(R.id.View_profile);
        edit_profile = view.findViewById(R.id.Edit_profile);

        LinearLayout view_ll = view.findViewById(R.id.contain_vp);
        LinearLayout edit_ll = view.findViewById(R.id.contain_ep);

        view_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                view_ll.setVisibility(View.VISIBLE);
                edit_ll.setVisibility(View.GONE);
            }
        });

        edit_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                view_ll.setVisibility(View.GONE);
                edit_ll.setVisibility(View.VISIBLE);
                Toast.makeText( getContext(), "Editprofile", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}