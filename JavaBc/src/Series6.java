import java.util.Scanner;

public class Series6 {
    public static void main(String[] args) {
        //1*3*5*.....*n
        Scanner input= new Scanner(System.in);
        System.out.print(" Plaese Enter your last Number: ");
        int n = input.nextInt();
        int multi = 1;

        for (int i = 1; i<= n; i= i+2){
            System.out.print(i+ " " );
            multi= multi * i;
        }
        System.out.println(multi);
    }
}
