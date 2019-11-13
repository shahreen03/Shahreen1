public class AssignmentOpoDemo {
    public static void main(String[] args) {
/*
=	x = 5	x = 5
+=	x += 3	x = x + 3
-=	x -= 3	x = x - 3
*=	x *= 3	x = x * 3
/=	x /= 3	x = x / 3
%=	x %= 3	x = x % 3
*/
         int x = 3;
         int y = 2;

         x+=y;
         System.out.println("X = "+ x);// x= x+y = 5
         x-=y;
         System.out.println("X = "+ x);// x= x-y = 3
         x*=y;
         System.out.println("X = "+ x);// x= x*y = 6
         x/=y;
         System.out.println("X = "+ x);// x= x/y = 3
         x%=y;
         System.out.println("X = "+ x);// x= x%y = 1



    }
}
