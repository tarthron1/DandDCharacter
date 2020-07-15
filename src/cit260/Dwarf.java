package cit260;

public class Dwarf extends Hero implements Race{
    private boolean hillDwarf;
    private boolean mountainDwarf;

    public Dwarf(boolean isHillDwarf, boolean isMountainDwarf){
        this.hillDwarf = isHillDwarf;
        this.mountainDwarf = isMountainDwarf;
    }

    @Override
    public void adjustStats() {
        setConstitution(getConstitution() + 2);
        if (hillDwarf){
            setWisdom(getWisdom() + 1);
        }
        if (mountainDwarf) {
            setStrength(getStrength() +2);
        }
    }


}
