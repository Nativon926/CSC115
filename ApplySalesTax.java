/**
 * Program takes input of retail price and sales tax then calculates & outputs
 *  the total price.
 * @author Miranda Germain
 * @since 9/9/2022
 * CSC 115
 */
import java.util.Scanner;

public class ApplySalesTax {
  public static void main(String[] args) {
    doTheThing();
  }

  public static void doTheThing() {
    //Instantiate a Scanner to take input from the user.
    Scanner scanner = new Scanner(System.in);

    //Prompt the user for a price.
    System.out.println("Enter the retail price of an item.");
    double price = scanner.nextDouble();

    //Prompt the user for a tax rate.
    System.out.println("Enter the tax rate (as a percentage).");
    double taxRate = scanner.nextDouble();
    scanner.close();

    //Compute the total cost of the item & output result.
    System.out.print("\nAn item with a retail price of $" + price +
      " and taxed at " + taxRate + "%\nwill cost the consumer $" +
      (price + (price*(taxRate*.01))) + ".");
  }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this assignment?
 *    About 30 minutes
 *
 * 2. What was the hardest part of this lab?
 *    Realizing I had to convert the percetage to a decimal in order to
 *    get it to function properly. Also finding proper place for $ & %
 *
 * 3. What will you always remember (never forget) from this exercise?
 *    To make sure my math works first before coding it in.
*/