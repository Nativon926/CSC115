/**
 * This program creates an array with a user-defined length using a random
 * object with a user-defined seed. It populates the array with random integers
 * from 1 to 100 inclusive using that random object. Next it creates a new
 * array with the elements of the original array shifted one index to the
 * left with the first original element wrapped around to the end of the
 * new array.
 *
 * @author Miranda Germain
 * @since 12/02/2022
 * @class CSC 115
 * @program ArrayShiftLeft.java
 */

import java.util.Scanner;
import java.util.Random;

public class ArrayShiftLeft {
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
      int [] leftArray = leftArray(originalArray);

      // Call method to output the elements of the original array in ascending
      // order
      printArray(originalArray, "The input array is:");

      // Call method to output the elements of the shifted left array in
      // ascending order
      printArray(leftArray, "The output array is:");

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
      return new Random(getInput(keyboardIn, "Enter the seed:"));
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
         "Enter the array length:")];

      // For loop to populate the array with random integers
      for (int index = 0; index < originalArray.length; index++) {
         originalArray[index] = (random.nextInt(MAX) + 1);
      }

      // Return the randomly populated array
      return originalArray;
   }

   // This method takes the original array as a parameter and
   // creates a new array with all the elements shifted left, the first
   // element of the original gets wrapped around to the end of the new array.
   public static int[] leftArray(int[] originalArray) {
      // Declare new backwards array
      int[] leftArray = new int[originalArray.length];

      // For loop to shift the individual elements one index to the left
      // not inclusive of the first element
      for (int index = 0; index < (leftArray.length - 1); index++) {
         leftArray[index] = originalArray[index + 1];
      }
      
      // Wrap first element of original array to last element of 
      // shifted left array
      leftArray[leftArray.length - 1] = originalArray[0];

      // Return the new shifted left array
      return leftArray;
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
 *    Maybe 1/2 an hour
 * 2. What was the hardest part of this lab?
 *    It took a moment to think about how to wrap the first element
 *    to the last element and what I wrote felt too simple. At first 
 *    glance the problem seemed bigger than what it was.
 * 3. What will you always remember (never forget) from this exercise?
 *    As always take it a step at a time, and simple doesn't necessarily
 *    mean wrong. I'm always worried I'm doing crazy things coding
 *    when they really are the expected solutions. 
 */