package Pillars;

//using the keyword "extends" we can inherit from the parent class
public class Charms extends HarryPotterSpells {

    //create a default constructor
    public Charms() {

    }

    //create a constructor that will use the member variables from the parent class
    public Charms(Boolean visibleLight,int firstBookReference,String effect) {
        super(visibleLight,firstBookReference,effect);
    }

    //override the castSpell() method you inherit from the parent class to give it more of a unique function
    @Override
    public void castSpell() {
        System.out.println("You cast a charm (which is a type of spell) and it " + this.getEffect());
    }
}
