package com.mypackage;

public class User implements Account {
    @Override
    public void login() {
        System.out.println(" User is logging in...");
    }

    @Override
    public void logout() {
        System.out.println(" User is logout...");
    }
}
