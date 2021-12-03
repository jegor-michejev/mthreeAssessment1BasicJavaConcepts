package a1.basicprogrammingconcepts201021;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anne
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        startGame(userInput);

    }// End of main

    public static void startGame(Scanner userInput) {

        final int MIN_TURNS = 1;
        final int MAX_TURNS = 10;

        System.out.print("Please enter a number of rounds to be played (1-10): ");
        int rounds = userInput.nextInt();

        int[] scoreTracker = new int[rounds];

        if (rounds >= MIN_TURNS && rounds <= MAX_TURNS) {
            int roundCounter = 0;
            while (rounds > 0) {
                System.out.println("Round #" + (roundCounter - 1) + ": ");
                scoreTracker[roundCounter] = playRound(userInput);

                rounds--;
                roundCounter++;
            }

            int lossCounter = 0;
            int winCounter = 0;

            for (int p : scoreTracker) {
                if (p == 1) {
                    winCounter++;
                } else if (p == 2) {
                    lossCounter++;
                }
            }// End of for loop

            if (winCounter > lossCounter) {
                System.out.println("\nYou Won the Game!");
            } else if (lossCounter > winCounter) {
                System.out.println("\nYou lost the game.");
            } else {
                System.out.println("\nThe game was a tie...");
            }

            System.out.println("Try again? \n1. Yes \n2. No");
            int playAgain = userInput.nextInt();

            if (playAgain == 1) {
                startGame(userInput);
            }
            
            System.out.println("Thank you for playing!");

        }// End of if statement
        else {
            System.out.println("Bad value");
        }

    }// End of startGame

    /**
     * Play a round of Rock, Paper, Scissors. User inputs their choice, which is
     * then compared with a randomly generated one.
     *
     * @param userInput
     * @return Returns a result of the game. 0 is tie, 1 is player win, 2 is
     * computer win.
     */
    public static int playRound(Scanner userInput) {
        Random timedSeed = new Random();
        int result = 0; //0 - tie, 1 - win, 2 - loss
        String choices[] = {
            "Rock",
            "Paper",
            "Scissors"
        };

        System.out.println("\nChoose:\n1. Rock\n2. Paper\n3. Scissors");
        int choice = userInput.nextInt() - 1;

        while (choice < 0 || choice > 2) {
            System.out.print("Try again: ");
            choice = userInput.nextInt() - 1;
        }// End of while loop

        System.out.println("\nYou chose " + choices[choice]);

        int computerChoice = timedSeed.nextInt(3);

        System.out.println("Computer chose " + choices[computerChoice]);

        if (choice == computerChoice) {
            System.out.println("Tie.");
        } else {
            switch (choice) {
                case 0:
                    if (computerChoice == 1) {
                        result = 2;
                    } else {
                        result = 1;
                    }
                    break;
                case 1:
                    if (computerChoice == 0) {
                        result = 1;
                    } else {
                        result = 2;
                    }
                    break;
                case 2:
                    if (computerChoice == 0) {
                        result = 2;
                    } else {
                        result = 1;
                    }
            }
            if (result == 1) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost.");
            }
        }

        return result;
    }// End of playRound

}// End of class
