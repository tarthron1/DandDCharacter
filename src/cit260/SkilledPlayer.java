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
        if(this.skill == Skill.FIGHTER){
            // if fighter super.getStrength + 1
            return super.getStrength()+1;
        } else {
            return super.getStrength();
        }
    }

    @Override
    public int getDexterity() {
        if(this.skill == Skill.ROGUE){
            // if fighter super.getDexterity + 1
            return super.getDexterity()+1;
        } else {
            return super.getDexterity();
        }
    }

    @Override
    public int getConstitution() {
        return super.getConstitution();
    }

    @Override
    public int getIntelligence() {
        if(this.skill == Skill.WIZARD){
            // if fighter super.getIntelligence + 1
            return super.getIntelligence()+1;
        } else {
            return super.getIntelligence();
        }
    }

    @Override
    public int getWisdom() {
        return super.getWisdom();
    }

    @Override
    public int getCharisma() {
        return super.getCharisma();
    }

    public Skill getSkill() {
        return this.skill;
    }

    @Override
    public String getStats() {
        return super.getStats()+"\nClass: "+this.getSkill()+"\n";
    }
}
