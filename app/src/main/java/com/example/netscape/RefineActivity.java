package com.example.netscape;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class RefineActivity extends AppCompatActivity {

    private ImageView backButton;
    private Spinner AvailabilitySpinner;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);

        backButton= findViewById(R.id.backArrow);
        AvailabilitySpinner=findViewById(R.id.availabilitySpinner);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(back);
                finish();
            }
        });

        List<String> available = new ArrayList<>();
        available.add(0,"Available | Hey Let Us Connect");
        available.add("Away | Stay Discrete And Watch");
        available.add("Busy | Do Not Disturb | Will Catch Up Later");
        available.add("SOS | Emergency! Need Assistance!");


        /** Adding an adapter to the spinner **/
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<>(this,R.layout.spinner_default, available);
        myAdapter1.setDropDownViewResource(R.layout.spinner_availability_layout);
        AvailabilitySpinner.setAdapter(myAdapter1);


        /** Extracting string from selected item **/
        AvailabilitySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).equals("Available | Hey Let Us Connect")) {

                } else {

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Spinner AvailabilitySpinner = findViewById(R.id.availabilitySpinner);
                AvailabilitySpinner.setSelection(0);
            }
        });
    }
}