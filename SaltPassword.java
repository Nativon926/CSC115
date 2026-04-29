/**
 * This program prompts the user for an integer to use as a seed. It also
 * prompts the user for a password. It then uses the user-defined seed to
 * generate a salt of five character and adds that salt to the original
 * password. It outputs the results to the console.
 *
 * @author Miranda Germain
 * @since 9/30/2022
 * @class CSC 115
 * @program SaltPassword.java
 */

import java.util.Scanner;
import java.util.Random;

public class SaltPassword {
   public static void main (String[] args) {
      // Call a method to 'salt' a password.
      saltPassword();
   }

   // This method prompts the user for a seed (for the random number generator)
   // and an initial password; then, this method
   // 1) generates a 'salt' (a 5-character random sequence),
   // 2) concatenates the 'salt' to the user-defined password, and finally
   // 3) displays the 'salted' password (the original password with the
   //    'salt' appended to it).
   public static void saltPassword() {
      // Instantiate a Scanner to take input from the user.
      Scanner keyboardIn = new Scanner(System.in);

      // Prompt the user for a seed & password and store the values
      System.out.println("Enter seed:");
      int seed = keyboardIn.nextInt();
      keyboardIn.nextLine();
      System.out.println("Enter a password:");
      String password = keyboardIn.nextLine();

      // Instantiate the Random object.
      Random random = new Random(seed);

      // Create Salt with Random Object
      String salt = "";
      salt += (char)(random.nextInt('z' - 'A' + 1) + 'A');
      salt += (char)(random.nextInt('z' - 'A' + 1) + 'A');
      salt += (char)(random.nextInt('z' - 'A' + 1) + 'A');
      salt += (char)(random.nextInt('z' - 'A' + 1) + 'A');
      salt += (char)(random.nextInt('z' - 'A' + 1) + 'A');

      // Add Salt to initial password and reassign
      password += salt;

      // Print results of salt and new password
      System.out.println("Salt: " + salt);
      System.out.print("Salted password: " + password);
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    About 30 minutes
 * 2. What was the hardest part of this lab?
 *    I was really hung up by how the salts were created since they were "real
 *    words". I was thinking I didn't understand what a salt was and that it
 *    was some puzzle created from the strings themselves or something. Haha
 *    but I took a moment to sit and follow the directions and it worked out!
 * 3. What will you always remember (never forget) from this exercise?
 *    Sometimes I think the most important part of programming is to breathe
 *    and take it step by step and eventually you'll reach the solution.
 */