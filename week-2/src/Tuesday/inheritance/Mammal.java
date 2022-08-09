package Tuesday.inheritance;

//extends lets us inherit from another class
public class Mammal extends Animal{


    public Mammal(double weight, int eyes, int legs, String sound, String species) {
        //calls the super's (Animal) constructor
        super(weight, eyes, legs, sound, species);
    }

    //here we can override the speak() method from the parent (Animal) class
    @Override
    public void speak() {
        System.out.println("The mammal says: " + this.sound);
    }
}
