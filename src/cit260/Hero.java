package cit260;

public abstract class Hero {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public Hero(){
        this.strength = 0;
        this.dexterity = 0;
        this.constitution = 0;
        this.intelligence = 0;
        this.wisdom = 0;
        this.charisma = 0;
    }

    public Hero(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma){
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public void setStrength(int str){ this.strength=str; }
    public void setDexterity(int dex){ this.dexterity=dex; }
    public void setConstitution(int cons){ this.constitution=cons; }
    public void setIntelligence(int intel){ this.intelligence=intel; }
    public void setWisdom(int wis){ this.wisdom=wis; }
    public void setCharisma(int chari){ this.charisma=chari; }
    public int getStrength(){ return this.strength; }
    public int getDexterity(){ return this.dexterity; }
    public int getConstitution(){ return this.constitution; }
    public int getIntelligence(){ return this.intelligence; }
    public int getWisdom(){ return this.wisdom; }
    public int getCharisma() { return this.charisma; }
    public String getStats(){
        String stats="Character Stats\n"
                + "Strength: " + this.strength + "\n"
                + "Dexterity: " + this.dexterity + "\n"
                + "Constitution: " + this.constitution + "\n"
                + "Intelligence: " + this.intelligence + "\n"
                + "Wisdom: " + this.wisdom + "\n"
                + "Charisma: " + this.charisma + "\n";
        return stats;
    }

}
