package com.example.dollosojap.androidtrainingapp.models;

/**
 * Created by dolloso.jap on 2/9/2017.
 */
public class TodoListData {

    String Todo;
    String date;
    int todoImage;

    public String getTodo() {

        return Todo;
    }

    public void setTodo(String todo) {
        Todo = todo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTodoImage() {
        return todoImage;
    }
    public void setTodoImage(int todoImage) {
        this.todoImage = todoImage;
    }



}
