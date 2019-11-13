package com.mypackage;

import java.util.ArrayList;

public class Shop {
    public void add(Product product) {

    }
        Product product = new Product();
        ArrayList<String> item = new ArrayList<String>();

        public void setItem (ArrayList < String > item) {
            item.add("Dairy");
            item.add("Vegetable");
            item.add("Fish&Meat");
            item.add("Grain");


            for (String setItem : item) {
                System.out.println("setItem = " + setItem);
                System.out.println(item);

            }
        }
    }
