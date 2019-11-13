import java.util.Scanner;

public class Series4 {
    public static void main(String[] args) {
        //1^2+2^2+3^2+4^2+.....+n^2

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Last Number: ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.print(i+ "x" + i + " ");
            sum = sum+i*i;
        }
        System.out.println ();
        System.out.println(sum);
    }
}
