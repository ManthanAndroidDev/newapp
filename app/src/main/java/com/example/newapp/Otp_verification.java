package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;

public class Otp_verification extends AppCompatActivity {

    Button button;
    TextView textView;
    PinView pinView;
    String getotpbackend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);

        textView = findViewById(R.id.remain);
        button = findViewById(R.id.submit);
        pinView = findViewById(R.id.firstPinView);


        getotpbackend = getIntent().getExtras().getString("mobile");
        textView.setText(getotpbackend);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                if(!pinView.getText().toString().trim().isEmpty()){

                Toast.makeText(Otp_verification.this, "otp verify", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Otp_verification.this, MainActivity.class);
                startActivity(intent);
//                }else{
//                    Toast.makeText(otp_verification.this, "Please Enter Valid OTP", Toast.LENGTH_LONG).show();
//                }


            }
        });



    }
}