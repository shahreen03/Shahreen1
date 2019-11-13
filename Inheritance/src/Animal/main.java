package Animal;

public class main {
    public static void main(String[] args) {
        Apa myapa = new Apa();
        Bee mybee = new Bee();
        Cat myCat = new Cat();
        Cow mycow = new Cow();
        Dog myDog = new Dog();
        Elephant myElephant = new Elephant();
        Goat mygoat = new Goat();
        Pig myPig = new Pig();
        Rat myrat = new Rat();
        Swan myswan = new Swan();
        Snake mySnake = new Snake();

        Sanctuary mysenctury = new Sanctuary();

        mysenctury.animals[0]= myCat;
        mysenctury.animals[1]= myDog;
        mysenctury.animals[2]= myPig;
        mysenctury.animals[3]= mybee;
        mysenctury.animals[4]= myapa;
        mysenctury.animals[5]= mycow;
        mysenctury.animals[6]= myrat;
        mysenctury.animals[7]= myElephant;
        mysenctury.animals[8]= mygoat;
        mysenctury.animals[9]= mySnake;
        mysenctury.animals[10]= myswan;

        for (Animal animal: mysenctury.animals){
            animal.animalSound();
        }

    }
}
