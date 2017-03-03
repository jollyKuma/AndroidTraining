package com.example.dollosojap.androidtrainingapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dollosojap.androidtrainingapp.R;
import com.example.dollosojap.androidtrainingapp.models.TodoListData2;

import java.util.ArrayList;

/**

 * Created by dolloso.jap on 2/9/2017.
 */
public class CustomListAdapter2 extends BaseAdapter {
    ArrayList todoList2 = new ArrayList();
    LayoutInflater inflater2;
    Context context2;

    public CustomListAdapter2(Context context2, ArrayList<TodoListData2> todoList2) {
        this.todoList2 = todoList2;
        this.inflater2 = (LayoutInflater) context2.getSystemService(Context.LAYOUT_INFLATER_SERVICE);;
        this.context2 = context2;
    }

    @Override
    public int getCount() {
        return todoList2.size();
    }

    @Override
    public Object getItem(int position) {
        return todoList2.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListViewHolder myListViewHolder2;
        EditText textTodo2,textDate2;

        if(convertView == null){
            convertView = inflater2.inflate(R.layout.layout_todolist, null);

            myListViewHolder2 = new ListViewHolder(convertView);
            convertView.setTag(myListViewHolder2);
        }
        else {
            myListViewHolder2 = (ListViewHolder) convertView.getTag();
        }

        TodoListData2 currentData = (TodoListData2) getItem(position);
        myListViewHolder2.textViewTodo.setText(currentData.getTodo2());
        myListViewHolder2.textViewDate.setText(currentData.getDate2());

        myListViewHolder2.todoImg.setImageResource(R.drawable.clock);
        return convertView;
    }
    private class ListViewHolder{
        TextView textViewTodo, textViewDate;
        ImageView todoImg;
        Button btnDelete;

        public ListViewHolder(View item){
            textViewTodo = (TextView) item.findViewById(R.id.textViewTodo2);
            textViewDate = (TextView) item.findViewById(R.id.textViewDate2);
            todoImg = (ImageView) item.findViewById(R.id.imageClock2);
            btnDelete = (Button) item.findViewById(R.id.btnRemove);
        }
    }
}
