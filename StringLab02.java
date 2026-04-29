/**
 * This program prompts the user for a phrase then outputs a menu
 * of options for the user to select from. Each selection performs
 * a different type of string manipulation and some selections
 * prompt the user further.
 *
 * @author Miranda Germain
 * @since 10/21/2022
 * @class CSC 115
 * @program StringLab02.java
 */

import java.util.Scanner;

public class StringLab02 {
   public static void main (String[] args) {
      stringManipulation();
   }

   // This method prompts the user for a phrase then outputs a menu to the
   // console for the user to choose from. The user inputs a selection
   // from the menu then the program runs different string manipulations
   // depending on the selection. Some selections have more prompts for
   // the user as well.
   public static void stringManipulation() {
      // Declare variables
      int selection;
      int index;
      String phrase = "";
      String phrase2 = "";

      // Instantiate a scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Prompt user for a phrase and store it into a variable
      System.out.println("Please enter a phrase:");
      phrase = keyboardIn.nextLine();

      // Output Menu to console
      System.out.println("\n1. Find the length of the string\n" +
         "2. Perform charAt\n3. Perform equals\n4. Perform compareTo\n" +
         "5. Perform indexOf\n6. Perform substring\n7. Perform toLowerCase\n" +
         "8. Perform toUpperCase\n");

      // Prompt user for a menu selection
      System.out.println("Please make a selection:\n");
      selection = keyboardIn.nextInt();

      // If statements to determine which String method to perform
      if (selection == 1) {
         // Determine length of phrase
         System.out.print("The length of the phrase is " + phrase.length());
      } else if (selection == 2) {
         // Find character at a specific index of phrase
         System.out.println("Enter a number between 0 and " +
            (phrase.length() - 1) + ":\n");
         keyboardIn.nextLine();
         index = keyboardIn.nextInt();
         System.out.print("The character at index " + index + " is '" +
            phrase.charAt(index) + "'");
      } else if (selection == 3) {
         // Compare one phrase to another
         System.out.println("Enter a phrase that will be compared with \"" +
            phrase + "\":\n");
         keyboardIn.nextLine();
         if (phrase.equals(keyboardIn.nextLine())) {
            System.out.print("The two phrases DO have the same sequence of " +
               "characters.");
         } else {
            System.out.print("The two phrases DO NOT have the same sequence " +
               "of characters.");
         }
      } else if (selection == 4) {
         // Determine which phrase comes first alphabetically
         System.out.println("Enter a phrase that will be compared with \"" +
            phrase + "\":\n");
         keyboardIn.nextLine();
         phrase2 = keyboardIn.nextLine();
         if (phrase.compareTo(phrase2) == 0) {
            System.out.print("The two phrases are equivalent.");
         } else if (phrase.compareTo(phrase2) < 0) {
            System.out.print("Alphabetically, \"" + phrase + "\" comes " +
               "before \"" + phrase2 + "\"");
         } else {
            System.out.print("Alphabetically, \"" + phrase + "\" comes " +
               "after \"" + phrase2 + "\"");
         }
      } else if (selection == 5) {
         // Find a phrase within the phrase
         System.out.println("Enter a String to search \"" + phrase +
            "\" for:\n");
         keyboardIn.nextLine();
         phrase2 = keyboardIn.nextLine();
         if (phrase.indexOf(phrase2) == -1) {
            System.out.print("\"" + phrase2 + "\" is not in the phrase \"" +
               phrase + "\"");
         } else {
            System.out.print("The first occurrence of \"" + phrase2 +
               "\" is at index " + phrase.indexOf(phrase2));
         }
      } else if (selection == 6) {
         // Uses substring to shorten phrase as desired
         System.out.println("Choose one of the methods:\n1. Create a " +
            "substring from a selected index until the end\n2. " +
            "Create a substring from a selected index until another " +
            "selected index\n\nEnter selection:\n");
         keyboardIn.nextLine();
         selection = keyboardIn.nextInt();
         System.out.println("Which index (between 0 and " +
            (phrase.length() - 1) + ") would you like to start with?\n");
         keyboardIn.nextLine();
         index = keyboardIn.nextInt();
         if (selection == 1){
            System.out.print("The new phrase is: \"" +
               phrase.substring(index) + "\"");
         } else if (selection == 2){
            System.out.println("Which index (between " + index + " and " +
               (phrase.length() - 1) + ") would you like to end with?\n");
            keyboardIn.nextLine();
            System.out.print("The new phrase is: \"" +
               phrase.substring(index, keyboardIn.nextInt()) + "\"");
         } else {
         // Catches invalid inputs
            System.out.print("Not a valid number!");
         }
      } else if (selection == 7) {
         // Converts all letters in phrase to lowercase
         System.out.print("All lowercase looks like this: \"" +
            phrase.toLowerCase() + "\"");
      } else if (selection == 8) {
         // Converts all letters in phrase to uppercase
         System.out.print("All uppercase looks like this: \"" +
            phrase.toUpperCase() + "\"");
      } else {
         // Catches invalid inputs
         System.out.print("Not a valid number!");
      }

      // Close scanner object
      keyboardIn.close();
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 2 and a half hours
 * 2. What was the hardest part of this lab?
 *    I wasn't quite sure how compareTo() worked but the book was a big help.
 *    Also I was trying to be very very careful with not using too many
 *    variables. Plus .length() being the actual length got me mixed up
 *    a couple times. Keeping track of where to put my nextLine()'s was
 *    difficult too.
 * 3. What will you always remember (never forget) from this exercise?
 *    I think this was really good practice with classes, and reading APIs. I
 *    feel more comfortable with them now.
 */