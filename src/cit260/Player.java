package cit260;

public abstract class Player extends Hero{
    private Race race;

    public Player(Race race) {
        this.race = race;
    }

    @Override
    public int getStrength() {
        if(this.race == Race.HUMAN){
            // if Human + 1 to super.getDexterity
            return super.getStrength()+1;
        } else {
            return super.getStrength();
        }
    }

    @Override
    public int getDexterity() {
        switch (this.race) {
            case ELF:
                // if Elf + 2 to super.getDexterity
                return super.getDexterity() + 2;
            case HUMAN:
                // if Human + 1 to super.getDexterity
                return super.getDexterity() + 1;
            default:
                return super.getDexterity();
        }
    }

    @Override
    public int getConstitution() {
        // if Dwarf or Human + 1 to super.getConstitution
        if(this.race == Race.HUMAN || this.race == Race.DWARF){
            return super.getConstitution()+1;
        } else {
            return super.getConstitution();
        }
    }

    @Override
    public int getIntelligence() {
        if(this.race == Race.HUMAN){
            // if Human + 1 to super.getIntelligence
            return super.getIntelligence()+1;
        } else {
            return super.getIntelligence();
        }
    }

    @Override
    public int getWisdom() {
        if(this.race == Race.HUMAN){
            // if Human + 1 to super.getWisdom
            return super.getWisdom()+1;
        } else {
            return super.getWisdom();
        }
    }

    @Override
    public int getCharisma() {
        if(this.race == Race.HUMAN){
            // if Human + 1 to super.getCharisma
            return super.getCharisma()+1;
        } else {
            return super.getCharisma();
        }
    }

    public Race getRace() {
        return this.race;
    }

    @Override
    public String getStats() {
        return super.getStats()+"Race: "+this.getRace();
    }
}
