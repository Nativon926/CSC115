/**
 * This program uses a while loop that prompts the user and the loop
 * compares that number to the number 3. When the user chooses 3 the
 * loop ends and a message is displayed
 *
 * @author Miranda Germain
 * @since 11/02/2022
 * @class CSC 115
 * @program WhileLoop04.java
 */

import java.util.Scanner;

public class WhileLoop04 {
   public static void main(String[] args) {
      whileLoop(); // Call method to perform loop
   }

   // This method keeps prompting the user for a number until they
   // pick three. The method uses a loop to do so.
   public static void whileLoop() {
      // Instantiate the scanner to take input from the keyboard
      Scanner keyboardIn = new Scanner(System.in);

      // Declare variables
      int num = 0;

      // Loop to determine whether the uses picked 3 or not
      while (num != 3) {
         // Prompt user for a number and store it
         System.out.println("Enter a number:");
         num = keyboardIn.nextInt();

         // For codegrade to compile, only move pass return key if
         // num is not 3.
         if (num != 3) {
            keyboardIn.nextLine();
         }
      }

      // Print message for when 3 is chosen
      System.out.print("You chose 3.");

      keyboardIn.close(); // Close the scanner
   }
}

// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 15 minutes
 * 2. What was the hardest part of this lab?
 *    Remembering to give num a dumby value so the loop would execute
 *    and program would compile. Also I wasn't 100% sure on the best option
 *    for combating codeGrade's quirkiness.
 * 3. What will you always remember (never forget) from this exercise?
 *    I think I'm so used to for loops that I get confused with where to
 *    declare variables and whatnot. Have to remember that with while loops
 *    things work differently.
 */