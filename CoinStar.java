/**
 * This program takes input from the user for an amount of pennies then
 * converts that to a dollar amount. It takes a certain percentage from
 * that amount then outputs that processing fee and the user's actual
 * amount earned from the transaction.
 *
 * @author Miranda Germain
 * @since 09/21/2022
 * @class CSC 115
 * @program CoinStar.java
 */

import java.util.Scanner;

public class CoinStar {
   public static void main(String[] args) {
      coins(); // Call the method to do all the work.
   }

   // This method gets a user-defined deposit, calculates the processing fee,
   // and prints a receipt.
   public static void coins() {
      // Declare constants & variables.
      final int PERCENTAGERATE = 20; // Processing Rate
      int pennies; // Stores amount of pennies

      // Instantiate a Scanner to take keyboard input from the user.
      Scanner keyboardIn = new Scanner(System.in);

      // Prompt the user for an amount of pennies inserted
      System.out.println("How many pennies did you insert?");
      pennies = keyboardIn.nextInt(); // Stores user input into pennies
      keyboardIn.close(); // Closes the scanner object

      // Converts and outputs the dollar equivalent
      System.out.println("You have deposited $" + ((double)pennies/100) + ".");

      // Calculates and outputs the processing fee
      System.out.println("The processing fee is: $" +
         (((double)pennies/100) * ((double)PERCENTAGERATE/100)) + ".");

      // Outputs the user's receipt or actual amount earned
      System.out.print("You earned $" +
         (((double)pennies/100 * ((double)100-PERCENTAGERATE)/100) + "."));
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 45 minutes or so
 * 2. What was the hardest part of this lab?
 *    Trying to write the code without using decimals. Also trying to get
 *    a feel of how I should logically split up my program. Are there too
 *    many comments? Things like that.
 * 3. What will you always remember (never forget) from this exercise?
 *    To definitely write code one step at a time and write out pseudocode
 *    first for the calculation parts instead of winging it.
 */