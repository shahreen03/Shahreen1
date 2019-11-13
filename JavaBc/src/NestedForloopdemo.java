import java.util.Scanner;

public class NestedForloopdemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initial number : ");
        int num1 = input.nextInt();
        System.out.print("Enter Final number : ");
        int num2 = input.nextInt();
        for (int i = num1; i <= num2 ; i++) {  //outer loop

            for (int j = 1; j <= 10; j++) {  //inner loop
                System.out.println(i + " X " + j + "= " + i*j );
            }
            System.out.println(" \n ");
        }
    }
}
