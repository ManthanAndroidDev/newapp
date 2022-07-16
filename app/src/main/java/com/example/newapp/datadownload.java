package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class datadownload extends AppCompatActivity {

    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datadownload);

        floatingActionButton = findViewById(R.id.data_Downfloat);

        AlertDialog.Builder builder = new AlertDialog.Builder(datadownload.this, R.color.allfragment);

        builder.setTitle("TERMS AND CONDITION :")
                .setMessage("Data Download Process Is Fully Depends On New Portal, In Case Of Data Is Not Getting Download Company Is Not Responsible And Company Will Not Provide Any Refund. We Work Best For You This Application Is Purely Based On Your Portal.")
                .setCancelable(false)
                .setPositiveButton("ACCEPT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(datadownload.this, "Selected Option: YES", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("REJECT", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast.makeText(datadownload.this, "Selected Option: YES", Toast.LENGTH_SHORT).show();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(datadownload.this, DataDownload_pro.class);
                startActivity(intent);
            }
        });
    }
}