package com.example.dollosojap.androidtrainingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private TextView textViewName, textViewEmail, textViewGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        textViewName = (TextView)findViewById(R.id.textViewFullName);
        textViewEmail = (TextView)findViewById(R.id.textViewEmail);
        textViewGender = (TextView)findViewById(R.id.textViewGender);

        textViewName.setText(getIntent().getStringExtra("fullname"));
        textViewEmail.setText(getIntent().getStringExtra("email"));
        textViewGender.setText(getIntent().getStringExtra("selectedGender"));

    }

}
