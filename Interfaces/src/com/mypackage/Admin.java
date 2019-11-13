package com.mypackage;

public class Admin implements Account {
    @Override
    public void login() {
        System.out.println(" Admin is logging in...");
    }

    @Override
    public void logout() {
    System.out.println(" Admin is logout ..");
    }
}
