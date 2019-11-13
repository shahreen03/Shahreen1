public class DoWhile1demo {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        do{
            System.out.println(i);
            sum= sum+i;
            i++;
       }while (i<=8);
       System.out.println(sum);
    }
}
