/**
 * This program prompts the user for an integer then compares that integer
 * to 10 letting the user know if their integer is less than or greater
 * than 10.
 *
 * @author Miranda Germain
 * @since 10/02/22
 * @class CSC 115
 * @program Compare.java
 */

import java.util.Scanner;

public class Compare {
   public static void main (String[] args) {
      comparison();
   }

   // This method prompts the user for a number and the outputs the relative
   // size of the user-defined number compared to a programmer-defined constant
   // (10).
   public static void comparison() {
      // Declare constant variable
      final int TEN = 10;

      // Instantiate a scanner to take input from the keyboard
      Scanner keyboardIn = new Scanner(System.in);

      // Prompt the user for an integer and store it into a variable
      System.out.println("Enter an integer:");
      int num = keyboardIn.nextInt();

      // Use if Statement to compare user-defined statement to 10
      System.out.print("The number " + num + " is ");
      if(num <= TEN) {
         System.out.print("NOT ");
      }
      System.out.println("GREATER than " + TEN + ".");

      // Concluding statement
      System.out.print("Program finished!");
  }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    About an hour
 * 2. What was the hardest part of this lab?
 *    I was hitting my head against the wall trying to make it 3 print
 *    statements. Other than that I wasn't 100% sure on naming conventions
 *    for constants at first, and I had a logic error when I first did num <
 *    TEN since 10 is not greater than 10.
 * 3. What will you always remember (never forget) from this exercise?
 *    I was pretty lazy about testing my outputs this time around and didn't
 *    notice my logic error until i submitted it to code grade. I really think
 *    that's a bad habit to get into and I need to be more thorough in my
 *    testing.
 */