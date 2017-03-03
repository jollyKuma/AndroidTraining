package com.example.dollosojap.androidtrainingapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.dollosojap.androidtrainingapp.R;
import com.example.dollosojap.androidtrainingapp.models.TodoListData;

import java.util.ArrayList;

/**
 * Created by dolloso.jap on 2/9/2017.
 */
public class CustomListAdapter extends BaseAdapter{
    ArrayList todoList = new ArrayList();
    LayoutInflater inflater;
    Context context;

    public CustomListAdapter(Context context, ArrayList<TodoListData> todoList) {
        this.todoList = todoList;
        this.context = context;
        //inflater = LayoutInflater.from(this.context);
          inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return todoList.size();
    }

    @Override
    public Object getItem(int position) {
        return todoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListViewHolder myListViewHolder;
        EditText textTodo,textDate;

        if(convertView == null){
            convertView = inflater.inflate(R.layout.layout_listview_items, null);

            myListViewHolder = new ListViewHolder(convertView);
            convertView.setTag(myListViewHolder);
        }
        else {
            myListViewHolder = (ListViewHolder) convertView.getTag();
        }

        TodoListData currentData = (TodoListData) getItem(position);
        myListViewHolder.textViewTodo.setText(currentData.getTodo());
        myListViewHolder.textViewDate.setText(currentData.getDate());

        myListViewHolder.todoImg.setImageResource(R.drawable.clock);
        //myListViewHolder.todoImg.setImageResource(currentData.getTodoImage());
        return convertView;
    }

    private class ListViewHolder{
        TextView textViewTodo, textViewDate;
        ImageView todoImg;

        public ListViewHolder(View item){
            textViewTodo = (TextView) item.findViewById(R.id.textViewTodo);
            textViewDate = (TextView) item.findViewById(R.id.textViewDate);
            todoImg = (ImageView) item.findViewById(R.id.imageClock);
        }
    }
}
