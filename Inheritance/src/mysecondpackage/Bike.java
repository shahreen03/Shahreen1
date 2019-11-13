package mysecondpackage;

import com.mypackage.Vehicle;

public class Bike extends Vehicle {
    void vroom(){
        System.out.println("Bike noise vrooooommmm!!!");

    }

    public static void main(String[] args) {
        Bike myBike = new Bike();
        myBike.brand= "kawasaki";
        myBike.vroom();
        System.out.println(myBike.brand);

    }
}
