package cit260;

public class Hero {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int race;
    private int occupationClass;

    public Hero(){
        this.strength = 0;
        this.dexterity = 0;
        this.constitution = 0;
        this.intelligence = 0;
        this.wisdom = 0;
        this.charisma = 0;
        this.race = 2;
        this.occupationClass = 0;
    }

    public Hero(int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int race, int occupationClass){
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
        this.race = race;
        this.occupationClass = occupationClass;
    }

    public void setStrength(int str){ this.strength=str; }
    public void setDexterity(int dex){ this.dexterity=dex; }
    public void setConstitution(int cons){ this.constitution=cons; }
    public void setIntelligence(int intel){ this.intelligence=intel; }
    public void setWisdom(int wis){ this.wisdom=wis; }
    public void setCharisma(int chari){ this.charisma=chari; }
    public void setRace(int race){ this.race=race; }
    public void setOccupationClass(int occupation){ this.occupationClass=occupation; }
    public int getStrength(){ return this.strength; }
    public int getDexterity(){ return this.dexterity; }
    public int getConstitution(){ return this.constitution; }
    public int getIntelligence(){ return this.intelligence; }
    public int getWisdom(){ return this.wisdom; }
    public int getCharisma() { return this.charisma }
    public int getRace(){ return this.race; }
    public int getOccupationClass(){ return this.occupationClass; }
    public String getStats(){
        private int[] raceArray = {"Dwarf", "Elf", "Human"};
        private int[] occupationArray = {"Wizard", "Rogue", "Fighter"};
        private String stats="Character Stats\n";
                + "Strength: " + this.strength + "\n";
                + "Dexterity: " + this.dexterity + "\n";
                + "Constitution: " + this.constitution + "\n";
                + "Intelligence: " + this.intelligence + "\n";
                + "Wisdom: " + this.wisdom + "\n";
                + "Charisma: " + this.charisma + "\n";
                + "Race: " + raceArray[this.strength] + "\n";
                + "Class: " + occupationArray[this.occupationClass] + "\n";
        return stats;
    }

}
