/**
 * This program prints the first 10 whole numbers and seperate lines using a
 * for loop
 *
 * @author Miranda Germain
 * @since 11/02/2022
 * @class CSC 115
 * @program ForLoop01.java
 */

public class ForLoop01 {
   public static void main(String[] args) {
      forLoop(); // Call method to perform loop
   }

   // This method prompts prints the first 10 whole numbers on 10 seperate
   // lines
   public static void forLoop() {
      // for loop to print the first whole 10 numbers
      for (int count = 0; count < 10; count ++) {
         System.out.println(count);
      }
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 10 minutes
 * 2. What was the hardest part of this lab?
 *    Just making sure I set up the for loop correctly
 * 3. What will you always remember (never forget) from this exercise?
 *    I just find for loops so convienient.
 */