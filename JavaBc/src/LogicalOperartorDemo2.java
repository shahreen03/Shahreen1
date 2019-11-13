import java.util.Scanner;

public class LogicalOperartorDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write a Letter: ");
        char Letter= input.next().charAt(0);
         if(Letter>='a' &&  Letter<= 'z'){
             System.out.println("Letter is Small Letter ");
        }
         else if(Letter>='A' &&  Letter<= 'Z'){
             System.out.println("Letter is Capital Letter ");
         }
         else{
             System.out.println("This Is Not A Letter ");
        }
    }
}
