/**
 * This program prompts the user for a starting integer and an integer
 * to stop at. It then uses a for loop to print every number inbetween
 * including the user's integers.
 *
 * @author Miranda Germain
 * @since 11/02/2022
 * @class CSC 115
 * @program ForLoop03.java
 */

import java.util.Scanner;

public class ForLoop03 {
   public static void main(String[] args) {
      forLoop(); // Call method to perform loop
   }


   // This method prompts the user for a starting and ending integer
   // then prints the starting number, the numbers inbetween, and the
   // ending number using a for loop
   public static void forLoop() {
      // Instantiate a scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Prompt the user for a starting number
      System.out.println("Enter a number to start:");
      int num = keyboardIn.nextInt();

      // Move the return key
      keyboardIn.nextLine();

      // Prompt the user for an ending number
      System.out.println("Enter a number to stop:");
      int end = keyboardIn.nextInt();

      // Close scanner
      keyboardIn.close();

      // Print blank line for formatting
      System.out.print("\n");

      // for loop to print all numbers between the starting point and
      // ending point
      for ( ; num <= end; num++) {
         System.out.println(num);
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 15 minutes
 * 2. What was the hardest part of this lab?
 *    I'm not sure if the missing intitialization was something I should be
 *    doing. I had a seperate counting variable at first but it seemed
 *    redundant since we had a start & end, there's no reason to keep count.
 *    Then I wrote num = num to satisfy the for loop but that seemed really
 *    redundant. So i've left it blank instead.
 * 3. What will you always remember (never forget) from this exercise?
 *    I think this lab kind of shows where while loops may be a better option.
 *    I don't really like the way it looks but there's really no reason for
 *    there to be another intitalization.
 */