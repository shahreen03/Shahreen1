import java.util.Scanner;

public class ControlStatmentIfElse {
    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Integer nummer : ");
        num = input.nextInt();

        if(num > 0){
            System.out.println("Positive");
        }
        else if (num <0) {
            System.out.println("Negetive");
        }
        else {
            System.out.println("Equal to Zero ");
        }

        }



    }

