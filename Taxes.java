/**
 * This program uses different methods to take input from the user for
 * a yearly income, determine a tax bracket, calculate the federal taxes
 * they will have to pay, then outputs the results to the screen.
 *
 * @author Miranda Germain
 * @since 10/28/2022
 * @class CSC 115
 * @program Taxes.java
 */

import java.util.Scanner;

public class Taxes {
   public static void main(String[] args) {
      //Declare the Scanner object.
      Scanner keyboardIn = new Scanner(System.in);

      // Call method is take input for yearly income
      double income = getInput(keyboardIn);

      // Close Scanner Object
      keyboardIn.close();

      // Call method to determine tax bracket
      outputResults(determineBracket(income), calculateTaxes(income));
   }

   // This method uses the scanner object to get the yearly income from
   // the user, it then returns that income.
   public static double getInput(Scanner keyboardIn) {
      // Prompt user for yearly income
      System.out.println("Enter your yearly income:");

      // Return yearly income
      return keyboardIn.nextDouble();
   }

   // This method uses the yearly income to determine the user's income
   // bracket then returns that bracket as an integer 1-3.
   public static int determineBracket(double income) {
      if (income >= 100000) {
         return 3;
      } else if (income >= 50000) {
         return 2;
      } else {
         return 1;
      }
   }

   // This method calculate the federal taxes owed using the the user-defined
   // yearly income. It returns the calculated value for the federal taxes
   public static double calculateTaxes(double income) {
      return (Math.round((income * .15)*100))/100.0;
   }

   // Prints the results of the income bracket and federal tax amount to
   // the console that were calculated in previous methods
   public static void outputResults(int bracket, double taxes) {
      System.out.println("\nIncome Bracket " + bracket +
         "\nYou owe $" + taxes + " in Federal taxes.");
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    About an hour
 * 2. What was the hardest part of this lab?
 *    I'm really struggling with not having a variable in the main method since
 *    I need to use the income in multiple methods. I thought I could probably
 *    determine the bracket using the taxes but then I would need to store the
 *    taxes anyways for the output method which would be the same issue I had
 *    before. Also, I closed the scanner in the main method since I returned
 *    then input but I guess I could store the input into a variable, close
 *    then scanner, then return the variable but I didn't want to have too many
 *    unecessary variables.
 * 3. What will you always remember (never forget) from this exercise?
 *    I think it's cool that you can pass scanners to methods, I think of
 *    Scanners as magic mumbo jumbo, but I'm sure this concept will be
 *    important in the future.
 */