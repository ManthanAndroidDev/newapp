package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.ClipData;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Add_Policy<adapterItem> extends AppCompatActivity {

//    String[] items = {"MLY", "QLY", "HLY", "YLY", "SGL"};
//    AutoCompleteTextView autoCompleteTxt;
//    ArrayAdapter<String> adapterItem;

    final Calendar myCalendar = Calendar.getInstance();
    EditText datepic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_policy);
        getSupportActionBar().hide();

        datepic = findViewById(R.id.DOB_date);
//        autoCompleteTxt = findViewById(R.id.autoComplete_txt);

//        adapterItem = new ArrayAdapter<String>(this, R.layout.list_item, items);
//        autoCompleteTxt.setAdapter(adapterItem);

//        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                String item = parent.getItemAtPosition(position).toString();
//                Toast.makeText(getApplicationContext(), "item: "+item, Toast.LENGTH_SHORT).show();
//
//            }
//        });

        DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {

                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, day);
                updateLabel();
            }
        };
        datepic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(Add_Policy.this, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

    }

    private void updateLabel() {

        String myFormat = "MM/dd/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(myFormat, Locale.US);
        datepic.setText(dateFormat.format(myCalendar.getTime()));
    }

}