import java.util.Scanner;

public class Forloop2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Two Number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = 0;
        for ( int i= num1; i <=num2; i++){
            sum = sum+i;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
