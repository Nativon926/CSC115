/**
 * This program creates an array with a user-defined length using a random
 * object with a user-defined seed. It populates the array with random integers
 * from 1 to 100 inclusive using that random object. Next it creates a new
 * array with the elements of the original array reversed. It outputs
 * the results of these populated arrays at the end to the console
 *
 * @author Miranda Germain
 * @since 12/02/2022
 * @class CSC 115
 * @program ArrayBackwards.java
 */

import java.util.Scanner;
import java.util.Random;

public class ArrayBackwards {
   public static void main(String[] args) {
      // Declare Constants
      final int MAX = 100;

      // Instantiate the Scanner object
      Scanner keyboardIn = new Scanner(System.in);

      // Call method to create a Random Number Generator and assign it to
      // a variable of type Random
      Random random = createRandom(keyboardIn);

      // Instantiate the first array using the previously created RNG
      // object and using that object to populate an array with random elements
      int [] originalArray = createOriginalArray(keyboardIn,
         random, MAX);

      // Instantiate an array with a method call to reverse the order
      // or the original array.
      // int [] backwardArray = createBackwardsArray(originalArray);

      // Call method to output the elements of the original array in ascending
      // order
      printArray(originalArray, "The input array is:");

      // Call method to output the elements of the reverse array in ascending
      // order
      printArray(createBackwardsArray(originalArray), "The output array is:");

      // Close Scanner
      keyboardIn.close();
   }

   // This method gets integer input from the user. It takes a specified prompt
   // and the Scanner object as parameters
   public static int getInput(Scanner keyboardIn, String prompt) {
      System.out.println(prompt);
      return keyboardIn.nextInt();
   }

   // This method gets input from the user for a seed to be used to instantiate
   // a random object. It returns that random object.
   public static Random createRandom(Scanner keyboardIn) {
      // Call getInput method to prompt the user for a seed
      // to be used to return a user-defined seeded RNG.
      return new Random(getInput(keyboardIn, "Enter the seed: "));
   }

   // This method uses the random object created before in order to
   // populate an array of a user-defined length using random numbers
   // from 1 to 100. Once populated it returns that array.
   public static int[] createOriginalArray(Scanner keyboardIn, Random random,
      int MAX) {
      // Move pass the return key for next user int input
      keyboardIn.nextLine();

      // Call getInput in order to get user-defined length
      // for the array then instantiate an array with that
      // length
      int[] originalArray = new int[getInput(keyboardIn,
         "Enter the array length: ")];

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

      // For loop to reverse the order of the original array and
      // populate a new array with those elements in the reverse
      // order.
      for (int index = (backwardsArray.length - 1); index >= 0; index--) {
         backwardsArray[((backwardsArray.length - 1) - index)] =
            originalArray[index];
      }

      // Return the new reversed array
      return backwardsArray;
   }

   // This method takes a string that announces the array it will
   // be outputting, and takes the array that it will output
   // and uses a loop in order to do so.
   public static void printArray (int[] array, String announce) {
      // Print blank line for formatting
      System.out.println();

      // Print statement to explain the next steps
      System.out.println(announce);

      // For loop used in order to print each element of
      // the array
      for (int index = 0; index < array.length; index++) {
         System.out.print(array[index] + " ");
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time (in hours)was required to complete the lab?
 *    Around an hour
 * 2. What was the hardest part of this lab?
 *    I keep getting confused by .length of arrays being the literal
 *    number. I know it when I think about it, but when coding I get lost.
 *    Definitely something I need to study more. I spent a bit trying to
 *    figure out the math to get the lower-bound index from the length and
 *    higher-bound index. Writing it down with actual numbers helped a lot
 *    though.
 * 3. What will you always remember (never forget) from this exercise?
 *    Sometimes all the variables start to overwhelm me while coding and
 *    I forget they're just really holding numbers, and when I think of
 *    them as such the problem becomes more manageable. My brain understands
 *    9 faster than array.length. Writing it down with numbers or whatever
 *    is more understandable in the circumstances is extremely helpful for me.
 *    I think this is good to remember if I ever feel lost looking at the names
 *    trying to understand what I'm doing in the future.
 *       *Testing*
 */