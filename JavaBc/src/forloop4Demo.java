import java.util.Scanner;

public class forloop4Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Two Number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = 0;


        for (int i = num1; i <= num2; i++)

            if (i % 2 != 0) {
                System.out.println(i);
                sum = sum + i;

        }
        System.out.println(sum);
    }
}
