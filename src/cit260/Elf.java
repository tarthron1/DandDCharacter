package cit260;

public class Elf extends Hero implements Race {
    private boolean highElf;
    private boolean woodElf;
    private boolean darkElf;

    public Elf(boolean isHighElf, boolean isWoodElf, boolean isDarkElf){
        highElf = isHighElf;
        woodElf = isWoodElf;
        darkElf = isDarkElf;
    }

    @Override
    public void adjustStats() {
        setDexterity(getDexterity() + 2);
        if (highElf){
            setIntelligence(getIntelligence() + 1);
        }
        if (woodElf){
            setWisdom(getWisdom() + 1);
        }
        if (darkElf){
            setCharisma(getCharisma() + 1);
        }
    }
}
