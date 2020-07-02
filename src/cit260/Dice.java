package cit260;

import java.util.ArrayList;
import java.util.Random;

public class Dice {
    private int numberOfFaces;
    private int numberOfDice;

    public Dice(){
        this(1,6);
    }

    public Dice( int numberOfDice, int numberOfFaces){
        this.numberOfFaces = numberOfFaces;
        this.numberOfDice = numberOfDice;
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    public void setNumberOfFaces(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public int roll(){
        int sumOfRolls = 0;
        Random random = new Random();
        for (int i = 0; i < numberOfDice; i++) {
            int roll = random.nextInt(numberOfFaces) + 1;
            sumOfRolls += roll;
        }
        return sumOfRolls;
    }

    public ArrayList<Integer> rollForIndividualValues(){
        ArrayList<Integer> dieRolls = new ArrayList<>();
        Dice tempDie = new Dice(1, this.numberOfFaces );
        for (int i = 0; i < this.numberOfDice ; i++) {
            dieRolls.add(tempDie.roll());
        }
        return dieRolls;
    }
}
