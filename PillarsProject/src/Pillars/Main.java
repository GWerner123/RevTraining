package Pillars;

public class Main {

    public static void main(String[] args) {

        //create a new HarryPotterSpells object that doesn't do anything specific.
        //then call method from HarryPotterSpells class on object to make sure it works
        HarryPotterSpells spells = new HarryPotterSpells(null,1,"does something magical.");

        spells.castSpell();


        //create a new object of the Charms class and pass in more specific parameters relevant to it
        //call the castSpell() method that you overrode on this object
        Charms charm = new Charms(null,1,"adds certain properties to an object or individual.");
        charm.castSpell();


        //create new Expelliarmus object
        //call the castSpell() method that you overrode again on it
        Expelliarmus expelliarmus = new Expelliarmus("red");
        expelliarmus.castSpell();


        //call someoneSays() method from Expelliarmus class
        //then call overloaded someoneSays() method to see that it produces the same result
        expelliarmus.someoneSays("Harry Potter",240);
        expelliarmus.someoneSays(240,"Harry Potter");

    }
}
