package com.example.newapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeFragment extends Fragment {

    CardView DataDownload,MyData,FUPUpdate,PremiumPaid,PolicyStatus,OPolicyStatus,policyReports,greets;
    ImageView profile, notification;

    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        profile = view.findViewById(R.id.profilePhoto);
        notification = view.findViewById(R.id.notificationBell);
        DataDownload = view.findViewById(R.id.card);
        MyData = view.findViewById(R.id.card1);
        FUPUpdate = view.findViewById(R.id.card2);
        PremiumPaid = view.findViewById(R.id.card3);
        PolicyStatus = view.findViewById(R.id.card4);
        OPolicyStatus = view.findViewById(R.id.card5);
        policyReports = view.findViewById(R.id.card6);
        greets = view.findViewById(R.id.card7);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), notificationV.class);
                startActivity(intent);
            }
        });

        DataDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), datadownload.class);
                startActivity(intent);

//                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
//
//                builder.setTitle("TERMS AND CONDITION")
//                        .setMessage("Data Download Process Is Fully Depends On New Portal, In Case Of Data Is Not Getting Download Company Is Not Responsible And Company Will Not Provide Any Refund. We Work Best For You This Application Is Purely Based On Your Portal.")
//                        .setCancelable(false)
//                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//
//                                Toast.makeText(requireContext(), "Selected Option: YES", Toast.LENGTH_SHORT).show();
//                            }
//                        })
//                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//
//                                Toast.makeText(requireContext(), "Selected Option: YES", Toast.LENGTH_SHORT).show();
//                            }
//                        });
//                AlertDialog dialog = builder.create();
//                dialog.show();
            }
        });

        MyData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), mydata.class);
                startActivity(intent);
            }
        });

        FUPUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), fupupdate.class);
                startActivity(intent);
            }
        });

        PremiumPaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), premiumc.class);
                startActivity(intent);
            }
        });

        PolicyStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), policysts.class);
                startActivity(intent);
            }
        });

        OPolicyStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), opolicysts.class);
                startActivity(intent);
            }
        });

        policyReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), policyreports.class);
                startActivity(intent);
            }
        });

        greets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), greets.class);
                startActivity(intent);
            }
        });

        return view;
    }
}