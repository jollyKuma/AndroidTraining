package com.example.dollosojap.androidtrainingapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.dollosojap.androidtrainingapp.R;
import com.example.dollosojap.androidtrainingapp.models.User;

import java.util.ArrayList;

/**
 * Created by dolloso.jap on 3/3/2017.
 */
public class UserAdapter extends BaseAdapter{

    ArrayList users = new ArrayList();
    LayoutInflater inflater;
    Context context;

    public UserAdapter(Context context, ArrayList<User> users) {
        this.users = users;
        this.inflater = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
        this.context = context;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        UserHolder userHolder;
        EditText text_name, text_emailAddr, text_passw;

        if(convertView  == null){
            convertView = inflater.inflate(R.layout.activity_register, null);
            userHolder = new UserHolder(convertView);
        }
        else{
            userHolder = (UserHolder) convertView.getTag();
        }

        User currendata = (User) getItem(position);



        return convertView;
    }

    private class UserHolder{
        EditText text_fullname, text_email, text_password;
        RadioGroup text_gender;
        Button btn_register;

        public UserHolder(View item){
            text_fullname = (EditText) item.findViewById(R.id.text_fullname);
            text_email = (EditText) item.findViewById(R.id.text_email);
            text_gender =   (RadioGroup) item.findViewById(R.id.radioGroupGender);
            text_password = (EditText) item.findViewById(R.id.text_password);
            btn_register = (Button) item.findViewById(R.id.btn_register);

        }
    }
}
