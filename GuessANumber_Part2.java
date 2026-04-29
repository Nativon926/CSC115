/**
 * This program prompts the user for a integer that will be used as a seed
 * for a random object. It generates a random number from 1 to 100 that the
 * user can then guess at. The program will keep prompting the user to guess
 * at the number until the user gets it right. If the guess is too low it'll
 * tell them two low, and too high for too high, helping the user guess the
 * correct number. Lastly it congratulates the user and let's them know
 * how many attempts it took to guess the correct number. When finished
 * the program prompts the user for if they'd like to play again, and if so
 * the program will repeat.
 *
 * @author Miranda Germain
 * @since 11/12/2022
 * @class CSC 115
 * @program GuessANumber_Part2.java
 */

import java.util.Scanner;
import java.util.Random;

public class GuessANumber_Part2 {
   public static void main(String[] args) {
      // Declare constant
      final int MAX = 100;

      // Instantiate a Scanner
      Scanner keyboardIn = new Scanner (System.in);

      // Output Salutations
      System.out.println("Welcome to the Guessing Game!\n");

      // Do-while loop that will keep asking the user if they'd like to
      // play the game again once they finish the game
      do {
         // Call method that compares whether the user's guesses are correct,
         // then call method that outputs the user's amount of attempts at
         // guessing
         outputResults(compareValues(keyboardIn, MAX));
      } while (getInput(keyboardIn, "\n\nDo you want to play again? Answer 0" +
         " for \"no\" or 1 for \"yes\":\n") == 1);
      // Close Scanner
      keyboardIn.close();
   }

   // This method uses a random object with a user-defined seed to generate
   // a random integer number from 1 - 100 that the user can guess at. It
   // keeps prompting the user for a guess until they get it correct while
   // giving them clues after every wrong guess. This method returns the
   // amount of guesses as an integer.
   public static int compareValues(Scanner keyboardIn, int MAX) {
      // Declare variables
      int numGuesses;

      // Call getInput in order to get a seed from the user and use that input
      // to instantiate a random object
      Random random = new Random(getInput(keyboardIn, "\nEnter a seed:"));

      // Store a random number (1 to 100) into randomNum
      int randomNum = (random.nextInt(MAX) + 1);

      // Move pass return key for next input
      keyboardIn.nextLine();

      // Call getInput to get the users input to be used as a guess towards
      // the random generated number
      int guess = getInput(keyboardIn, "\nPlease enter a number between 1 and " + MAX + ":");

      // loop to check if guess is the same as random generated number
      for (numGuesses = 1; guess != randomNum; numGuesses++) {
         // Move pass return key
         keyboardIn.nextLine();

         // Provide appropriete feedback for guess then prompt for
         // another guess
         if (guess > randomNum) {
            guess = getInput(keyboardIn, "Too high. Guess again.");
         } else {
            guess = getInput(keyboardIn, "Too low. Guess again.");
         }
      }

      // Return the number of user guess attempts
      return numGuesses;
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
   // then outputs the number of guesses that the user attempted. The
   // message changes depending on whether one or multiple guesses were
   // attempted
   public static void outputResults(int numGuesses) {
      // Output Congratulations and results for number of attempts
      System.out.print("\nCongratulations. You guessed correctly!\nYou " +
         "needed ");

      // If statement determining whether one or multiply attempts were
      // taken for correct grammar.
      if (numGuesses == 1) {
         System.out.println("only " + numGuesses + " guess.");
      } else {
         System.out.println(numGuesses + " guesses.");
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    About 30 minutes
 * 2. What was the hardest part of this lab?
 *    I tried doing a nested loop at first, but the only way I could
 *    think of making it work was if my process could call the output
 *    instead of main, so the output method could loop also. I don't know
 *    if there's something I'm misunderstanding, I'm giving it time to
 *    think on.
 * 3. What will you always remember (never forget) from this exercise?
 *    To read the specifications first before coding. My first try at this
 *    I created a count variable in the do while so that I could create an
 *    if statement in the process method that would run the salutations only
 *    if count was 0.
 */