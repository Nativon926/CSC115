/**
 * This program creates an array with a user-defined length using a random
 * object with a user-defined seed. It populates the array with random integers
 * from 1 to 100 inclusive using that random object. Lastly it outputs that
 * array twice to the console.
 *
 * @author Miranda Germain
 * @since 11/22/2022
 * @class CSC 115
 * @program ArrayOutputValues.java
 */

import java.util.Scanner;
import java.util.Random;

public class ArrayOutputValues {
   public static void main(String[] args) {
      // Instantiate the Scanner object
      Scanner keyboardIn = new Scanner(System.in);

      // Method calls to get a seed from user, create a random object, then
      // create an array with random numbers using that object, and lastly
      // outputting the results twice.
      printArray(createArray(keyboardIn, createRandom(keyboardIn)));
      
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
   public static int[] createArray(Scanner keyboardIn, Random random) {
      // Prompt the user for the array length
      System.out.println("Enter the array length:");

      // Use user-defined length to declare the array
      keyboardIn.nextLine();
      int[] randomArray = new int[keyboardIn.nextInt()];

      // For loop to populate the array with random integers
      for (int index = 0; index < randomArray.length; index++) {
         randomArray[index] = (random.nextInt(100) + 1);
      }

      // Return the randomly populated array
      return randomArray;
   }

   // This method prints the results of the array created using
   // random integers twice. It uses two loops in order to do so
   public static void printArray (int[] randomArray) {
      // Print blank line for formatting
      System.out.println();

      // Print statement to explain the next steps
      System.out.println("The results (printed twice) are:");

      // Outter for loop to ensure array gets printed twice
      for (int count = 0; count < 2; count++) {
         // For loop used in order to print each element of array
         for (int index = 0; index < randomArray.length; index++) {
            System.out.print(randomArray[index] + " ");
         }

         // Print blank line for formatting
         System.out.println();
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time (in hours)was required to complete the lab?
 *    Around an hour
 * 2. What was the hardest part of this lab?
 *    I'm surprised my program even works. I felt like I was doing crazy
 *    things with Random and I was too scared to compile and test it since
 *    I didn't think it would work. I was unsure about the naming conventions
 *    and Random being a datatype. Then I was unsure if I should store the Random
 *    object anywhere but I assumed it should work like the Scanner object.
 *    All in all very cool lab.
 * 3. What will you always remember (never forget) from this exercise?
 *    I think I'm getting introduced to the idea of objects a little more.
 *    Things are slowly all coming together in my mind anyways.
 */