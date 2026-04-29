/**
 * This program takes input from the user for the temperature in celsius
 * then it calculates what that value is in Farenheit and outputs the
 * answer to the console.
 *
 * @author Miranda Germain
 * @since 9/17/2022
 * @class CSC 115
 * @program ConvertCF
 */

import java.util.Scanner;

public class ConvertCF {
   public static void main(String[] args) {
      convert();
   }

   // Gets input from the user, convert, print.
   public static void convert() {
      // Instantiate a Scanner to take input from the user.
      Scanner in = new Scanner(System.in);

      // Prompt the user for temp in celsius
      System.out.println("Temperature:");
      double temp = in.nextDouble(); //Store the user-input into a variable.

      //Calculate the convertion and print the output.
      System.out.print("In Fahrenheit, the temperature is " +
         (temp*9/5 + 32) +"!");
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Maybe 20 minutes
 * 2. What was the hardest part of this lab?
 *    It took me a moment to realize that (9/5) was the problem I was having
 *    when the math was coming out wrong. I kept thinking that the math was
 *    correct until i remembered how integer division worked.
 * 3. What will you always remember (never forget) from this exercise?
 *    Just to remember how integer division works, and that the answer will be
 *    truncated.
 */