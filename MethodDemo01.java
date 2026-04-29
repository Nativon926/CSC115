import java.util.Scanner;

public class MethodDemo01 {
  public static void main (String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a number:");
    int number = scanner.nextInt();
    
    int doubled = doubleNumber(number);
    
    System.out.println("Your number doubled is " + doubled);
    
  }
  
  public static int doubleNumber(int a) {
    return a * 2;
  }

}