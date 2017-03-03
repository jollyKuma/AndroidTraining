package com.example.dollosojap.androidtrainingapp.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dollosojap.androidtrainingapp.LandingActivity;
import com.example.dollosojap.androidtrainingapp.LoginActivity;
import com.example.dollosojap.androidtrainingapp.R;

/**
 * Created by dolloso.jap on 2/10/2017.
 */
public class TabFragment1 extends Fragment {
    private TextView textDisplayName;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_activity2,container, false);

        textDisplayName = (TextView)view.findViewById(R.id.textDisplayFullname);

        //textDisplayName.setText("Welcome");
       textDisplayName.setText("Welcome " + getActivity().getIntent().getStringExtra("fullname"));

       //Log.d("Welcome this new " , getActivity().getIntent().getExtras().getString("fullname"));

        return  view;
    }
    public  void Logout(View view){
        Intent intent = new Intent(getActivity(), LandingActivity.class);
        startActivity(intent);

    }

}
