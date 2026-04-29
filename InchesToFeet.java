/**
 * This program takes input from the user for Inches then
 * converts that into feet and outputs it back to the user.
 *
 * @author Miranda Germain
 * @since 9/14/22
 * CSC 115
 * InchesToFeet.Java
 */

import java.util.Scanner;

public class InchesToFeet {
   public static void main(String[] args) {
      convert();      
   }
   
   public static void convert() {
      // Instantiate a Scanner to take input from the user.
      Scanner scanner = new Scanner(System.in);
      
      // Prompt the user and then store their input in 'totalInches'
      System.out.println("Enter the number of inches:");
      int totalInches = scanner.nextInt();
      scanner.close(); //Close the scanner object.

      // Convert to feet and inches. 
      System.out.print("\n"+ totalInches + " inches is " + (totalInches / 12) +
         " feet, and " + (totalInches % 12) + " inches");      
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this assignment?
 *    About 15 minutes
 * 2. What was the hardest part of this lab?
 *    Probably the spacing within the print statement
 * 3. What will you always remember (never forget) from this exercise?
 *    I never really realized how often modulus was used in the real world.
 */