/**
 * This program gives a compliment to the user if they would like one. The
 * user agrees or disagrees using 1 or 2. This program always concludes
 * with a valedictory.
 *
 * @author Miranda Germain
 * @since 10/03/2022
 * @class CSC 115
 * @program Compliment01.java
 */

import java.util.Scanner;

public class Compliment01 {
   public static void main (String[] args) {
      compliment();
   }

   // This method compliments the user if they input 1 for yes
   public static void compliment() {
      // Declare constant variables
      final int YES = 1;

      // Instantiate a scanner to take input from the keyboard
      Scanner keyboardIn = new Scanner(System.in);

      // Prompt user for a number for if they'd like a compliment
      System.out.println("Would you like a compliment (\"" + YES +
         "\" for YES," + " \"2\" for NO)? ");
      int choice = keyboardIn.nextInt();

      // If statement for if the user wants a compliment
      if ( choice == YES ) {
         System.out.println("You are soooooooo good looking.");
      }

      // Conclusion Statement
      System.out.print("Come on back when you need a complement.");
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Probably about 15 minutes
 * 2. What was the hardest part of this lab?
 *    I completely forgot to import java.util.Scanner! Plus there was a moment
 *    where I forgot to line up the if statement's ending curly bracket.
 * 3. What will you always remember (never forget) from this exercise?
 *    Always to make sure I import what I need to. I've gotten used to it being
 *    done for us.
 */