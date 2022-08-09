package Tuesday.inheritance;

public class Main {

    public static void main(String[] args) {

        Animal shark = new Animal(5000, 2, 0, "glub glub", "Heptranchias perlo");
        Animal lion = new Animal(420, 2, 4, "Roaaarrr!", "Panthera leo");

        shark.speak();
        lion.speak();

        //override the constructor

        Mammal squirrel = new Mammal(1,2,2,"munch","squirrel");

        squirrel.speak();


    }
}
