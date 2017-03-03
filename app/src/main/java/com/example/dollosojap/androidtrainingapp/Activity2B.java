package com.example.dollosojap.androidtrainingapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.dollosojap.androidtrainingapp.adapters.CustomListAdapter;
import com.example.dollosojap.androidtrainingapp.models.TodoListData;

import java.util.ArrayList;

public class Activity2B extends AppCompatActivity {

    ListView todoList;
    Context context = Activity2B.this;
    ArrayList myList = new ArrayList();
    CustomListAdapter listAdapter;

    Button btnAdd ;
    EditText textTodo,textDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_b);


        todoList = (ListView) findViewById(R.id.listview_items);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        textTodo =(EditText) findViewById(R.id.text_todo);
        textDate = (EditText) findViewById(R.id.text_date2);

        listAdapter = new CustomListAdapter(context, myList);
        todoList.setAdapter(listAdapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TodoListData list = new TodoListData();
                    list.setTodo( textTodo.getText().toString());
                    list.setDate(textDate.getText().toString());


                myList.add(list);
              //  arrayAdapter.notifyDataSetChanged();

                textTodo.setText(null);
                textDate.setText(null);

                InputMethodManager inputManager=(InputMethodManager)getSystemService(context.INPUT_METHOD_SERVICE);
                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);

                textDate.requestFocus();
            }


        });

        //getDataList();

    }


//    private void getDataList(){
//        for(int i = 0; i < todos.length; i++ ){
//            TodoListData list = new TodoListData();
//            list.setTodo(todos[i]);
//            list.setDate(date[i]);
////            list.setTodoImage(image[i]);
//
//            myList.add(list);
//        }
//    }
}
