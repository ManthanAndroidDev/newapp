package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Number_verification extends AppCompatActivity {

    EditText enternumber;
    Button getotpbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_verification);

        enternumber = findViewById(R.id.mobile_number);
        getotpbutton = findViewById(R.id.getotp);


        getotpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(!enternumber.getText().toString().trim().isEmpty()){
//                    if ((enternumber.getText().toString().trim()).length() == 10){

                Intent intent = new Intent(Number_verification.this, Otp_verification.class);
                intent.putExtra("mobile", enternumber.getText().toString());
                startActivity(intent);
//                    }else {
//                        Toast.makeText(Number_verification.this, "Please Enter The Correct Number", Toast.LENGTH_LONG).show();
//                    }
//                }else {
//                    Toast.makeText(Number_verification.this, "Enter The Number", Toast.LENGTH_LONG).show();
//                }
            }
        });


    }
}