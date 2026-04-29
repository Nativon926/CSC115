/**
 * This program outputs random compliments to the user a user-defined
 * number of times until the user inputs "0" to stop. The user inputs
 * an integer to be used as a seed for the random number generator.
 * The program uses that random object to pick from the user's specified
 * number of compliments with compliments that the user makes themselves.
 * The user will keep entering compliments at the beginning until they enter
 * an empty string "" by pressing the enter key. The array's size will 
 * adjust accordingly
 *
 * @author Miranda Germain
 * @since 12/16/2022
 * @class CSC 115
 * @program RandomCompliment_Part3.java
 */
import java.util.Scanner;

public class testArray
{   
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
    	String[] numberArray = new String[1];
      
      System.out.println("Enter First:");
      String num = in.nextLine();
      numberArray[0] = num;
      
    	System.out.println("Array before ReSize: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
      
      int index = 1; 
        
      while(num.length() > 0) {
        
        String[] temp = new String[numberArray.length + 1];
        int length = numberArray.length;
        for (int j = 0; j < length; j++) {
          temp[j] = numberArray[j];
          System.out.println("Temp: " + temp[j]);
          System.out.println("Actual: " + numberArray[j]);
        }
        
        temp[index] = num;
        numberArray = temp;
        num = in.nextLine();
        System.out.print("\nAfter temp: " + temp[index] + "\n After array: " + numberArray[index]);
        index++;
      }
      
      
      
      
        System.out.println("Array after ReSize: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
   }
}