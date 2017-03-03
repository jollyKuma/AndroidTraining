package com.example.dollosojap.androidtrainingapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dollosojap.androidtrainingapp.adapters.UserAdapter;
import com.example.dollosojap.androidtrainingapp.models.User;

import java.util.ArrayList;


public class RegisterActivity extends AppCompatActivity {

    private RadioGroup genderRadioGroup;
    private RadioButton btnFemale, btnMale;
    private Button btnRegister;
    private EditText textName, textEmail ,textPassword, textConfirmPass;
    private TextView textViewName, textViewEmail, textViewGender;
    Context context;

    ArrayList<User> userList = new ArrayList<User>();
    UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textName = (EditText) findViewById(R.id.text_fullname);
        textEmail = (EditText) findViewById(R.id.text_email);
        textPassword = (EditText) findViewById(R.id.text_password);
        textConfirmPass = (EditText) findViewById(R.id.text_confirmPassword);

        btnRegister = (Button) findViewById(R.id.btn_register);
        genderRadioGroup = (RadioGroup) findViewById(R.id.radioGroupGender);


    }

    public void SuccessRegister(View view){

        String fullname, email, selectedGender, password, confirmPass = "";

         fullname = textName.getText().toString();
         email = textEmail.getText().toString();
         selectedGender = ((RadioButton)findViewById(genderRadioGroup.getCheckedRadioButtonId())).getText().toString();
         password = textPassword.getText().toString();
         confirmPass = textConfirmPass.getText().toString();


        if (fullname.length()== 0){
            textName.setError("Fullname is required");
            textName.requestFocus();
        }
        if(email.length()== 0){
            textEmail.setError("Email is required");
            textEmail.requestFocus();
            }
       if(password.length()==0){
            textPassword.setError("Password is required");
           textPassword.requestFocus();
       }
       if(password.length()==0){
            textConfirmPass.setError("Password is required");
            textConfirmPass.requestFocus();
        }
            if (password.equals(confirmPass)) {

//                    Intent intent = new Intent(view.getContext(), SuccessRegisterActivity.class);
//                    startActivity(intent);
//
//                    Intent i = new Intent(view.getContext(), LoginActivity.class);
//                    Intent in = new Intent(view.getContext(), Activity2A.class);
//
//                    in.putExtra("fullname", fullname);
//                    i.putExtra("email", email);
//                    i.putExtra("selectedGender", selectedGender);
//                    i.putExtra("password", password);
//                    i.putExtra("confirmPass", confirmPass);
//                    startActivity(in);
//                    startActivity(i);
              //  userAdapter = new UserAdapter(context, userList);

                User user = new User(fullname,email,selectedGender,password);
                userList.add(user);

                Intent intent = new Intent(view.getContext(), SuccessRegisterActivity.class);
                startActivity(intent);
                intent.putExtra("userList", userList);


            }
            else{
                String message = "Password don't match";
                Toast.makeText(RegisterActivity.this,message,Toast.LENGTH_SHORT).show();


            }
    }
}
