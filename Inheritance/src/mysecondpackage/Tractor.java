package mysecondpackage;

import com.mypackage.Vehicle;

public class Tractor extends Vehicle {

    Tractor(){

    }

    void slower(){

        System.out.println("Sorry I am very Slow ");
    }

    public static void main(String[] args) {
        Tractor MyTractor = new Tractor();
        MyTractor.brand = "WakiTaki";
        MyTractor.slower();
        System.out.println(MyTractor.brand);
    }
}
