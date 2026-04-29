/**
 * This program uses a user-defined seed to generate a pseudo-random number
 * from 0 to 9. This number is used to select and display a particular
 * movie quote using a switch statement.
 *
 *
 * @author Miranda Germain
 * @since 10/17/2022
 * @class CSC 115
 * @program Quotes
 */

import java.util.Scanner;
import java.util.Random;

public class Quotes {
   public static void main(String[] args) {
      randomQuote();
   }

   // This method first prompts the user for a seed that is used to create
   // a Random object that generates a number 0 - 9. The number it generates
   // will be used to select and display a movie quote.
   public static void randomQuote() {
      // Declare constants
      final int TEN = 10;

      // Instantiate a Scanner to take input from the user.
      Scanner keyboardIn = new Scanner(System.in);

      // Greeting Statement
      System.out.println("This program will provide a random movie quote.");

      // Prompt the user for a seed for Random object and instantiate it
      System.out.println("\nEnter the seed for the Random object.");
      Random random = new Random(keyboardIn.nextInt());

      // Close Scanner Object
      keyboardIn.close();

      // Print statement announcing movie quote
      System.out.println("\nYour random movie quote is the following.");

      // Switch Statement to determine which quote depending on the randomly
      // generated integer
      switch(random.nextInt(TEN)) {
         case 0:
            System.out.print("\"Hasta la vista, baby.\"");
            break;
         case 1:
            System.out.print("\"Do or do not. There is no try.\"");
            break;
         case 2:
            System.out.print("\"Clever girl.\"");
            break;
         case 3:
            System.out.print("\"Frankly, my dear, I don't give a damn.\"");
            break;
         case 4:
            System.out.print("\"I'll be back.\"");
            break;
         case 5:
            System.out.print("\"Go ahead, make my day.\"");
            break;
         case 6:
            System.out.print("\"Here's looking at you, kid.\"");
            break;
         case 7:
            System.out.print("\"Toto, I've a feeling we're not in Kansas" +
               " anymore.\"");
            break;
         case 8:
            System.out.print("\"You're gonna need a bigger boat.\"");
            break;
         default:
            System.out.print("\"Get busy living, or get busy dying.\"");
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 30 minutes
 * 2. What was the hardest part of this lab?
 *    Forgot the quotation marks around each quote and general output
 *    formatting things. Plus with all the print statements I'm very
 *    worried about typos.
 * 3. What will you always remember (never forget) from this exercise?
 *    To carefully read sample outputs!
 */