public class BitwiseDemo {
    public static void main(String[] args) {

         int a = 32;
         int b = 12;
         int c;
         c = a & b;
         System.out.println(c);
         c = a | b;
         System.out.println(c);
         c = a ^ b;
         System.out.println(c);
         c = a >> 3;
         System.out.println(c);// 32 k 2 diye 3 bar BHAG korte hobe
         c = a<< 3;
         System.out.println(c);// 32 k 2 diye 3 bar GUN korte hobe

  }
}
/*  1. &	Binary AND Operator ( Binary code k multyply kora)
      2. |  Binary OR Operator (Bc k plus kora)
      3. ^	Binary XOR Operator
      4. ~ Binary Complement Operator
      5.<<	Binary Left Shift Operator
      6.>>	Binary Right Shift Operator
      7.>>>	Shift right zero fill operator*/
