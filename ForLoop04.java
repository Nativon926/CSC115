/**
 * This program prompts the user for a starting, ending, and incremental
 * integer. It uses those values for a for loop that prints the numbers
 * between start (inclusive) and end and uses the incrementer between them.
 *
 * @author Miranda Germain
 * @since 11/02/2022
 * @class CSC 115
 * @program ForLoop04.java
 */

import java.util.Scanner;

public class ForLoop04 {
   public static void main(String[] args) {
      // Instatiate the Scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Methods to take input and output results
      outputResults(getInput(keyboardIn, "Enter a number to start:"), 
         getInput(keyboardIn, "Enter a number to stop:"),
         getInput(keyboardIn, "Enter a number to increase:"));
         
      // Close Scanner
      keyboardIn.close();   
   }

   // This method uses the Scanner created in main to get an integer from the
   // user. It also takes a string literal in order to display the
   // appropriate prompt to the user.
   public static int getInput (Scanner keyboardIn, String prompt) {
      System.out.println(prompt);
      return keyboardIn.nextInt();
   }

   // This method outputs the results of the program using the user-defined
   // integers and for loops.
   public static void outputResults(int num, int end, int increment) {
      // Print a blank line for formatting
      System.out.print("\n");

      // For loop to print the numbers as user specified
      for ( ; num <= end; num += increment ) {
         System.out.println(num);
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 30 minutes
 * 2. What was the hardest part of this lab?
 *    I was a little confused by passing a string literal into a method but
 *    it worked out and makes sense.
 * 3. What will you always remember (never forget) from this exercise?
 *    This lab has given me a better idea of how to use the input method.
 *    Before I found it silly to have a method that would just intake integers
 *    from the keyboard since it felt like an extra unecessary step but with
 *    the addition of the string literal it becomes more useful.
 */