public class Teacher {
    String name, gender;
    int phone;

    void setinformation(String nm,String gn, int ph){//Parametrized Method
        name = nm;
        gender = gn;
        phone = ph;

    }

    void displayinformation(){
        System.out.println("Name = " + name + ", "+ "Gender = "+ gender+ ", "+ "Phone = "+ phone);
    }
}
