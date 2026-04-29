/**
 * This program prompts the user for a starting integer then prints the
 * next consecutive four integers with each number on its own line.
 *
 * @author Miranda Germain
 * @since 11/02/2022
 * @class CSC 115
 * @program ForLoop02.java
 */

import java.util.Scanner;

public class ForLoop02 {
   public static void main(String[] args) {
      // Instatiate a scanner
      Scanner keyboardIn = new Scanner(System.in);

      forLoop(getInput(keyboardIn)); // Call method to perform loop

      keyboardIn.close(); // Close the scanner
   }

   // This method prompts the user for a starting integer
   // and returns that entered value
   public static int getInput(Scanner keyboardIn) {
      // Prompt the user for a starting point
      System.out.println("Enter a number:");

      // Return user-defined integer
      return keyboardIn.nextInt();
   }

   // This method uses the user-defined starting point and
   // prints the next four consecutive integers using a for loop
   public static void forLoop(int num) {
      // Print blank line for formatting
      System.out.print("\n");

      // for loop to print the next 4 consecutive integers
      for (int count = 0; count <= 4; count ++) {
         System.out.println(num);
         num++;
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 15 minutes
 * 2. What was the hardest part of this lab?
 *    This one was a bit different from the while loop since it asked us to
 *    output the number again as well so num++ had to be after the print
 *    statement.
 * 3. What will you always remember (never forget) from this exercise?
 *    Just to go through the iterations and what each variable is during that
 *    iteration in my head in order to get the expected output.
 */