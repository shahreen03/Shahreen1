public class AnimelClass {
    String size, food;
    int cost;

    void setrinfo(String si, String fo, int co){
        size = si;
        food = fo;
        cost = co;

    }

    public void displyinfo() {

        System.out.println("Size= " + size + ", " + "Food= " + food + ", " + "Cost= " + cost);

 }
      private void profit(){
        System.out.println(1000);
    }

    public static void main(String[] args) {
        AnimelClass test = new AnimelClass();
        test.displyinfo();
        test.profit();
    }

    }




//public getx(){
// }
//public setx(){
 //
//
// this.x = x
// }
