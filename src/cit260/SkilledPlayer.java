package cit260;

public class SkilledPlayer extends Player{
    /**
     *
     */
    private Skill skill;

    public SkilledPlayer(Race race, Skill skill) {
        super(race);
        this.skill = skill;
    }

    @Override
    public int getStrength() {
        // if fighter super.getStrength + 1
        return super.getStrength();
    }

    @Override
    public int getDexterity() {
        // if rogue super.getStrength + 1
        return super.getDexterity();
    }

    @Override
    public int getConstitution() {
        return super.getConstitution();
    }

    @Override
    public int getIntelligence() {
        // if wizard super.getIntelligence + 1
        return super.getIntelligence();
    }

    @Override
    public int getWisdom() {
        return super.getWisdom();
    }

    @Override
    public int getCharisma() {
        return super.getCharisma();
    }

    @Override
    public String getStats() {
        return super.getStats();
    }
}
