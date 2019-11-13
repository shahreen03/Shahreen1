package com.mypackage;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin();
        admin.login();
        admin.logout();

        User user = new User();
        user.login();
        user.logout();
    }
}
