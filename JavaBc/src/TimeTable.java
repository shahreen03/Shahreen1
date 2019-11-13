import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Multiplication number ");
        int num = input.nextInt();

        for (int i = 1; i <= 10 ; i++) {

            System.out.println(num + "x " + num + "= " + i);
        }
    }
}
