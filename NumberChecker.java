// NumberChecker.java
import java.util.Scanner;
 
public class NumberChecker {
   public static boolean ispalindrome(int input) {
   if (input < 0) return false;
}

   int original = input;if (reversed > (Integer.MAX_VALUE - input) / 10) {
    System.out.print("Number is too large to process!");
    return false;


   int reversed = 0;
  
   while (input > 0) { 
     int digit = input % 10;
 
     if (reversed > (Integer.MAX_VALUE - input) / 10) {
    System.out.print("Number is too large to process!");
    return false;
  }

     reversed = reversed * 10 + digit;
     input = input / 10;
   }

   return original == reversed;
 }

  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Enter an integer: ");
     int number = input.nextInt();
 
     boolean result = ispalindrome(number);
     System.out.println("Is palindrome? " + result);
  }
}