/**
 * This program uses a random number generator with a user-defined seed to
 * simulate a coin toss. 0 is used for heads, and 1 is used for tails. Then
 * user guesses the status of the toss for each toss. The program first  
 * determines what the toss actually was (heads or tails) then compares the
 * user's guess with the toss. The program outputs whether the user was 
 * right or wrong, then keeps a tally of correct guesses. This is repeated 5
 * times and at the end the program calculates a percentage of correct guesses
 * for the user to see.
 *
 * @author Miranda Germain
 * @since 10/6/2022
 * @class CSC 115
 * @program CoinToss.java
 */

import java.util.Scanner;
import java.util.Random;

public class CoinToss {
   public static void main(String[] args) {
      cointoss();
   }

   // In this method, the computer simulates flipping a coin and the user
   // guesses the result; the computer will report the status of each guess
   // after eachcoin toss and the tabulate the cumulative results after 5
   // coin tosses. Note: The computer will use 0 to represent "heads" and 1
   // to represent "tails" for each coin toss.
   public static void cointoss() {
      // Declare constants & variables
      int HEADS = 0;
      int correctGuesses = 0;

      // Instantiate the scanner to take input from the keyboard
      Scanner in = new Scanner(System.in);

      // Introductory Statement
      System.out.println("This program will repeatedly prompt the user for a " +
         "guess to a coin toss.\nNote: " + HEADS + " is heads and 1 is " +
         "tails.\n");

      // Prompt the user for an integer to use as a seed and stores that into a
      // variable
      System.out.println("Enter the seed for the Random object.\n");
      int seed = in.nextInt();
      in.nextLine(); // moves pointer pass return key

      // Instantiate the Random object.
      Random random = new Random(seed);

      // Prompt user for guess #1 then compares that to a random number
      System.out.println("What is your guess for trial #1?");
      int guess = in.nextInt();
      in.nextLine();
      int toss = random.nextInt(2);
      System.out.println ("The coin toss was a " + toss + ".");
      if (guess == toss) {
         System.out.println("You guessed right!\n");
         correctGuesses+=1;
      } else {
         System.out.println("Sorry, try again next time!\n");
      }

      // Prompt user for guess #2 then compares that to a random number
      System.out.println("What is your guess for trial #2?");
      guess = in.nextInt();
      in.nextLine();
      toss = random.nextInt(2);
      System.out.println ("The coin toss was a " + toss + ".");
      }
      if (guess == toss) {
         System.out.println("You guessed right!\n");
         correctGuesses+=1;
      } else {
         System.out.println("Sorry, try again next time!\n");
      }

      // Prompt user for guess #3 then compares that to a random number
      System.out.println("What is your guess for trial #3?");
      guess = in.nextInt();
      in.nextLine();
      toss = random.nextInt(2);
      System.out.println ("The coin toss was a " + toss + ".");
      if (guess == toss) {
         System.out.println("You guessed right!\n");
         correctGuesses+=1;
      } else {
         System.out.println("Sorry, try again next time!\n");
      }

      // Prompt user for guess #4 then compares that to a random number
      System.out.println("What is your guess for trial #4?");
      guess = in.nextInt();
      in.nextLine();
      toss = random.nextInt(2);
      System.out.println ("The coin toss was a " + toss + ".");
      if (guess == toss) {
         System.out.println("You guessed right!\n");
         correctGuesses+=1;
      } else {
         System.out.println("Sorry, try again next time!\n");
      }

      // Prompt user for guess #5 then compares that to a random number
      System.out.println("What is your guess for trial #5?");
      guess = in.nextInt();
      toss = random.nextInt(2);
      System.out.println ("The coin toss was a " + toss + ".");
      if (guess == toss) {
         System.out.println("You guessed right!\n");
         correctGuesses+=1;
      } else {
         System.out.println("Sorry, try again next time!\n");
      }

      // Calculate percent of corrent guesses and output results
      System.out.print("You guessed correctly " + correctGuesses +
         " out of 5 times (" + (int)(((double)correctGuesses / 5) * 100) +
         "%).");
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 2 hours
 * 2. What was the hardest part of this lab?
 *    I ended up doing a lot of weird things with this lab. It also 
 *    took me a while to realize I had a in.nextLine() where I didn't
 *    need it in the last  toss.
 * 3. What will you always remember (never forget) from this exercise?
 *    How dangerous copy and pasting my code can be! If I was retyping I 
 *    would't have had that last in.nextLine() or I would have caught it 
 *    faster anyways. Also to remember to be careful about unecessary
 *    variables and that I can just reassign them instead if they're 
 *    only being used once.
 */