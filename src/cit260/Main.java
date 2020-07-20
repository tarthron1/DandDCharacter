package cit260;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int intResponse = 0;
        int partySize = 0;
        int raceCode = 0;
        int skillCode = 0;
        Race useRace=Race.HUMAN;
        Skill useSkill=Skill.WIZARD;
        String partyName = "";
        String personName = "";
        boolean responseCheck;
        Scanner input = new Scanner(System.in);
        ArrayList<Hero> skilledPlayers = new ArrayList<>();
        String[] statList = {"Strength","Dexterity","Constitution","Intelligence","Wisdom","Charisma"};
        int[] statInts = new int[6];
        int[] diceInts = new int[6];
        boolean[] diceSet = new boolean[6];
        /*
        // Prompt user: Display a previous team or create a new adventure party
        1. Ask user if they want to(1) display a team already created or (2) create a new team
        */
        responseCheck = true;
        do {
            try {
                System.out.println("Would you like to (1) display a previously formed party or (2) form a new adventure party?");
                intResponse = input.nextInt();
                if(intResponse == 1 || intResponse == 2) responseCheck=false;
                else System.out.println("Answer must be either 1 or 2. Try again.");
            }
            catch (Exception IOException){
                System.out.println("Invalid response type.");
                input.next();
            }
        } while (responseCheck);
        /*

        // If opening previous team, find file and display party stats.
        2. verify that user input is either 1 or 2.
        3. If "1", ask the party name they wish to view
                4. Verify that a file matching user input exists
                5. open file indicated
                6. read text file and display for the user
                7. end program
                */
        if(intResponse == 1){
            System.out.println("Display previous team.");
        }else {
            System.out.println("------------------------------------------------------------\nRemember to choose your answers out of the provided options.\n------------------------------------------------------------");
        }
        /*

        // If creating new party, prompt for a number of party members
        8. If "2", ask how many party members to create
        */
            responseCheck=true;
            do{
                try {
                    input = new Scanner(System.in);
                    System.out.println("How many party members would you like to generate?");
                    partySize = input.nextInt();
                    if (partySize > 0) responseCheck = false;
                    else System.out.println("Party must have at least one party member.");
                }
                catch (Exception IOException){
                    System.out.println("Invalid response type.");
                    input.next();
                }
            }while(responseCheck);
            /*
                9. Ask the name they would like to call the team
            */
            input = new Scanner(System.in);
            System.out.println("What do you want to call your team?");
            partyName = input.nextLine();
            /*
                // Loop once for each party member:
                10. Loop through characrer creation once for each intended party member
                */
            for(int person = 1; person <= partySize; person++) {
                System.out.println("Character #"+(skilledPlayers.size() + 1));
            /*
                // Select a race
                // generate random numbers and assign to stats
                // Name the character
                    11. generate a character from the skilledplayer class
                    12. prompt user for a race (1 - elf, 2 - dwarf, 3 - human)
                    13. verify answer is 1, 2, or 3
                    14. use dice class to generate a sequence of random numbers
                    15. cycle six times to prompt user to assign each number to a trait
                        16. display unassigned numbers and ask which one they want to assign to a given trait
                        17. verify that the given number is valid
                        18. assign the value to the given trait
                        19. remove the value from the remaining value
                    20. prompt user for a character name
                    21. set name of character
                    22. add character to an object array of the team members
                */
                responseCheck=true;
                // select a race
                do{
                    try {
                        input = new Scanner(System.in);
                        System.out.println("What race do you want this character to be? (1=Elf, 2=Dwarf, 3=Human)");
                        raceCode = input.nextInt();
                        switch (raceCode){
                            case 1:
                                useRace = Race.ELF;
                                responseCheck=false;
                                break;
                            case 2:
                                useRace = Race.DWARF;
                                responseCheck=false;
                                break;
                            case 3:
                                useRace = Race.HUMAN;
                                responseCheck=false;
                                break;
                            default:
                                System.out.println("Not an option.");
                        }
                    }
                    catch (Exception IOException){
                        System.out.println("Invalid response type.");
                    }
                }while(responseCheck);
                responseCheck=true;
                // select a skill
                do{
                    try {
                        input = new Scanner(System.in);
                        System.out.println("What class do you want this character to be? (1=Wizard, 2=Rogue, 3=Fighter)");
                        skillCode = input.nextInt();
                        switch (skillCode){
                            case 1:
                                useSkill = Skill.WIZARD;
                                responseCheck=false;
                                break;
                            case 2:
                                useSkill = Skill.ROGUE;
                                responseCheck=false;
                                break;
                            case 3:
                                useSkill = Skill.FIGHTER;
                                responseCheck=false;
                                break;
                            default:
                                System.out.println("Not an option.");
                        }
                    }
                    catch (Exception IOException){
                        System.out.println("Invalid response type.");
                    }
                }while(responseCheck);
                // Set stats
                for(int a = 0; a < 6; a++){
                    statInts[a]=0;
                    diceSet[a]=true;
                }

                //generate the base stats by getting the sum of the highest rolls of 4 six sided dice.
                Dice dice = new Dice(4 ,6);
                for (int i = 0; i < 6; i++) {
                    int[] fourDice = dice.rollForIndividualValues();
                    double lowestRoll = Double.POSITIVE_INFINITY;
                    int sumOfHighestThree =0;
                    for (int roll : fourDice
                    ) {
                        if (roll < lowestRoll) {
                            lowestRoll = roll;
                        }
                        sumOfHighestThree +=  roll;
                    }
                     sumOfHighestThree -= lowestRoll;
                    diceInts[i] = sumOfHighestThree;
                }

                for(int i=0; i<5; i++) {
                    responseCheck = true;
                    do{
                        try {
                            input = new Scanner(System.in);
                            System.out.println("Dice values that have not yet been assigned:");
                            for (int j = 0; j < 6; j++) {
                                if (diceSet[j]) System.out.print(diceInts[j] + " ");
                            }
                            System.out.println("Stats that have not yet been set:");
                            for (int j = 0; j < 6; j++) {
                                if (statInts[j] == 0) System.out.println((1+j) + " = " + statList[j]);
                            }
                            System.out.println("To which stat would you like to assign this die value? [ " + diceInts[i] + " ]");
                            intResponse = (input.nextInt())-1;
                            if(intResponse < 0 || intResponse > 5 || statInts[intResponse]>0){
                                System.out.println("Invalid response value.");
                            }else{
                                responseCheck=false;
                                statInts[intResponse]=diceInts[i];
                                diceSet[i]=false;
                            }
                        }
                        catch (Exception IOException){
                            System.out.println("Invalid response type.");
                        }
                    }while(responseCheck);
                }
                for (int j = 0; j < 6; j++) {
                    if(statInts[j] == 0)
                        statInts[j] = diceInts[5];
                }

                System.out.println("");
                input = new Scanner(System.in);
                System.out.println("What do you want to name this character?");
                personName = input.nextLine();
                SkilledPlayer templayer=new SkilledPlayer(useRace, useSkill);
                templayer.setName(personName);
                templayer.setStrength(statInts[0]);
                templayer.setDexterity(statInts[1]);
                templayer.setConstitution(statInts[2]);
                templayer.setIntelligence(statInts[3]);
                templayer.setWisdom(statInts[4]);
                templayer.setCharisma(statInts[5]);
                skilledPlayers.add(templayer);
                System.out.println(templayer.getStats());
            }
            /*
                23. generate a text file with the given party name
                24. once team is created, scan through object array and call getstats for each party member
                25. display text on screen to show off generated party
                26. export resulting text to text file
         */
        File file = new File(partyName + ".txt");
        try (PrintWriter fileOutput = new PrintWriter(file)){
            for (Hero skilledPlayer: skilledPlayers
                 ) {
                fileOutput.println(skilledPlayer.getStats());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: "+ e.getMessage());
            e.printStackTrace();
            return;
        }

        }

    void generateStats(){

    }


}
