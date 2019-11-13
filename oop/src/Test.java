public class Test {
    public static void main(String[] args) {
        Teacher Teacher1= new Teacher();
        //Teacher1.name= "Md Rahman";
        //Teacher1.gender= "male";
        //Teacher1.phone = 730730;
        Teacher1.setinformation("Md Rahman" ,"male",730730 );//method call

        Teacher1.displayinformation();
        //System.out.println(Teacher1.name + " "+ Teacher1.gender+ " "+ Teacher1.phone);

        Teacher Teacher2= new Teacher();
        //Teacher2.name= "Md Jamal";
        //Teacher2.gender= "male";
        //Teacher2.phone = 730073;
        Teacher2.setinformation("Md Jamal" ,"male",730073 ); //call
        Teacher2.displayinformation();

        //System.out.println(Teacher2.name + " "+ Teacher2.gender+ " "+ Teacher2.phone);

    }

}
