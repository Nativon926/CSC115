/**
 * This program takes a user-defined integer to determine which tier of a
 * kickstarter the user would be with that input. The user will get all
 * the gifts from any tier lower than their highest tier. The program
 * uses a switch statement in order to do this.
 *
 * @author Miranda Germain
 * @since 10/19/2022
 * @class CSC 115
 * @program KickStarter.java
 */

import java.util.Scanner;

public class KickStarter {
   public static void main (String[] args) {
      tierlist();
   }

   // This method will determine which tier a user is using a kickstarter
   // like model. The user will be rewarded every tier beneathe their highest
   // tier of contribution
   public static void tierlist() {
      // Declare Variables
      String tierStatement = "";

      // Instantiate scanner
      Scanner keyboardIn = new Scanner(System.in);

      // Welcoming statement
      System.out.println("Welcome to Kickstarter!\n");

      // Prompt user for a contribution amount
      System.out.println("How much would you like to contribute to the " +
         "'Cones of Dunshire' project?\n");

      // Switch statement to determine tier
      switch(keyboardIn.nextInt()) {
         case 150:
            tierStatement += "You will receive the 'Cone of Dunshire' hat.\n";
         case 100:
            tierStatement += "You will receive the Founders Edition of the" +
               " tabletop version of 'Cones of Dunshire'.\n";
         case 50:
            tierStatement += "You will receive a copy of the tabletop" +
               " version of 'Cones of Dunshire'.\n";
         case 20:
            tierStatement += "You will receive a copy of the mobile app" +
               " version of 'Cones of Dunshire'.\n";
         case 5:
            tierStatement += "You will have your name put on a list of" +
               " backers on our website.\n";
         case 1:
            tierStatement += "You will receive a thank-you email.\n";
            break;
         default:
            tierStatement += "You did not enter a valid amount.\n";
      }

      // Close Scanner
      keyboardIn.close();

      // Prints the gifts pertaining to each tier achieved by user
      System.out.println(tierStatement);

      // Farewell Statement
      System.out.print("Thanks for backing 'Cones of Dunshire'.");
   }
}

/*
 * 1. How much time was required to complete this lab?
 *    About 30 minutes
 * 2. What was the hardest part of this lab?
 *    Determining where to put the break, so the default case would run
 *    properly. Plus I didn't know "=+" instead of "+=" would throw an error.
 *    Which is good because I've grown into the habit of thinking they do
 *    the same thing, which isn't true.
 * 3. What will you always remember (never forget) from this exercise?
 *    To be careful with my "+="s. Plus switch breaks kind of remind me
 *    of return statements in how they act which is pretty cool.
 */