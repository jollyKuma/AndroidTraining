package com.example.dollosojap.androidtrainingapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.dollosojap.androidtrainingapp.adapters.CustomListAdapter2;
import com.example.dollosojap.androidtrainingapp.models.TodoListData2;

import java.util.ArrayList;

public class Activity2Bv2 extends AppCompatActivity {

    ListView todoList;
    Context context = Activity2Bv2.this;
    ArrayList myList = new ArrayList();
    CustomListAdapter2 listAdapter;

    Button btnAdd ;
    EditText textTodo,textDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_bv2);
        btnAdd = (Button) findViewById(R.id.btnAdd2);
        textTodo =(EditText) findViewById(R.id.text_todo2);
        textDate = (EditText) findViewById(R.id.text_date2);

        todoList = (ListView) findViewById(R.id.todoListView2);
    }

    public void addTodo(View view){


        listAdapter = new CustomListAdapter2(context,myList);

        todoList.setAdapter(listAdapter);
        TodoListData2 list = new TodoListData2(textTodo.getText().toString(), textDate.getText().toString());
        Log.d("Add", ""+myList.add(list));

        //listAdapter.notifyDataSetChanged();

        textTodo.setText(null);
        textDate.setText(null);

        InputMethodManager inputManager=(InputMethodManager)getSystemService(context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);

        textDate.requestFocus();
    }
}
