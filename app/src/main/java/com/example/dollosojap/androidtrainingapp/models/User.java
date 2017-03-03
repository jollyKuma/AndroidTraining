package com.example.dollosojap.androidtrainingapp.models;

/**
 * Created by dolloso.jap on 3/3/2017.
 */
public class User {
    private String fullname;
    private String email;
    private String gender;
    private String password;

    public User(String fullname, String email, String gender, String password) {
        this.fullname = fullname;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
