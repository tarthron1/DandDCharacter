package cit260;

/**
 * This class represents a Hero. It has values that represent the stats of the Hero.
 *
 *
 */
public abstract class Hero {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private String name;

    //default constructor
    public Hero(){
        this(0,0,0,0,0,0,"");
    }

    //declared constructor
    public Hero(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, String name){
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.name = name;
    }

    //setters for stat values
    public void setStrength(int str){ this.strength=str; }
    public void setDexterity(int dex){ this.dexterity=dex; }
    public void setConstitution(int cons){ this.constitution=cons; }
    public void setIntelligence(int intel){ this.intelligence=intel; }
    public void setWisdom(int wis){ this.wisdom=wis; }
    public void setCharisma(int chari){ this.charisma=chari; }
    public void setName(String name){ this.name=name; }

    //getters for stat values
    public int getStrength(){ return this.strength; }
    public int getDexterity(){ return this.dexterity; }
    public int getConstitution(){ return this.constitution; }
    public int getIntelligence(){ return this.intelligence; }
    public int getWisdom(){ return this.wisdom; }
    public int getCharisma() { return this.charisma; }
    public String getName(){ return this.name; }

    //method to print values
    public String getStats(){
        String stats="Character Stats\n"
                + "Name: " + this.getName() + "\n"
                + "Strength: " + this.getStrength() + "\n"
                + "Dexterity: " + this.getDexterity() + "\n"
                + "Constitution: " + this.getConstitution() + "\n"
                + "Intelligence: " + this.getIntelligence() + "\n"
                + "Wisdom: " + this.getWisdom() + "\n"
                + "Charisma: " + this.getCharisma() + "\n";
        return stats;
    }
    public void adjustStats() {}

}
