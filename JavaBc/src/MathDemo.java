public class MathDemo {
    public static void main(String[] args) {
    int x = 20;
    int y = 10;
 //Max
    int max = Math.max(x, y);
    System.out.println("Maximum number : " + max);
//Min
    int min = Math.min(x, y);
    System.out.println("Minimum number : "+ min);
//Absulute number
    int x1 = 20;
    int y2 = -10;
    int absolute = Math.abs(y2);
    System.out.println("Absolute Value : "+ absolute);
//Power
    int x3= 2;
    int y3= 3;
    int power = (int)Math.pow(x3,y3); // Cast to int
    System.out.println(" X to the Power Y : " + power);
 //Round
       int Round =  Math.round(8.8f);
        System.out.println("Round " + Round);
//Pi
        double pi = Math.PI;
        System.out.println("Pi : " + pi);
    }
}
