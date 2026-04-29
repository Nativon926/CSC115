/**
 * This program gives a random compliment if the user would like.
 * They can decline by entering (0) or agree by entering (1). It then prompts
 * the user for a seed if they'd like a compliment, it gives a specific
 * valediction otherwise. The program uses the seeded random object to give
 * one of two compliments at random then gives a specific valediction
 * for the confirmation path when it is done complimenting.
 *
 * @author Miranda Germain
 * @since 10/08/2022
 * @class CSC 115
 * @program Compliment02.java
 */

import java.util.Scanner;
import java.util.Random;

public class Compliment02 {
   public static void main (String[] args) {
      compliment02();
    }

    // This method prompts the user for
    // 1) a number that corresponds with the user's desire to receive a
    // compliment (1) or not (0) and
    // 2) a seed (only if a compliment is required) and  outputs a compliment
    // (if necessary) and a valediction (farewell message).
   public static void compliment02() {
      // Instantiate a scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Greeting statement
      System.out.println("This program will provide a random compliment.\n");

      // Ask the user if they'd like a compliment
      System.out.println("Would you like a compliment" +
         " (\"1\" for YES, \"0\" for NO)?");
      int confirmation = keyboardIn.nextInt();

      // Determine whether a compliment was wanted then proceed accordingly
      if (confirmation != 1) {
         // Valediction statement for if no compliment given
         System.out.print("Come on back if you want a compliment.");
      } else {
         // Prompt user for a seed and instantiate random object
         System.out.println("Enter the seed for the Random object.");
         int seed = keyboardIn.nextInt();
         Random random = new Random(seed);

         // Give user a random compliment
         if(random.nextInt(2) == 0) {
            System.out.println("You are soooooooo good looking.");
         } else {
            System.out.println("You are an amazing programmer.");
         }

         // Valediction Statement for if a compliment was given
         System.out.print("Come on back if you want another compliment.");
      }
      
      // Close scanner object
      keyboardIn.close(); 
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    About an hour
 * 2. What was the hardest part of this lab?
 *    I am really unsure about the formatting. Whether or not it's okay to
 *    chunk code within an if statement, but without the comments it looks
 *    really ugly & confusing so I think this is ok. Another difficulty
 *    was finding a place for the seed prompt since if they didn't want
 *    a compliment then they didn't need to be prompted for a seed.
 * 3. What will you always remember (never forget) from this exercise?
 *    To plan where prompts and what not should go so my program doesn't
 *    run when it's not supposed to.
 */