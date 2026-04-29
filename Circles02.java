/**
 * This program calculates the cirumference, area, and rounded area using an
 * user-defined radius. The program uses methods & constants from the Math
 * class in order to calculate the values.
 *
 * @author Miranda Germain
 * @since 09/20/2022
 * @class CSC 115
 * @program Circles02
 */

import java.util.Scanner;

public class Circles02 {
   public static void main(String[] args) {
      circleMath(); // Get input, compute, and output.
   }

   // This method asks for a radius, calculates the circumference and area,
   // and prints the program results.
   public static void circleMath() {
      // Instantiate a new Scanner.
      Scanner sc = new Scanner(System.in);

      // Prompt the user for a number.
      System.out.println("Radius:");

      // Store the input from the user in 'radius'.
      double radius = sc.nextDouble();
      sc.close(); // Close the scanner.

      // Output the program results.
      System.out.println("CIRCUMFERENCE = " + (Math.PI*2*radius));
      System.out.println("AREA = " + (Math.pow(radius,2)*Math.PI));
      System.out.print("ROUNDED AREA = " +
         (Math.round(Math.pow(radius,2)*Math.PI)));
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 15 minutes
 * 2. What was the hardest part of this lab?
 *    Keeping track of all the parenthesis, especially in the ROUNDED
 *    AREA print statement.
 * 3. What will you always remember (never forget) from this exercise?
 *    That we can use a method within the parameters of a different method.
*/