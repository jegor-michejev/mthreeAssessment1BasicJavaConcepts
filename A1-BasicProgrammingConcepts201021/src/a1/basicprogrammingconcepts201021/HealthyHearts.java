package a1.basicprogrammingconcepts201021;

import java.util.Scanner;

/**
 *
 * @author Anne
 */
public class HealthyHearts {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        final int HEARTRATE = 220;
        final int TARGET_HR_LOW = 50;
        final int TARGET_HR_HIGH = 85;
        
        // Get user input
        int age = 0;

        //Use a do .. while loop in case the user inputs a negative number
        do {
            System.out.print("What is your age? ");
            age = userInput.nextInt();
            if (age < 0) {
                System.out.println("Invalid number, try again.");
            }// End of if statement
        } while (age < 0);

        //Generate answers
        int maxHeartRate = HEARTRATE - age;

        int targetHeartRateLow = maxHeartRate * TARGET_HR_LOW / 100;
        int targetHeartRateHigh = maxHeartRate * TARGET_HR_HIGH / 100;
        
        // Check if the number is valid
        if (targetHeartRateLow <= 0){
            System.out.println("Your heartbeat cannot be healthy");
        }// End of if statement
        
        // Display results
        else{
        System.out.println("Your maximu heart rate should be "
                + maxHeartRate + " beats per minute");

        System.out.println("Your target HR Zone is "
                + targetHeartRateLow + " - " + targetHeartRateHigh
                + " beats per minute");
        } // End of else statement
    }// End of main

}// End of class
