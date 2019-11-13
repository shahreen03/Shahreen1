import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        //1.5+2.5+3.5+.....+n
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Last Number: ");
        double n = input.nextDouble();
        double sum = 0;
        for(double i = 1.5; i <= n; i++){
            System.out.print(i+ " ");
            sum = sum+i;
        }
        System.out.println ();
        System.out.println(sum);
    }
}
