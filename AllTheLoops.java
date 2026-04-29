/**
 * This program uses a for loop to print values between two user defined
 * integers using the user-defined incrementor. It also uses a while loop
 * to continously print a random number until the user would like to stop.
 * Lastly it uses a do-while loop to prompt the user for numbers that are
 * used to find an average, the user stops the loop by entering '0'.
 *
 * @author Miranda Germain
 * @since 11/07/2022
 * @class CSC 115
 * @program AllTheLoops.java
 */

import java.util.Scanner;
import java.util.Random;

public class AllTheLoops {
   public static void main(String[] args) {
      // Instantiate the Scanner to take input from the keyboard
      Scanner keyboardIn = new Scanner (System.in);

      // Call the method to perform for loop.
      forLoop(keyboardIn);

      // Call the method to perform While Loop
      whileLoop(keyboardIn);

      // Call the methid to perform do while loop
      doWhileLoop(keyboardIn);

      // Close the Scanner
      keyboardIn.close();
   }

   // This method takes the Scanner as a parameter. This method prompts the
   // user for an initial & ending integer, and an incrementor. It uses these
   // integers for a for loop. The loop prints the numbers between the user's
   // intial and ending integer values using the incrementor between each
   // number.
   public static void forLoop (Scanner keyboardIn) {
      // Print message stating purpose
      System.out.println("FOR LOOP");

      // Prompt the user for intial/ending/and incrementor values
      // and store them into a variable for the for loop.
      System.out.println("Please enter a starting point for your for loop:");
      int start = keyboardIn.nextInt();
      keyboardIn.nextLine();
      System.out.println("Please enter an ending point for your for loop:");
      int end = keyboardIn.nextInt();
      keyboardIn.nextLine();
      System.out.println("What value would you like the for loop to go up by?");
      int incrementor = keyboardIn.nextInt();

      // Print message announcing the results
      System.out.println("\nYour numbers:");

      // The loop used to print the numbers inbetween
      for (int num = start ; num <= end; num += incrementor) {
         System.out.println(num);
      }

      // Move pass return key for next method
      keyboardIn.nextLine();
   }

   // This method prompts the user for an integer that will be used to seed
   // a random number generator. The while loop outputs a random number between
   // 1 & 50 during each iteration. It will keep prompting the user for if
   // they'd like another random number until the user enters a sentinel value
   // "stop".
   public static void whileLoop (Scanner keyboardIn) {
      // Print message stating purpose
      System.out.println("\n\nWHILE LOOP");

      // Prompt the user for a seed and use that seed to instantiate the random
      // object.
      System.out.println("Please enter a seed for the random number"
         + " generator:");
      Random random = new Random(keyboardIn.nextInt());

      // Move pass return key
      keyboardIn.nextLine();

      // Print blank line for formatting
      System.out.print("\n");

      // Declare sentinel value
      String decision = "";

      // The while loop to print the random number until the user enters
      // "stop" when prompted if they'd like another random number
      while (!decision.equalsIgnoreCase("stop")) {
         // Print the user's random number
         System.out.println("Here's your random number: " +
            ( 1 + random.nextInt(50)));

         // Prompt the user for whether or not they'd like another random
         // number
         System.out.println("Would you like another number? Enter 'stop' to " +
            "stop.");

         // Store user's input into decision
         decision = keyboardIn.nextLine();
      }
   }

   // This method uses a do while loop to prompt the user for a number.
   // It will keep prompting until the user enters zero. Once done,
   // it finds the average of all the numbers the user enters besides
   // the zero.
   public static void doWhileLoop(Scanner keyboardIn) {
      // Declare variables
      int num = 0; // holds the user's number
      int total = 0; // holds the total of all user's numbers
      int count = 0; // keeps track of count

      // Print a statement announcing purpose
      System.out.println("\n\nDO-WHILE LOOP");

      // The do while loop used to take positive integers from the user
      do {
         // Prompt the user for a number
         System.out.println("Enter a number (0 to stop and print average):");

         num = keyboardIn.nextInt(); // Store user input into num

         // Move pass return key only if num isn't 0 for codegrade
         if ( num != 0) {
            keyboardIn.nextLine();
         }

         total += num; // Add num to a total

         count ++; // Add one to the count to keep track of numbers entered
      } while (num != 0);

      // Output the average of the entered numbers
      System.out.print("The average of your numbers is: " +
         ((double)total / (count - 1)));
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around an hour
 * 2. What was the hardest part of this lab?
 *    I'm not great with Random objects yet. At first I wrote
 *    random.nextInt(51) forgetting that the range would be 0 - 51
 *    instead which wouldn't return the correct values. Also, I keep
 *    wanting to use breaks with sentinel values are involved but I keep
 *    remembering what the book said about them being frowned upon so
 *    I redo the code without them instead of taking the easy way out.
 * 3. What will you always remember (never forget) from this exercise?
 *    I accidentally created an infinite loop for the for loop by entering
 *    0 as the incrementor. We haven't done much with invalid inputs in this
 *    class, but how the user can "break the program" is probably important
 *    to remember. Also, that there's probably always a better way to code
 *    something if I put the thought into it.
 */