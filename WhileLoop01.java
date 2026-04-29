/**
 * This program uses a while loop to print the first 10 whole numbers on 10
 * seperate lines. It preceeds with the word "BEGIN" and ends with the word
 * "END".
 *
 * @author Miranda Germain
 * @since 11/02/2022
 * @class CSC 115
 * @program WhileLoop01.java
 */

public class WhileLoop01 {
   public static void main(String[] args) {
      whileLoop(); // Call method to perform loop
   }

   // This method prints first 10 whole numbers using a while loop
   public static void whileLoop() {
      // Initialize variables
      int count = 0;

      // Output beginning statement to the console
      System.out.println("BEGIN");

      // Perform while loop to print first 10 whole numbers
      while (count < 10) {
         System.out.println(count);
         count++;
      }

      // Output ending statement to the console
      System.out.print("END");
   }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this lab?
 *    Around 15 minutes
 * 2. What was the hardest part of this lab?
 *    Just making sure i started with the correct value and that the condition
 *    would return false when count was 10.
 * 3. What will you always remember (never forget) from this exercise?
 *    Just to be careful with < & <=. Sometimes I overlook them when coding.
 */