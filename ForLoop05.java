/**
 * This program prompts the user for a phrase then uses a for loop to add
 * spaces between each letter of the phrase. It outputs the results of this
 * to the console.
 *
 * @author Miranda Germain
 * @since 11/06/2022
 * @class CSC 115
 * @program ForLoop05.java
 */

import java.util.Scanner;

public class ForLoop05 {
   public static void main(String[] args) {
      // Instantiate the scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Call Methods to get the input, space the letters, and output the
      // results
      outputResults(spaceLetters(getInput(keyboardIn)));

      // Close Scanner object
      keyboardIn.close();
   }

   // This method prompts the user for a phrase and returns the user's input
   // as a String. This method uses the scanner object created in main method
   public static String getInput(Scanner keyboardIn) {
      // Prompt the user for a phrase
      System.out.println("phrase:");

      // Return the user-defined phrase
      return keyboardIn.nextLine();
   }

   // This method takes the user-defined phrase and adds spaces between all
   // the letters of the phrase using a for loop. It returns the new spaced
   // out phrase as a string
   public static String spaceLetters (String phrase) {
      // Declare variable to hold new spaced phrase
      String spacedPhrase = "";

      // For loop to add spaces inbetween each letter
      for(int index = 0; index < phrase.length(); index++) {
         spacedPhrase += phrase.substring(index, (index + 1)) +
            " ";
      }

      // Return spaced out phrase
      return spacedPhrase;
   }

   // This method outputs the results of the spaceLetters method to the console
   public static void outputResults (String newPhrase) {
      System.out.print("\n" + newPhrase);
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    At least 40 minutes
 * 2. What was the hardest part of this lab?
 *    When i first wrote the for loop i wrote "spacedPhrase =" instead of
 *    "+=" and when I ran the program I used test, the output I got was "t"
 *    so I thought my program was stopping at the first iteration. It took
 *    me a while to realize my for loop was iterating through, I was just
 *    assigning the letters to spacedPhrase over and over.
 * 3. What will you always remember (never forget) from this exercise?
 *    To change up what I write for testing my code. Luckily I tried
 *    "testing" afterwards and realized I got a "g" instead then found
 *    the logic error. Also to read my code line by line extremely carefully
 *    I was staring at my for loop thinking there was nothing wrong with
 *    what I was trying for far too long instead of looking at the body.
 */