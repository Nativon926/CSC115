/**
 * This program prompts thhe user for an integer grade then uses a switch
 * statement to assign a letter grade to that integer. It outputs the results
 * to the console.
 *
 * @author Miranda Germain
 * @since 10/14/2022
 * @class CSC 115
 * @program GradeCat.java
 */

import java.util.Scanner;

public class GradeCat {
   public static void main (String[] args) {
      catSwitch();
    }

   //  This method prompts the user for an integer then uses a switch
   //  statement to assign a letter grade based on that number
   public static void catSwitch() {
      // Instantiate the scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Prompt user for a grade as an integer
      System.out.println("Enter a grade (0-100):");

      // Switch Statement to assign letter grade
      switch (keyboardIn.nextInt()) {
         case 100: case 99: case 98: case 97: case 96: case 95: case 94:
         case 93: case 92: case 91: case 90:
            System.out.print('A');
            break;
         case 89: case 88: case 87: case 86: case 85: case 84: case 83:
         case 82: case 81: case 80:
            System.out.print('B');
            break;
         case 79: case 78: case 77: case 76: case 75: case 74: case 73:
         case 72: case 71: case 70:
            System.out.print('C');
            break;
         case 69: case 68: case 67: case 66: case 65:
            System.out.print('D');
            break;
         default:
            System.out.print('F');
      }
      
      // Close the Scanner
      keyboardIn.close();
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    20 minutes
 * 2. What was the hardest part of this lab?
 *    I kept forgetting the breaks at first.
 * 3. What will you always remember (never forget) from this exercise?
 *    I've never really used switch statements for ranges before. It's pretty
 *    neat that it's doable if the need ever arises. Also I didn't realize
 *    I could use the input as an arguement itself without having to 
 *    assign it to a variable until I read the hint about eliminating variables
 *    that were used only once. That's really cool and makes sense. 
 */