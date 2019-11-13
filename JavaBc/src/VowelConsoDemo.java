import java.util.Scanner;

public class VowelConsoDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch, ch2;
        System.out.print("Enter any Letter : ");
        ch = input.next().charAt(0);

        if (ch == 'a'){
            System.out.println("Char is Vowel ");
        }
        else if(ch == 'e'){
            System.out.println("Char is Vowel ");
        }
        else if(ch == 'i'){
            System.out.println("Char is Vowel ");
        }
        else if(ch == 'o'){
            System.out.println("Char is Vowel ");
        }
        else if(ch == 'u'){
            System.out.println("Char is Vowel ");
        }
        else {
            System.out.println("Char is Consonant ");
        }

    }
}
