/**
 * This program takes integer input from the user and
 * stores those as height and base. Then calculates the
 * area of the user's triangle.
 *
 * @author Miranda Germain
 * @since 9/14/22
 * CSC 115
 * TriangleArea.Java
 */

import java.util.Scanner;

public class TriangleArea {
    public static void main (String[] args) {
        findArea();
    }

    public static void findArea() {
        //Instantiate a Scanner to take input from the user.
        Scanner scanner = new Scanner(System.in);

        //Prompt the user for the triangle height and store the input in a
        //variable named 'height'.
        System.out.println("Enter the height:");
        int height = scanner.nextInt();

        //Prompt the user for the triangle base and store the input in a
        //variable named 'base'.
        System.out.println("Enter the base:");
        int base = scanner.nextInt();
        scanner.close();

        //Display the area of the triangle.
        System.out.print("\nThe area of the triangle is " +
            (((double)height*base)/2) + ".");
    }
}
// =============== LAB SUMMARY ===============

/*
 * 1. How much time was required to complete this assignment?
 *    About 15 minutes
 * 2. What was the hardest part of this lab?
 *    I was almost fooled by the comment being worded wrong for base because I
 *    tend to just skim over those.
 * 3. What will you always remember (never forget) from this exercise?
 *    It was a good reminder that the comments are a part of my code now and
 *    that I am responsible for them too. I must read those carefully to make
 *    sure their logic checks out.
 */