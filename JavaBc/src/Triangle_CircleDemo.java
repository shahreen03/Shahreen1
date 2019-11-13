import java.util.Scanner;

public class Triangle_CircleDemo {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        double base, height, area;
        System.out.print("Enter Base = ");
        base = input.nextDouble();
        System.out.print("Enter Hight = ");
        height = input.nextDouble();
        area= 0.5*base*height;

        System.out.println("Area of Triangle =  " + area);

        Scanner input2 = new Scanner(System.in);
        Double red, area2;
        System.out.print("Input Redius = ");
        red = input2.nextDouble();
        area2 = 3.1416 * red * red;
        System.out.println("Area of Circle =  "+ area2);





    }
}
