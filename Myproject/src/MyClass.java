public class MyClass {
    int x= 5;
    String myStiring= "Hello";

    public static void main(String[] args) {
        MyClass myobj= new MyClass();
        void message(String text){
            System.out.println(text);
        }
        int addition( int x, int y){
            return x + y;
        }
        public static void main(String[] args) {
            MyClass myObj = new MyClass();
            System.out.println(myObj.myString);//Hello
            System.out.println(myObj.x);//5
            myObj.myString = "goodbye";//goodbye
            System.out.println(myObj.myString);
            MyClass myObj2 = new MyClass();//Hello
            System.out.println(myObj2.myString);
            myObj2.myString = "ciao";
            System.out.println(myObj2.myString);//ciao
            myObj.message("how is it going?");
            //myObj.message(text: "this is the good thing");
            int x = myObj.addition(70,486);
            System.out.println( "result is " + x);
        }
    }