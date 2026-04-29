/**
 * This program creates a histogram array with elements 0 - 9 inclusive. An RNG
 * is created with a user defined seed and random numbers are generated 0 - 9
 * a user-defined number of times, and each of those numbers are counted using
 * an Integer Array to hold the values until they can be used later to generate
 * a corresponding amount of "-"s' in a String array which represent a
 * histogram. The program uses several loops and a switch statement in order to
 * do so. Lastly it outputs the full String array to the console for the user
 * to see the results of their randomly generated numbers.
 *
 * @author Miranda Germain
 * @since 12/08/2022
 * @class CSC 115
 * @program Histogram.java
 */

import java.util.Scanner;
import java.util.Random;

public class Histogram {
   public static void main (String[] args) {
      // Constant Declaration: Maximum array size and maximum integer-value,
      // exclusive: 10.
      final int MAX = 10;

      // Instantiate a Scanner object
      Scanner keyboardIn = new Scanner(System.in);

      // Get user-defined seed.
      Random random = createRandom(keyboardIn);

      // Get input from user for the quantity of random numbers.
      int histogramQuantity = getInput(keyboardIn,
         "Enter the quantity of data in the histogram.");

      // Create the histogram.
      String[] histogramArray =
         createHistogram(random, histogramQuantity, MAX);

      // Display the histogram of the array named "histogramArray" passed in as
      // a parameter
      printArray(histogramArray);

      keyboardIn.close(); // Close the Scanner object
   }

   // This method gets input from the user for a seed to be used to instantiate
   // a random object. It returns that random object.
   public static Random createRandom(Scanner keyboardIn) {
      // Call getInput method to prompt the user for a seed
      // to be used to return a user-defined seeded RNG.
      return new Random(getInput(keyboardIn,
         "Enter the seed for the random number generator (RNG)."));
   }

   // This method gets integer input from the user. It takes a specified prompt
   // and the Scanner object as parameters. It returns a user-defined integer.
   public static int getInput(Scanner keyboardIn, String prompt) {
      // Prompt the user
      System.out.println(prompt);

      // Return the next integer input
      return keyboardIn.nextInt();
   }

  // This method creates an integer array using a random number generator,
  // and a user defined quantity of numbers to generate. It also takes
  // a constant that holds the max amount of elements in the array. The
  // method keeps track of which numbers were generated 0 - 9 inclusive
  // and adds to the corresponding element in the integer array in order
  // the keep track of number of occurences of the random number. After
  // all numbers are counted up to the specified quantity those individual
  // element counts are converted to a string array, with the equivalent
  // amount of "-"s' added to each element of the string array in order
  // to create a histogram to be outputted in a later method. This method
  // returns this populated String Array.
   public static String [] createHistogram (Random random, int quantity,
      int MAX) {
      // Create an array to hold Integer histogram in order to keep count of
      // how many duplicate numbers there are
      int[] histoInt = new int[MAX];

      // For loop that keeps iterating until a user-defined number of random
      // numbers have been generated
      for (int count = 0; count < quantity; count++) {
         // Switch statement that keeps count of duplicate numbers by adding 1
         // to the elements to of an integer array
         // create a random integer
         int randNum = random.nextInt(MAX);
         for (int i = 0; i < MAX; i++) {
            if (randNum == i) {
               histoInt[i]++;
            }
         }      
         /*switch(random.nextInt(MAX)) {
            case 0:
               histoInt[0]++;
               break;
            case 1:
               histoInt[1]++;
               break;
            case 2:
               histoInt[2]++;
               break;
            case 3:
               histoInt[3]++;
               break;
            case 4:
               histoInt[4]++;
               break;
            case 5:
               histoInt[5]++;
               break;
            case 6:
               histoInt[6]++;
               break;
            case 7:
               histoInt[7]++;
               break;
            case 8:
               histoInt[8]++;
               break;
            default:
               histoInt[9]++;*/
          // End switch
      } // End "Quantity" For loop

      // Create a new array to hold String value's in order to hold a
      // certain amount of "-" for complete histogram
      String[] histoString = new String[MAX];

      // For loop that ensures the entire array is iterated through in order
      // to populate each element
      for (int index = 0; index < MAX; index++) {
         // Give each element a value before adding to it to avoid "null"
         histoString[index] = "";

         // For loop that adds "-" to each element for as many times as
         // there were duplicate numbers.
         for (int count = 0; count < histoInt[index]; count++) {
            histoString[index] += "-";
         } // End concatenating for loop

         // Add the number of occurences to the end of each element.
         histoString[index] += (" " + histoInt[index]);
      } // End array iterator

      // Return the complete String histogram array.
      return histoString;
   }

   // This method takes an array as a parameter an uses a loop in order
   // to output each element of the array.
   public static void printArray (String[] array) {
      // Print blank line for formatting
      System.out.println();

      // For loop used in order to print each element of
      // the array
      for (int index = 0; index < array.length; index++) {
         System.out.println(index + ": " + array[index]);
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time (in hours) was required to complete the lab?
 *    2 hours
 * 2. What was the hardest part of this lab?
 *    When i first created the string array every element had "null" attached
 *    it and I wasn't sure why at first. I went through and changed all the
 *    "counter" values until I say the line where I was adding to the empty
 *    strings, and an empty string is null so that was what was going on.
 *    luckily putting an initialization for every element in the outside
 *    loop before adding to it was a simple fix! If i read the specifications
 *    carefully this could of been avoided though, but I'm happy I was able
 *    to work through it myself, and from making a mistake like this I will
 *    hopefully remember not to do so in the future.
 * 3. What will you always remember (never forget) from this exercise?
 *    As I said above, the mistake of the string array having null in it.
 *    At least now that I made that error I will recognize it in the future
 *    if it ever happens again instead of changing random values to try and
 *    pinpoint it.
 */