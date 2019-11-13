import java.util.Scanner;

public class ConditionalOperatorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two nummber : ");
        int num1 = input.nextInt();
        int num2= input.nextInt();
        int large= (num1>num2) ? num1 : num2;
        System.out.println("Large number = " + large);

    }
}
