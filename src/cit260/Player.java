package cit260;

public abstract class Player extends Hero{
    private Race race;

    public Player(Race race) {
        this.race = race;
    }

    @Override
    public int getStrength() {
        // if Human + 1 to super.getDexterity
        return super.getStrength();
    }

    @Override
    public int getDexterity() {
        // if Elf + 2 to super.getDexterity
        // if Human + 1 to super.getDexterity
        return super.getDexterity();
    }

    @Override
    public int getConstitution() {
        // if Dwarf or Human + 1 to super.getConstitution

        return super.getConstitution();
    }

    @Override
    public int getIntelligence() {
        // if Human + 1 to super.getIntelligence
        return super.getIntelligence();
    }

    @Override
    public int getWisdom() {
        // if Human + 1 to super.getWisdom
        return super.getWisdom();
    }

    @Override
    public int getCharisma() {
        // if Human + 1 to super.getCharisma
        return super.getCharisma();
    }

    @Override
    public String getStats() {
        return super.getStats();
    }
}
