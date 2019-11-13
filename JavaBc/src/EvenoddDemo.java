import java.util.Scanner;

public class EvenoddDemo {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive nummer : ");
        num = input.nextInt();

        //kono num 2 diye bhag kore bhagfol o hole even noile odd
        if (num%2==0){
            System.out.println("Nummer is Even : ");
        }
        else {
            System.out.println("Nummer is Odd : ");
        }

    }
}
