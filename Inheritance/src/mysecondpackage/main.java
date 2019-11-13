package mysecondpackage;

import com.mypackage.Train;
import com.mypackage.Vehicle;

public class main {

    public static void main(String[] args) {
        Vehicle myvehicle= new Vehicle();
        System.out.println(myvehicle.brand);

        Train MyTrain = new Train();
       MyTrain.brand = ("Some other Brand");
       System.out.println(MyTrain.brand);

    }

}
