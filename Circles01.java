/**
 * This program takes input from the user for a radius value
 * then calculates what the area of a circle is using that
 * radius. The program then outputs that area.
 *
 * @author Miranda Germain
 * @since 9/13/2022
 * CSC 115
 */

import java.util.Scanner;

public class Circles01 {
   public static void main(String[] args) {
      circleArea();
   }

   public static void circleArea() {
      //Instantiate a Scanner to take input from the user.
      Scanner scanner = new Scanner(System.in);

      //Prompt the user for a radius
      System.out.println("Radius: \n");
      double radius = scanner.nextDouble();
      scanner.close();

      //Compute and print the area of the circle
      System.out.print("AREA = " + (3.14*radius*radius));
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this assignment?
 *    About 15 minutes or so.
 * 2. What was the hardest part of this lab?
 *    Trying to get my outputs to match. At first I mixed up the sample output
 *    thinking I needed to print the radius back to the user. Plus the
 *    formatting needed a bit of fixing.
 * 3. What will you always remember (never forget) from this exercise?
 *    For some reason I thought the character/column count on the IDE
 *    started at zero so I spent far too much time wondering why my
 *    indents started at col 4 then went to col 7, but now realize they
 *    were both at 3 spaces. I also learned that the highlighted yellow
 *    text on the sample output is an input.
 */