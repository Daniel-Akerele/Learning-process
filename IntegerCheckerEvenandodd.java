// IntegerCheckerEvenandOdd.java
import java.util.Scanner;

public class IntegerCheckerEvenandOdd {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter first integer: ");
   int firstinteger = input.nextInt();

   System.out.print("Enter second integer: ");
   int secondinteger = input.nextInt();
    
     if (firstinteger % 2 == 0) {
         System.out.println("First integer (" + firstinteger + ") is even.");
      } else {
         System.out.println("First integer (" + firstinteger + ") is odd.");
      }

      // Check second integer
      if (secondinteger % 2 == 0) {
         System.out.println("Second integer (" + secondinteger + ") is even.");
      } else {
         System.out.println("Second integer (" + secondinteger + ") is odd.");
      }
   }
}