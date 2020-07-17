package cit260;

import java.util.ArrayList;
import java.util.Random;

/**
 *  This class represents rolling any number of dice.
 *  You can set the number of faces on the dice as well as the number of dice.
 *  Includes method for the total of all dice rolled as well as
 *  a roll of the dice to get the individual values returned as an Array.
 */

public class Dice {
    private int numberOfFaces;
    private int numberOfDice;

    //default constructor
    public Dice(){
        this(1,6);
    }

    //set the number of dice to roll as well as the number of faces on each die.
    public Dice( int numberOfDice, int numberOfFaces){
        this.numberOfFaces = numberOfFaces;
        this.numberOfDice = numberOfDice;
    }

    //getters and setters
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

    // rolls all dice and returns the sum as an int
    public int roll(){
        int sumOfRolls = 0;
        Random random = new Random();
        for (int i = 0; i < numberOfDice; i++) {
            int roll = random.nextInt(numberOfFaces) + 1;
            sumOfRolls += roll;
        }
        return sumOfRolls;
    }

    // rolls all dice and returns the individual values as an int Array
    public int[] rollForIndividualValues(){
        int[] dieRolls = new int[numberOfDice];
        Dice tempDie = new Dice(1, this.numberOfFaces );
        for (int i = 0; i < this.numberOfDice ; i++) {
            dieRolls[i] = tempDie.roll();
        }
        return dieRolls;
    }
}
