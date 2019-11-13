package AnimelClass1;

public class AnimalTest {
    static String Petname = "Dog";
    static int price = 3000;

    public static void main(String[] args) {
            DogBB();
            Price();
            MoreAnimal ma = new MoreAnimal();

           System.out.println(ma.NamePrice());
            //System.out.println(ma.Petname + " " +ma.price);
    }

    public static void DogBB() {
        System.out.println(Petname);

    }
    private static void Price(){
        System.out.println(price);
    }
}

 class MoreAnimal{

        String Petname= "Cat";
        int price = 2000;

       /* public String AnimalCat(){
            return Petname;
        }
        public void CatPrice(){
            System.out.println(price);
        }*/

       public String NamePrice(){
           return Petname + " " + price;
       }

}


