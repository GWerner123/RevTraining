package Tuesday.inheritance;

//most generic of all the classes
//everything in this class must be applicable to the other classes
public class Animal {
    double weight;
    int eyes;
    int legs;
    String sound;
    String species;

    //constructor
    public Animal(double weight,int eyes,int legs,String sound,String species) {
        this.weight = weight;
        this.eyes = eyes;
        this.legs = legs;
        this.sound = sound;
        this.species = species;
    }

    //empty constructor
    public Animal() {
        this.species = "undefined";
    }

    //methods
    public void speak() {
        System.out.println("The " + this.species + " says: " + this.sound);
    }
}
