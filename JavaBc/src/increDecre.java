public class increDecre {
    public static void main(String[] args) {

        //postfix increment
        int x = 10;
        int y = x++; //postfix increment //ans: y = 10
        System.out.println("Y value is "+ y);
        y = x; //postfix increment ans: y = 11
        System.out.println("Y value is "+ y);

        //prefix increment
        int x1 = 20;
        int y1 = ++x1;  //ans: y1 = 21
        System.out.println("Y1 value is "+ y1);
        y1 = x1; //postfix increment ans: y1 = 21
        System.out.println("Y1 value is "+ y1);

        //postfix deccrement
        int x2 = 30;
        int y2 = x2--;  //ans: y2 = 30
        System.out.println("Y2 value is "+ y2);
        y2 = x2; //postfix increment ans: y2 = 29
        System.out.println("Y2 value is "+ y2);

        //prefix deccrement
        int x3 = 40;
        int y3 = --x3;  //ans: y3 = 39
        System.out.println("Y3 value is "+ y3);
        y1 = x1; //postfix increment ans: y3 = 39
        System.out.println("Y3 value is "+ y3);

    }
}
