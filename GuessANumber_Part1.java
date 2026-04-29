/**
 * This program 
 *
 * @author Miranda Germain
 * @since 11/09/2022
 * @class CSC 115
 * @program GuessANumber_Part1.java
 */
//3456789A123456789A123456789A123456789A123456789A123456789A123456789A123456789

import java.util.Scanner;
import java.util.Random;

public class GuessANumber_Part1 {
   public static void main(String[] args) {
      // Declare constant
      final int MAX = 100;
      
      // Instantiate a Scanner
      Scanner keyboardIn = new Scanner (System.in);
      
      // Call method that compares whether the user's guesses are correct,
      // then call method that outputs the user's amount of attempts at 
      // guessing
      outputResults(compareValues(keyboardIn, MAX));
   }
   
   // This Method
   public static int compareValues(Scanner keyboardIn, int MAX) {
      // Declare variables
      int numGuesses;
      
      // Call getInput in order to get a seed from the user and use that input
      // to instantiate a random object
      Random random = new Random(getInput(keyboardIn, "Enter a seed:"));
      
      // Store a random number (1 to 100) into randomNum
      int randomNum = (random.nextInt(MAX) + 1);
      
      // Move pass return key for next input
      keyboardIn.nextLine();
      
      // Call getInput to get the users input to be used as a guess towards
      // the random generated number
      int guess = getInput(keyboardIn, "\nWelcome!\nPlease enter a number " +
         "between 1 and " + MAX + ":");
      
      // loop to check if guess is the same as random generated number
      for (numGuesses = 1; guess != randomNum; numGuesses++) {
         // Move pass return key
         keyboardIn.nextLine();
         
         // Provide appropriete feedback for guess then prompt for
         // another guess
         if (guess > randomNum) {
            guess = getInput(keyboardIn, "\nToo high. Guess again:");
         } else {
            guess = getInput(keyboardIn, "\nToo low. Guess again:");
         }  
      }
      
      // Return the number of user guess attempts
      return count;    
   }
   
   // This method gets input from the user using a specified prompt. It returns
   // the input as an integer
   public static int getInput (Scanner keyboardIn, String prompt) {
      // Output the appropriete prompt
      System.out.println(prompt);
      
      // Return the next integer input
      return keyboardIn.nextInt();
   }
   
   // This method congratulates the user for guessing the correct number
   // then outputs the number of guesses that the user took.
   public static void outputResults(int numGuesses) {
      System.out.println("\nCongratulations. You guessed correctly!\nYou " +
         "needed " + numGuesses + " guesses.");
   }       
}   
  
  
  
  
  
  
/*
1. How much time was required to complete this lab?

2. What was the hardest part of this lab?

3. What will you always remember (never forget) from this exercise?

*/