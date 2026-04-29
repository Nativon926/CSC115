/**
 * This program uses seperate methods in order to take input from the user,
 * then one method to calculate circumference, one to calculate area, and
 * one to calculate the rounded area. The method that takes user input
 * is the only method that returns a value, and the other three methods do
 * take a value as an arguement.
 *
 * @author Miranda Germain
 * @since 10/25/2022
 * @class CSC 115
 * @program Circles03.java
 */

import java.util.Scanner;

public class Circles03 {
   public static void main(String[] args) {
      // Gets the user-defined radius and stores into variable
      double radius = getRadius();

      // Calculates the circumference of a circle
      calculateCircumference(radius);

      // Calculate the area of a circle
      calculateArea(radius);

      // Calculate the rounded area of a circle
      calculateRoundedArea(radius);
   }

   // This method prompts the user for a radius as a double then returns that
   // value
   public static double getRadius() {
      // Instantiate scanner object
      Scanner keyboardIn = new Scanner(System.in);

      // Prompt user for radius
      System.out.println("Radius:");

      // Take input from keyboard for radius then return value to main method
      return keyboardIn.nextDouble();
   }

   // This method calculates the circumference using the user-defined radius
   // declared in the getRadius() method. It prints the results to the console
   public static void calculateCircumference(double radius) {
      System.out.println("CIRCUMFERENCE = " + (Math.PI*2*radius));
   }

   // This method calculates the area of a circle using the user-defined
   // radius declared in the getRadius() method. It prints the results to
   // the console
   public static void calculateArea(double radius) {
      System.out.println("AREA = " + (Math.pow(radius,2)*Math.PI));
   }

   // This method calculates the area of a circle using the user-defined
   // radius declared in the getRadius() method then rounds that area.
   // it outputs the results to the console.
   public static void calculateRoundedArea(double radius) {
      System.out.print("ROUNDED AREA = " +
         (Math.round(Math.pow(radius,2)*Math.PI)));
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 30 minutes
 * 2. What was the hardest part of this lab?
 *    I tried putting the datatype in all the arguements of the method calls
 *    at first.
 * 3. What will you always remember (never forget) from this exercise?
 *    To compile and test my code as I go! I wrote the whole program without
 *    testing my method calls and made the mistake three times over,
 *    luckily this was a very short lab, i still should have caught the mistake
 *    sooner.
 */