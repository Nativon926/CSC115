/**
 * This program prompts the user for an integer to being with then prints the
 * next 10 consecutive numbers using a while loop with each number all on
 * their own line.
 *
 * @author Miranda Germain
 * @since 11/02/2022
 * @class CSC 115
 * @program WhileLoop02.java
 */

import java.util.Scanner;

public class WhileLoop02 {
   public static void main(String[] args) {
      // Instantiate the scanner to take input from the keyboard
      Scanner keyboardIn = new Scanner(System.in);

      // Call methods to get input & perform loop
      whileLoop(getInput(keyboardIn));

      keyboardIn.close(); // Close scanner
   }

   // This method takes user input from the keyboard and returns it as an
   // integer
   public static int getInput(Scanner keyboardIn) {
      // Prompt user for an integer number
      System.out.println("Enter a number:");

      // Return user input
      return keyboardIn.nextInt();
   }

   // This method uses the user-defined integer and prints the next 10
   // consecutive numbers using a whileLoop.
   public static void whileLoop(int num) {
      // Declare variables for keeping iteration count
      int count = 0;

      // Print blank line for formatting
      System.out.print("\n");

      // Perform while loop to print next 10 consecutive numbers
      while (count < 10) {
         num++;
         System.out.println(num);
         count++;
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 20 minutes
 * 2. What was the hardest part of this lab?
 *    Determining where to put num++. Plus with the different methods I'm
 *    always a little lost with where to instantiate and close my Scanners.
 * 3. What will you always remember (never forget) from this exercise?
 *    Just trying to get used to using methods. It's slowly coming to me.
 */