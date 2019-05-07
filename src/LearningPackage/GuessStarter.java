package LearningPackage;

import java.util.Random;
import java.util.Scanner;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    static final String ASK_USER_FOR_NUMBER= "I'm thinking of a number between 1 and 100\n" +
            "(including both). Can you guess what it is?";
    static final String DISPLAY_USER_NUMBER= "Your number is:";
    static final String DISPLAY_GENERATED_NUMBER= "The number I was thinking of is:";


    public static void main(String[] args) {
        //Declare all variables
        int randomNum, userNum, diff;

        Scanner sc=new Scanner(System.in);


        // Pick a random number
        randomNum=generateRandomNumber(100);

        //Ask user to guess a number between 1&100 and Display it
        System.out.println(ASK_USER_FOR_NUMBER);
        userNum= sc.nextInt();
        System.out.println(DISPLAY_USER_NUMBER+userNum);

        //Display generated number
        System.out.println(DISPLAY_GENERATED_NUMBER+randomNum);

        //Compare user number and generated number and display message about number difference
        diff=Math.abs(randomNum-userNum);
        if (diff==0){
            System.out.println("You guessed right");
        }else
            System.out.println("You were off by:"+diff);
    }

    private static int generateRandomNumber(int range) {
        // pick a random number
        Random random = new Random();
        return random.nextInt(range) + 1;


    }

}

