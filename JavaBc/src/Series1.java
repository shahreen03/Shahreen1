import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        //1+2+3+.....+n

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Last Number: ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.print(i+ " ");
            sum = sum+i;
        }
        System.out.println ();
           System.out.println(sum);
    }
}
