/*
 * Miranda Germain
 * 8/30/2022
 * CSC 115
 * HelloWorld.java
 */
import java.util.Scanner;
import java.util.Random;

public class StringPlay {
   public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   System.out.println("Enter your name: ");
   String name = new String(in.nextLine());
   System.out.println("Your name is: " + name);
   System.out.println("Enter your last name: ");
   name+= " " + in.nextLine();
   System.out.println("Your full name is: " + name);
   System.out.println("Your name is " + (name.length() - 1) + " characters long");
   System.out.println("and the last intial is: " + name.charAt((name.indexOf(' ')+1)));
   }
}
