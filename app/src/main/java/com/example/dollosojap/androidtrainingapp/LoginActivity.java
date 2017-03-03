package com.example.dollosojap.androidtrainingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private TextView textEmail, textPassword;
    EditText emailText, passwordText, emailTextIn, passwordTextIn;
    String email, password, emailIn, passwordIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailText = (EditText) findViewById(R.id.text_email);
        passwordText = (EditText)findViewById(R.id.text_password);

        emailTextIn = (EditText)findViewById(R.id.textEmailIn);
        passwordTextIn =(EditText)findViewById(R.id.textPasswordIn);

        email = getIntent().getStringExtra("email");
        password = getIntent().getStringExtra("password");

        emailIn = emailTextIn.getText().toString();
        passwordIn = passwordTextIn.getText().toString();

    }

    public void LoginAuth(View view){


        if (email.equals(emailIn) && password.equals(passwordIn)){

            String message = "Successfully login";
            Toast.makeText(LoginActivity.this,message,Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(LoginActivity.this, Activity3Fragment.class);
            startActivity(intent);
        }else {

            String message = "Authentication Failed";
            Toast.makeText(LoginActivity.this,message,Toast.LENGTH_SHORT).show();
        }


    }

}
