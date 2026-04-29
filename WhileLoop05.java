/**
 * This program uses a while loop that will keep looping asking the user
 * if they would like to play a game until the user enters "no". It uses a
 * while loop in order to do so.
 *
 * @author Miranda Germain
 * @since 11/02/2022
 * @class CSC 115
 * @program WhileLoop05.java
 */

import java.util.Scanner;

public class WhileLoop05 {
   public static void main(String[] args) {
      whileLoop(); // Call method to perform loop
   }

   // This method prompts the user for whether or not they would like
   // to play a game. It will keep asking until the user enters "no".
   // The case of "no" is insensitive.
   public static void whileLoop() {
      // Instantiate the scanner to take input from the keyboard
      Scanner keyboardIn = new Scanner(System.in);

      // Declare variables
      String decision = "";

      // While loop to determine whether the user wants to keep playing the
      // game or not
      while (!decision.equalsIgnoreCase("no")) {
         // Prompt user for decision then store it.
         System.out.println("Would you like to play a game?");
         decision = keyboardIn.nextLine();

         System.out.print("\n"); // New line for formatting
      }

      keyboardIn.close(); // Close the scanner

      // Valediction
      System.out.print("Game over.");
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 20 minutes
 * 2. What was the hardest part of this lab?
 *    I didn't realize "equalsIgnoreCase" was a thing at first and thought
 *    I was going to have to call several String methods. Plus I had to think
 *    about how to write the conditional for a bit since Strings are weird.
 * 3. What will you always remember (never forget) from this exercise?
 *    Just getting more comfortable with strings in the conditionals and
 *    how to compare and contrast them.
 */