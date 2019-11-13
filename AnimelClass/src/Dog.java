public class Dog {
    public static void main(String[] args) {
        AnimelClass dog1= new AnimelClass();
        //dog1.size= "Big";
        //dog1.food= "Ben";
        //dog1.cost= 4000;
        dog1.setrinfo("Big", "Ben", 4000);
        dog1.displyinfo();
        //dog1.profit();
        //System.out.println("Size= "+ dog1.size+ ", "+ "Food= "+ dog1.food+ ", "+ "Cost= "+dog1.cost);

        AnimelClass dog2= new AnimelClass();
        //dog2.size= "Medium";
        //dog2.food= "Ben";
        //dog2.cost= 3000;
        dog2.setrinfo("Medium", "Ben", 3000);
        dog2.displyinfo();

        //System.out.println("Size= "+ dog2.size+ ", "+ "Food= "+ dog2.food+ ", "+ "Cos2= "+dog2.cost);

        AnimelClass dog3= new AnimelClass();
        //dog3.size= "Small";
        //dog3.food= "Ben";
        //dog3.cost= 2000;
        dog3.setrinfo("Small", "Ben", 2000);
        dog3.displyinfo();

        //System.out.println("Size= "+ dog3.size+ ", "+ "Food= "+ dog3.food+ ", "+ "Cost= "+dog3.cost);

    }
}
