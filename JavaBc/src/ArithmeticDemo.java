import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {

        //+,-,*,/,%   ,
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st nummer =");
        int num1 = input.nextInt();
        System.out.print("Enter your 2nd nummer =");
        int num2 = input.nextInt();
        int result = num1+ num2;
        System.out.println("Sum = "+ result);
        result = num1- num2;
        System.out.println("Sub = "+ result);
        result = num1* num2;
        System.out.println("Multi = "+ result);
        result = num1/ num2;
        System.out.println("Div = "+ result);
        result = num1% num2;
        System.out.println("Mod = "+ result);
    }
}
