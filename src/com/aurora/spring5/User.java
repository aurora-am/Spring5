package com.aurora.spring5;

public class User {
    public User(String userName) {
        this.userName = userName;
    }

    private String userName;

    public void add(){
        System.out.println("add..........");
    }
}
