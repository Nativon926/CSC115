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

public class RandomCompliment_Part3 {
   public static void main(String[] args) {
      // Instantiate a Scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Salutations
      System.out.println("Welcome to the Random Complimenter.\n");;

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
      System.out.println("\nHave a great day!");

      // Close Scanner Object
      keyboardIn.close();
   }

   // This method will keep prompting the user for compliments until the
   // user enters an empty string "". It uses a Scanner object and returns
   // a String array with the appropriete size to hold all the compliments.
   public static String [] createCompArray (Scanner keyboardIn) {
      // Create an array to hold compliments set empty for time being
      String[] stringArray = new String[0];
      
      // Prompt user for first compliment
      System.out.println("Please enter compliment #1 or <ENTER> to quit " +
         "loading compliments:");
      
      // Store user input into a variable to be assigned to array during loop
      String compliment = keyboardIn.nextLine();
      
      // For loop that terminates when "" is entered  
      for(int count = 0; compliment.length() > 0; count++) {
         // Create a new string with the size increased by one
         String[] tempArray = new String[stringArray.length + 1];
        
         // Assigns elements from array to a temporary array
         for (int index = 0; index < stringArray.length; index++) {
            tempArray[index] = stringArray[index];
         }
         
         // Assign user input to the spot we created before
         tempArray[count] = compliment;
   
         // The actual array gets the temporary array's elements
         stringArray = tempArray;
        
         // Prompt user for another compliment and assign that to variable
         // The string length is added by one to account for the next iteration
         System.out.println("Please enter compliment #" + 
            (stringArray.length + 1) + " or <ENTER> to quit loading" +
            " compliments:");
         compliment = keyboardIn.nextLine();
      }
               
      // Inform the user program success and amount of compliments added
      System.out.println("\nThe " + (stringArray.length) +
         " compliment(s) have been loaded.\n");

      // Return the complete string array
      return stringArray;
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
            System.out.println(complimentArray[random.nextInt((complimentArray.length))]);
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
 *    About 6 hours so far
 * 2. What was the hardest part of this lab?
 *    I think I had a difficult time following my own logic, and spent
 *    hours running the same code thinking the problem was impossible.
 *    I was creating a new array for the wrong array and every time I
 *    would erase all the inputs. I kept thinking this should work but
 *    couldn't understand what I was doing wrong. My Arrays also always
 *    had null at the end of them and it took awhile for it to hit me that
 *    assigning the value to the element before the loop was causing the 
 *    problem and by having the intitial length of the array set to 1 was
 *    keeping it so I always had one extra space, but when I changed that
 *    I would get an error from assigning outside the loop! But I figured
 *    it out and I'm very happy with it. 
 * 3. What will you always remember (never forget) from this exercise?
 *    The rubber ducky thing where you talk out the problem definetly helps.
 *    I was venting about the impossibility of the problem when something 
 *    "clicked" and I figured out what I was stuck on. Saying/typing
 *    what you're doing step by step definitely helps smooth out the
 *    confusion.
 */