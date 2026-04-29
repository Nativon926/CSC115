/**
 * This program outputs random compliments to the user a user-defined
 * number of times until the user inputs "0" to stop. The user inputs
 * an integer to be used as a seed for the random number generator.
 * Thr program uses that random object to pick from three different
 * compliments in order to output the user-defined number of random
 * compliments.
 *
 * @author Miranda Germain
 * @since 11/15/2022
 * @class CSC 115
 * @program RandomCompliment_Part1.java
 */

import java.util.Scanner;
import java.util.Random;

public class RandomCompliment_Part1 {
   public static void main(String[] args) {
      // Instantiate a Scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Call method to display
      display(keyboardIn);
      
      // Close Scanner Object
      keyboardIn.close();
   }

   // This method outputs different prompts to the user to be used to output
   // a user-defined number of compliments. The method keeps prompting the
   // user for a number of desired compliments until they input "0". The
   // compliments are picked randomly from a list of three different
   // compliments using a random object with a user-defined seed. The program
   // ends and a valediction is given when the user inputs "0".
   public static void display (Scanner keyboardIn) {
      // Welcome the user to the program
      System.out.println("Welcome to the Random Complimenter program.\n");

      // Prompt the user for an integer to be used as a seed to instantiate
      // a random object
      Random random = new Random(getInput(keyboardIn, "Enter a seed for the " +
         "random number generator."));

      keyboardIn.nextLine(); // Move pass return key

      // Prompt the user for the amount of compliments they would like
      int max = getInput(keyboardIn, "\nHow many compliments would you like? " +
         "('0' to quit)");

      // Outter while loop to determine if the user still wants compliments
      while (max != 0) {
         keyboardIn.nextLine(); // Move pass return key

         // Inner loop to output the compliments a user-defined number of times
         // The compliments are outputted at random
         for (int count = 1; count <= max; count++) {
            // Switch statement to determine which compliment to output
            // using a randomly generated number 0-2
            switch (random.nextInt(3)) {
               case 0:
                  System.out.println("You are soooooo good looking.");
                  break;
               case 1:
                  System.out.println("You ... are ... #1.");
                  break;
               default:
                  System.out.println("You're pretty awesome.");
            } // Switch end
         } // For loop (Inner Loop) end

         // Prompt the user for the amount of compliments they would like
         max = getInput(keyboardIn, "\nHow many compliments would you like? " +
         "('0' to quit)");
      } // While Loop (Outter Loop) end

      // Output Valediction Statement
      System.out.print("\nHave a great day!");
   }

  // This Method gets input from the user using a specified prompt. It returns
  // the input as an integer
   public static int getInput(Scanner keyboardIn, String prompt) {
      // Use the specified prompt to prompt the user for an input
      System.out.println(prompt);

      // Return the user's input
      return keyboardIn.nextInt();
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time (in hours) was required to complete this lab?
 *    About 1 hour
 * 2. What was the hardest part of this lab?
 *    At first I wasn't sure where to put the prompt & declaration for how
 *    many compliments they wanted. I didn't want the 2nd loop to run
 *    when the input was 0, and I didn't want to prompt the user twice
 *    if it wasn't 0. I also had a hard time keeping track of my brackets
 *    so I labeled a few of them. I hope that's ok.
 * 3. What will you always remember (never forget) from this exercise?
 *    Just the importance of walking through my code one step at a time
 *    for the different possible cases. It's probably best to learn
 *    how to properly "debug", but doing it mentally is working too.
 */