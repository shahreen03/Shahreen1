package com.mypackage;

public class Train extends Vehicle {
    public Train(){

    }
    public Train(String brand){
        this.brand = brand;
    }
    public static void main(String[] args) {

            Train mytrain = new Train("Bachaman");

        mytrain.choo();

    }

public void choo() {
        System.out.println("Choo, Choo!" + brand);
    }


}
