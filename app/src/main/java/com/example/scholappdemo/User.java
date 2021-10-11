package com.example.scholappdemo;

import android.os.Bundle;

public class User {
    private DatabaseConnectivity g;
    int id;
    String name,password,email;


    public User(int id, String email, String password) {
        this.id= this.id;
        this.name=name;
        this.password= this.password;
        this.email= this.email;
    }

    public DatabaseConnectivity getG() {
        return g;
    }

    public void setG(DatabaseConnectivity g) {
        this.g = g;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
