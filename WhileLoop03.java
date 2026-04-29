/**
 * This program prompts the user for an integer to start with and asks for an
 * integer to increment with. The program uses a while loop to print the
 * starting integer and the next five subsequent integers that are
 * incremented using the user-defined incrementor.
 *
 * @author Miranda Germain
 * @since 11/02/2022
 * @class CSC 115
 * @program WhileLoop03.java
 */

import java.util.Scanner;

public class WhileLoop03 {
   public static void main(String[] args) {
      // Call methods to get input & perform loop
      whileLoop();
   }

   // This method prompts the user for integers for the starting number
   // and an incrementor then uses those to create a loop that iterates
   // 5 times
   public static void whileLoop() {
      // Instantiate the scanner to take input from the keyboard
      Scanner keyboardIn = new Scanner(System.in);;

      // Prompt user for a starting number and store it
      System.out.println("Enter starting number:");
      int num = keyboardIn.nextInt();

      keyboardIn.nextLine(); // Move pass return key

      // Prompt user for an incrementor and store it
      System.out.println("\nEnter incrementor:");
      int incrementor = keyboardIn.nextInt();

      keyboardIn.close(); // Close the scanner

      // Print blank line for formatting
      System.out.print("\n");

      // Initialize count for the loop
      int count = 0;

      // Perform while loop to print next five subsequent integers
      while (count <= 5) {
         System.out.println(num);
         num += incrementor;
         count++;
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 20 minutes
 * 2. What was the hardest part of this lab?
 *    I mixed up my =+ & += again. Plus I didn't initilize my count at first
 *    and did (int count <= 5) which was silly. I get nervous about the
 *    amount of variables but they seem necessary for a loop with user-defined
 *    values.
 * 3. What will you always remember (never forget) from this exercise?
 *    Just trying to get it through my head that "=+" is really "= +#"
 *    but I keep consistently making that mistake.
 */