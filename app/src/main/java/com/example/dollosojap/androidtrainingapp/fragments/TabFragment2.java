package com.example.dollosojap.androidtrainingapp.fragments;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.dollosojap.androidtrainingapp.R;
import com.example.dollosojap.androidtrainingapp.adapters.CustomListAdapter2;
import com.example.dollosojap.androidtrainingapp.models.TodoListData2;

import java.util.ArrayList;


/**
 * Created by dolloso.jap on 2/10/2017.
 */
public class TabFragment2 extends Fragment {

    ListView todoList;
    //Context context = TabFragment2.this;
    ArrayList<TodoListData2> myList = new ArrayList();
    CustomListAdapter2 listAdapter;


    Button btnAdd , btnRemove;
    EditText textTodo,textDate;
    //Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.activity_activity2_bv2, container, false);

        btnAdd = (Button) rootView.findViewById(R.id.btnAdd2);
        btnRemove = (Button) rootView.findViewById(R.id.btnRemove);
        textTodo =(EditText) rootView.findViewById(R.id.text_todo2);
        textDate = (EditText) rootView.findViewById(R.id.text_date2);

        todoList = (ListView) rootView.findViewById(R.id.todoListView2);

        listAdapter = new CustomListAdapter2(getActivity(),myList);
        todoList.setAdapter(listAdapter);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String textTodoInput = textTodo.getText().toString();
                String textDateInput = textDate.getText().toString();

                TodoListData2 list = new TodoListData2(textTodoInput,textDateInput);

                myList.add(list);

                //Log.d("Add", ""+myList.add(list));

                listAdapter.notifyDataSetChanged();
                textTodo.setText(null);
                textDate.setText(null);

//                InputMethodManager inputManager=(InputMethodManager)getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
//                inputManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);

                textDate.requestFocus();


            }
        });
        return rootView;

    }



}
