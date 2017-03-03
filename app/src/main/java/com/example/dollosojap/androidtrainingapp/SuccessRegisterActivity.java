package com.example.dollosojap.androidtrainingapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.dollosojap.androidtrainingapp.models.User;

import java.util.ArrayList;

public class SuccessRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_register);
        ArrayList<User> userList = (ArrayList<User>)getIntent().getSerializableExtra("userList");
        Intent intent = getIntent();

        Log.d("List", ""+userList);

       // userList = getIntent().getStringArrayListExtra("userList");
    }

    public void Login(View view){
        Intent intent = new Intent(SuccessRegisterActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
