import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner class
        /*System.out.print("Enter any number :  ");

        int number = input.nextInt();
        System.out.println("Number : " + number);*/

        System.out.print("Enter your name : ");
        String name = input.nextLine();

        System.out.println("Welcome : " + name);


    }
}
