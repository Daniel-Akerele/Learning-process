// RangeOdd.java
import java.util.Scanner;

public class RangeOdd {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter integer: ");
   int number = input.nextInt();

   System.out.println("\n\nOdd numbers from 1 to " + number + ":");
      for (int i = 1; i <= number; i++) {
         if (i % 2 != 0) {
            System.out.print(i + " ");;
        }
      }
   }
}
