import java.util.Scanner;

public class Series5 {
    public static void main(String[] args) {
        //1*2*3*.....*n
        Scanner input= new Scanner(System.in);
        System.out.print(" Plaese Enter your last Number: ");
        int n = input.nextInt();
        int multi = 1;

        for (int i = 1; i<= n; i++){
            System.out.print(i+ " " );
            multi= multi * i;
        }
        System.out.println(multi);
    }
}
