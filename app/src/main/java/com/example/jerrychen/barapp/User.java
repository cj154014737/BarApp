package com.example.jerrychen.barapp;

import java.io.Serializable;

/**
 * Created by jerrychen on 4/11/18.
 */

public abstract class User implements Serializable {
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name;
    private String email;
    public boolean isStaff() {
        return isStaff;
    }
    private boolean isStaff;
    public User(String name, String email,boolean isStaff){
        this.name=name;
        this.email=email;
        this.isStaff=isStaff;
    }

}
