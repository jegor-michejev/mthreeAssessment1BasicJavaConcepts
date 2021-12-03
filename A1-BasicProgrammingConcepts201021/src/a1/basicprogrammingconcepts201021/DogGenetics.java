package a1.basicprogrammingconcepts201021;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Anne
 */
public class DogGenetics {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Random timedSeed = new Random();
        
        //final int BREED_AMOUNT = 5;

        // Get the user input
        System.out.print("What's your dog's name? ");
        String dogName = userInput.nextLine();
        System.out.println("Well then, I have this highly reliable report on "
                + dogName + "'s prestigious background right here.\n");
        
        //String[] breeds = new String[BREED_AMOUNT];
        String[] breeds = {
            "Poodle",
            "French Bulldog",
            "Golden Retriever",
            "Dalmatian",
            "Chihuahua"
        };

        //Generate the genetics of the dog
        int[] percentage = new int[breeds.length];
        // Set every int to 0
        for (int i = 0; i < percentage.length; i++){
            percentage[i] = 0;
        }// End of the for loop
        

        int percentageTotal = 100; // Maximu number that can be generated

        for (int i = 0; i < breeds.length - 1; i++) {

            int randomNumber = timedSeed.nextInt(percentageTotal);
            percentage[i] = randomNumber;
            percentageTotal -= randomNumber; // To ensure the sum of breed percentage does not go over 100
        }// For loop end

        percentage[breeds.length - 1] = percentageTotal; // The last number should not be generated

        //Print the anwer
        System.out.println(dogName + " is:\n");

        for (int i = 0; i < 5; i++) {
            System.out.println(percentage[i] + "% " + breeds[i]);
        }// ENd of for loop

        System.out.println("\nWow, that's QUITE the dog!");

//        // Debug
//        percentageTotal = 0;
//        for (int num : percentage) {
//            percentageTotal += num; // Must be 100
//        }// End of for loop
//
//        System.out.println("Percentage total is: " + percentageTotal);

    }// End of main

}
