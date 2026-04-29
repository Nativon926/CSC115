/**
 * This program helps the user by generating a stronger password for them.
 * It prompts the user for a menu selection for a regularly or super modified
 * password then prompts the user for their password to be modified. The
 * modifications for the regular are to change the first letter to lowercase,
 * the last letter to uppercase, then appends the length of the password to
 * the end. The super modifications does the same, but also changes the first
 * letter to its' equivalent ASCII number. The program then outputs the
 * modified password to the console.
 *
 * @author Miranda Germain
 * @since 10/28/2022
 * @class CSC 115
 * @program PasswordGenerator.java
 */

import java.util.Scanner;

public class PasswordGenerator {
   public static void main(String[] args) {
      // Instantiate the scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Call methods to perform password generation
      outputResults(determineProcess(menuSelection(keyboardIn),
         getPassword(keyboardIn)));

      // Close Scanner
      keyboardIn.close();
   }

   // This method greets the user then gives them a menu to make
   // a selection from for modifying their password
   public static int menuSelection(Scanner keyboardIn) {
      // Welcoming Message
      System.out.println("Welcome to the Password Generator Program. \n");

      // Output directions and menu options
      System.out.println("Select from the following menu:\n1) enter \"1\"" +
         " for a regularly-modified password or\n2) enter \"2\" for a super" +
         "-modified password.\n");

      // Return menu selection as integer
      return keyboardIn.nextInt();
   }

   // This method prompts the user for a password, then returns that input
   // as a string
   public static String getPassword(Scanner keyboardIn) {
      // Prompt user for password
      System.out.println("Please enter a password.");

      // Move pass return key
      keyboardIn.nextLine();

      // Return password as string
      return keyboardIn.nextLine();
   }

   // This method determines which menu selection was chosen
   // then calls the appropriete methods to do the modifications
   public static String determineProcess(int selection, String password) {
      // Perform regular modifications
      password = caseModification(password);
      password = appendLength(password);

      // If selection was 2, perform super modifications
      if (selection == 2) {
         password = superModification(password);
      }

      // Return modified password
      return password;
   }

   // This method takes the user-defined password and makes the first letter
   // lowercase and the last letter uppercase. It then returns the
   // modified password as a string
   public static String caseModification (String password) {
      // Change first letter of password to lowercase
      password = password.substring(0,1).toLowerCase() +
         password.substring(1,password.length());

      // Change last letter of password to uppercase
      password =  password.substring(0, (password.length() - 1)) +
         password.substring((password.length() - 1),
         password.length()).toUpperCase();

      // Return modified password
      return password;
   }

   // This method takes the user-defined password and appends the length
   // of the password to the end. It returns the modified password as a string
   public static String appendLength (String password) {
      return password + password.length();
   }

   // This method replaces the first character with the ASCII numerical
   // equivalent
   public static String superModification (String password) {
      return (int)(password.charAt(0)) +
         password.substring(1,password.length());
   }

   // This method outputs the New Password
   public static void outputResults (String password) {
      System.out.print("The new password is \"" + password +
         "\".");
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    At least 2 hours
 * 2. What was the hardest part of this lab?
 *    Trying to figure out which string class returned the type of variable
 *    I was looking for, though I'm sure it would have been an easier time
 *    if I read the Java API and hints.
 * 3. What will you always remember (never forget) from this exercise?
 *    With the different methods doing different things it was easiest to
 *    create a seperate program working on them individually instead of
 *    constantly running the whole program. The whole divide and conquer thing
 *    really does help!
 */