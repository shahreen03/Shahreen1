import java.util.Scanner;

public class LogicalOperetorDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char Character = input.next().charAt(0);

        if(Character == 'a' || Character == 'e'||Character == 'i' || Character == 'o'|| Character == 'u'){
            System.out.println("Character is Vowel ");
        }
        else {
            System.out.println("Character is Consonant") ;
        }
    }
}
