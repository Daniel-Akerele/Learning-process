// IntegerCheckerodd.java
import java.util.Scanner;

public class IntegerCheckerOdd {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter integer: ");
   int number = input.nextInt();    
      if (number % 2 != 0) {
         System.out.println("Integer is odd.");
      } else {
         System.out.println("Integer is not odd."); 
      }
   }
 }