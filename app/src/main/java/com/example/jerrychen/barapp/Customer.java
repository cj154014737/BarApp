package com.example.jerrychen.barapp;

import java.io.Serializable;

/**
 * Created by jerrychen on 4/25/18.
 */

public class Customer extends User implements Serializable {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    private String gender;
    private int age;
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Customer(){
    }

    public Customer( String name, String email) {
        super(name, email,false);
        gender="unknown";

    }
    public Customer( String name, String email, int age){
        super(name, email,false);
        this.age=age;
        gender="unknown";
    }
    public Customer( String name, String email, int age,String gender){
        super(name, email,false);
        this.age=age;
        this.gender=gender;
    }

}