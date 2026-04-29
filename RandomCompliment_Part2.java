/**
 * This program outputs random compliments to the user a user-defined
 * number of times until the user inputs "0" to stop. The user inputs
 * an integer to be used as a seed for the random number generator.
 * The program uses that random object to pick from the user's specified
 * number of compliments with compliments that the user makes themselves.
 * The user will keep entering compliments at the beginning until they enter
 * an empty string "" by pressing the enter key. The array's size will 
 * adjust accordingly
 *
 * @author Miranda Germain
 * @since 12/16/2022
 * @class CSC 115
 * @program RandomCompliment_Part3.java
 */

import java.util.Scanner;
import java.util.Random;

public class RandomCompliment_Part2 {
   public static void main(String[] args) {
      // Instantiate a Scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Salutations
      System.out.println("Welcome to the Random Complimenter.");;

      // Call the method to create & populate the array of an indeterminate
      // size.
      String [] complimentArray = createCompArray(keyboardIn);

      // Call the method that creates a Random object with a user-defined seed.
      Random random = createRandom(keyboardIn, "Enter a seed for the random" +
         " number generator (RGN).");

      // Call the method that outputs the user's compliments randomly a
      // user specified number of times over and over until the user enters "0"
      display (keyboardIn, random, complimentArray);

      // Output Valedictory
      System.out.print("\nHave a great day!");

      // Close Scanner Object
      keyboardIn.close();
   }

   // This method will keep prompting the user for compliments until the
   // user enters an empty string "". It uses a Scanner object and returns
   // a String array with the appropriete size to hold all the compliments.
   public static String [] createCompArray (Scanner keyboardIn) {
      // Instantiate a String Array
      String[] tempArray = new String[100];
      String[] newArray = new String[0];
      
       // Prompt user for a compliment to add to the array before entering the
       // loop in case they want to enter no compliments
       System.out.println("Please enter compliment #1" +  
            " or <ENTER> to quit loading compliments");

      // Create variable to hold input to be used as sentinel value and
      // to be added to the array if appropriete
      String temp = keyboardIn.nextLine();

      // For loop used to populate the array until sentinel value of "" entered
      for (int index = 0; !temp.equals(""); index++) { 
         // Create new array with one more element added to hold compliments
         newArray = new String[index + 1]; // empty

         // Assign String to the temporary array
         tempArray[index] = temp;
         
         // Prompt the user for another compliment
         System.out.println("Please enter compliment #" + ((index + 1) + 1) +  
            " or <ENTER> to quit loading compliments");
         
         // Assign that compliment to temp String variable   
         temp = keyboardIn.nextLine();
      }
      
      for(int index = 0; index < newArray.length; index++) {
         newArray[index] = tempArray[index];
      }   

      // Inform the user program success and amount of compliments added
      System.out.println("\nThe " + (newArray.length) + " compliments have been loaded.\n");

      // Return the complete string array
      return newArray;
   }
   
   // This method uses the previously created array with the user's compliments
   // and outputs them at random a user-defined number of times. The method
   // keeps prompting the user for a number of compliments until the user
   // inputs "0"
   public static void display (Scanner keyboardIn, Random random,
      String[] complimentArray) {
      // Prompt the user for the amount of compliments they would like
      int total = getInput(keyboardIn, "\nHow many compliments would you like?" +
         " ('0' to quit)");

      // Outter while loop to determine if the user still wants compliments
      while (total != 0) {
         keyboardIn.nextLine(); // Move pass return key

         // Inner loop to output the compliments a user-defined number of times
         // The compliments are outputted at random
         for (int count = 1; count <= total; count++) {
            System.out.println(complimentArray[random.nextInt(complimentArray.length)]);
         }

         // Prompt the user for the amount of compliments they would like
         total = getInput(keyboardIn, "\nHow many compliments would you like? " +
         "('0' to quit)");
      } // While Loop (Outter Loop) end
   }

   // This Method gets input from the user using a specified prompt. It returns
   // the input as an integer
   public static int getInput(Scanner keyboardIn, String prompt) {
      // Use the specified prompt to prompt the user for an input
      System.out.println(prompt);

      // Return the user's input
      return keyboardIn.nextInt();
   }

   // This method gets input from the user for a seed to be used to instantiate
   // a random object. It returns that random object.
   public static Random createRandom(Scanner keyboardIn, String prompt) {
      // Call method in order to get a user-defined seed and return a random
      // object using that seed.
      return new Random(getInput(keyboardIn, prompt));
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time (in hours) was required to complete this lab?
 *    About 2 hours so far
 * 2. What was the hardest part of this lab?
 *    I'm so confused. 
 * 3. What will you always remember (never forget) from this exercise?
 *    
 */