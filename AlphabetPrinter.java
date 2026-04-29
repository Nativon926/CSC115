//
// Author: Miranda Germain
// Date: 08/31/2022
//
// This program will print the alphabet to the standard console output
//
 
 public class AlphabetPrinter {
 // This is a java application, so has a main method.
   public static void main(String[] args) {
      int anUnusedVariable = 0; // an unused variable
      // variable to hold the initial letter to be printed to the console
      // that is initialized to the letter a, the first character to print
      //
      char letter = 'a';
      // loop through all the letters of the alphabet and display to
      // console
      //
      for( char ch= letter; ch <='z'; ++ch){
      System.out.print(ch);
      }
    }
  }