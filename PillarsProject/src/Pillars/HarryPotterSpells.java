package Pillars;

public class HarryPotterSpells {

    //declare variables of spells and make them all private
    private Boolean visibleLight;
    private int firstBookReference;
    private String effect;

    //constructors
    //default constructor
    public HarryPotterSpells() {

    }

    //parameterized constructor
    public HarryPotterSpells(Boolean visibleLight,int firstBookReference,String effect) {
        this.visibleLight = visibleLight;
        this.firstBookReference = firstBookReference;
        this.effect = effect;
    }

    //methods
    public void castSpell() {
        System.out.println("You cast a spell and it " + this.effect);
    }

    //last methods are getters and setters
    public Boolean getVisibleLight() {
        return visibleLight;
    }

    public void setVisibleLight(Boolean visibleLight) {
        this.visibleLight = visibleLight;
    }

    public int getFirstBookReference() {
        return firstBookReference;
    }

    public void setFirstBookReference(int firstBookReference) {
        this.firstBookReference = firstBookReference;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}
