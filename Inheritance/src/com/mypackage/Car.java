package com.mypackage;

public class Car extends Vehicle {
    private static String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Vehicle myvehicle = new Vehicle();

        // Call the honk() method (from the Vehicle class) on the myCar object
        honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myvehicle.brand + " " + modelName);
    }
}
