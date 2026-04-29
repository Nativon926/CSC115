//3456789A123456789A123456789A123456789A123456789A123456789A123456789A123456789A
/**
 * This program prompts the user for an integer to be used as the seed for a
 * random number generator. It uses the seed to generate an uppercase letter,
 * lowercase letter, and a digit between 0 and 9. It outputs the results to
 * the console.
 *
 * @author Miranda Germain
 * @since 9/25/2022
 * @class CSC 115
 * @program RandomChars.java
 */

import java.util.Scanner;
import java.util.Random;

public class RandomChars {
   public static void main(String[] args) {
      // Call the method to create random, Prompt the user for a seed and make
      // all the random things
      makeRandoms();
   }
   
   // This method prompts the user for a seed (for the random number generator) 
   // and  then generates a random uppercase char, lowercase char, and digit 
   // char.
   public static void makeRandoms() {
      // Instantiate a Scanner object.
      Scanner keyboardIn = new Scanner(System.in);
      
      // Prompt the user for a seed and store the value in a variable.
      System.out.println("Enter a seed for the random number generator:");
      int seed = keyboardIn.nextInt();
      keyboardIn.close();
      
      // Instantiate the (singular) Random object.
      Random randomVar = new Random(seed);
      
      // Generate the program-output.
      System.out.println("RANDOM:");
      System.out.println("Uppercase = " + 
         (char)(randomVar.nextInt('Z'-'@') + 'A'));
      System.out.println("Lowercase = " + 
         (char)(randomVar.nextInt('z' - '`') + 'a'));
      System.out.println("Digit = " + 
         (char)(randomVar.nextInt('9'-'/') + '0'));
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    About and hour
 * 2. What was the hardest part of this lab?
 *    I wasn't sure if the random symbols really made my code more readable.
 *    But at least they're not integers? I also kept trying to find a way to
 *    write the character for Decimal 27 until I realized I could just subtract
 *    the characters themselves.  
 * 3. What will you always remember (never forget) from this exercise?
 *    I never really knew "magic numbers" were frowned upon. It was difficult
 *    to do this without them! It's definitely something to remember for future
 *    projects. 
 */