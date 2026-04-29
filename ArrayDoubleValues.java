/**
 * This program creates an array with a user-defined length using a random
 * object with a user-defined seed. It populates the array with random integers
 * from 1 to 100 inclusive using that random object. Next it creates a new
 * array with every element doubled. Lastly it outputs the original array and
 * the doubled array to the console twice.
 *
 * @author Miranda Germain
 * @since 11/29/2022
 * @class CSC 115
 * @program ArrayDoubleValues.java
 */

import java.util.Scanner;
import java.util.Random;

public class ArrayDoubleValues {
   public static void main(String[] args) {
      // Declare Constants
      final int MAX = 100;

      // Instantiate the Scanner object
      Scanner keyboardIn = new Scanner(System.in);

      // Instantiate the first array using method calls to create a random
      // object and using that object to populate an array with random elements
      int [] originalArray = createOriginalArray(keyboardIn,
         createRandom(keyboardIn), MAX);

      // Instantiate an array with a method call to double each element
      // of the original array
      int [] backwardArray = createBackwardsArray(originalArray);

      // Call method to output results twice with blank line printed for formatting
      printArrays(originalArray, backwardArray);
      System.out.println();
      printArrays(originalArray, backwardArray);

      // Close Scanner
      keyboardIn.close();
   }

   // This method gets input from the user for a seed to be used to instantiate
   // a random object. It returns that random object.
   public static Random createRandom(Scanner keyboardIn) {
      // Prompt user for a seed
      System.out.println("Enter the seed:");

      // Return random object with user-defined seed
      return new Random(keyboardIn.nextInt());
   }

   // This method uses the random object created before in order to
   // populate an array of a user-defined length using random numbers
   // from 1 to 100. Once populated it returns that array.
   public static int[] createOriginalArray(Scanner keyboardIn, Random random,
      int MAX) {
      // Prompt the user for the array length
      System.out.println("Enter the array length:");

      // Use user-defined length to declare the array
      keyboardIn.nextLine();
      int[] originalArray = new int[keyboardIn.nextInt()];

      // For loop to populate the array with random integers
      for (int index = 0; index < originalArray.length; index++) {
         originalArray[index] = (random.nextInt(MAX) + 1);
      }

      // Return the randomly populated array
      return originalArray;
   }

   // This method takes the original array as a parameter and 
   // creates a new array with the original array's elements
   // in reverse order
   public static int[] createBackwardsArray(int[] originalArray) {
      // Declare new backwards array
      int[] backwardsArray = new int[originalArray.length];

      // For loop to double original array's elements and use
      // those elements to populate a new array
      for (int index = (backwardsArray.length - 1); index >= 0; index--) {
         backwardsArray[((backwardsArray.length - 1) - index)] = originalArray[index];
      }

      // Return the new doubled array
      return backwardsArray;
   }

   // This method prints the results of the array created using
   // random integers and that array doubled twice
   public static void printArrays (int[] originalArray, int[] doubleArray) {
      // Print blank line for formatting
      System.out.println();

      // Print statement to explain the next steps
      System.out.println("The input array is:");

      // For loop used in order to print each element of
      // original array
      for (int index = 0; index < originalArray.length; index++) {
         System.out.print(originalArray[index] + " ");
      }

      // Print statement to announce output array results
      System.out.println("\nand the output array is");

      // For loop used to print each element of doubled array
      for (int index = 0; index < doubleArray.length; index++) {
         System.out.print(doubleArray[index] + " ");
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time (in hours)was required to complete the lab?
 *    Around an hour
 * 2. What was the hardest part of this lab?
 *    I spent too long trying not to instantiate the arrays in main before
 *    actually reading the directions. I definitely wasn't thinking the
 *    entire program through doing this either, since I'd have to make
 *    the output call twice. Definitely need to slow down and think/read
 *    before jumping in.
 * 3. What will you always remember (never forget) from this exercise?
 *    As I said above, slow down and think. I love coding and trying new
 *    things but there are helpful specifications for me to follow instead
 *    of blindly writing things.
 */