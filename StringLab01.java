/**
 * This program takes user input for a phrase and a character from that phrase
 * and finds the length of the phrase, its' first and last character, and the
 * position of the user defined character.
 *
 * @author Miranda Germain
 * @since 9/30/2022
 * @class CSC 115
 * @program StringLab01
 */

import java.util.Scanner;

public class StringLab01 {
    public static void main (String[] args) {
      stringLab();
    }

    //This method will prompt the user for text and a character; subsequently,
    //this method will print the results of the following String operations on
    //the user-defined String:
    //1) get the String length,
    //2) get the first character, and
    //3) get the first position of a user defined character.
    public static void stringLab() {
      // Instantiate a Scanner to take input from the user.
      Scanner keyboardIn = new Scanner(System.in);

      // Prompt user for a phrase and character
      System.out.println("Please enter a phrase:");
      String phrase = keyboardIn.nextLine();
      System.out.println("Please enter a character to search for:");
      char phraseChar = keyboardIn.nextLine().charAt(0);
      keyboardIn.close();

      // Performs string operations
      System.out.println("The length of your String is " + phrase.length() +
         ".");
      System.out.println("The character in the first position is '" +
         phrase.charAt(0) + "'.");
      System.out.println("The character in the last position is '" +
         phrase.charAt(phrase.length() - 1) + "'.");
      System.out.print("The first occurrence of '" + phraseChar +
         "' is in position " + (phrase.indexOf(phraseChar) + 1) + ".");
    }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    About 30 minutes
 * 2. What was the hardest part of this lab?
 *    I kept making loads of syntax errors, which is probably to be expected
 *    since a lot of typing was recquired. Plus dealing with strings being
 *    zero-indexed was confusing in parts.
 * 3. What will you always remember (never forget) from this exercise?
 *    To take my time writing and verifying that I've typed what I meant to
 *    type. And how important it is to be more familiar with the index numbers.
 */