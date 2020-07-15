package cit260;

public class Human extends Hero implements Race{


    @Override
    public void adjustStats() {
        setCharisma(getCharisma() + 1);
        setConstitution(getConstitution() + 1);
        setDexterity(getDexterity() + 1);
        setIntelligence(getIntelligence() + 1);
        setStrength(getStrength() + 1);
        setWisdom(getWisdom() + 1);
    }
}
