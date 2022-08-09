package Pillars;

public class Expelliarmus extends Charms {

    //variables specific to this Expelliarmus
    private String color;





    //default constructor
    public Expelliarmus() {

    }
    //parameterized constructor
    public Expelliarmus(String color) {
        this.color = color;
        this.setVisibleLight(true);
        this.setFirstBookReference(1);
        this.setEffect("forces the target to drop their wand after a flash of " + this.color + " light.");
    }





    //override castSpell() method again
    @Override
    public void castSpell() {
        System.out.println("You cast the charm Expelliarmus and it " + this.getEffect());
    }


    //method overloading
    public String someoneSays(String name,int timesUsedExpelliarmus) {
        String result = "My name is " + name + " and I've used Expelliarmus " + timesUsedExpelliarmus + " times.";
        System.out.println(result);
        return result;
    }
    //overload this method so that you can input the int first and then the String value second
    public String someoneSays(int timesUsedExpelliarmus,String name) {
        String result = "My name is " + name + " and I've used Expelliarmus " + timesUsedExpelliarmus + " times.";
        System.out.println(result);
        return result;
    }
}
