import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Double celsius, fahrenheit;
        System.out.print("Enter Celsius = ");
        celsius = input.nextDouble();
        fahrenheit= 1.8 * celsius + 32; // Formula
        System.out.println("Fahrenheit is " + fahrenheit);

        System.out.print("Enter Fahrenheit = ");
        fahrenheit = input.nextDouble();
        celsius = 0.04 * (fahrenheit - 32);//Formula
        System.out.println("Celsius is " + celsius );
    }
}
