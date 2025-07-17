// MiniCalculator.java
import java.util.Scanner;

public class MiniCalculator {
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in);  

  System.out.print("Enter first integer: ");

  int firstinteger = Integer.parseInt(input.nextLine());

  System.out.print("Enter second integer: ");

  int secondinteger = Integer.parseInt(input.nextLine());

   System.out.println(firstinteger + " + " + secondinteger + " = " + (firstinteger + secondinteger));
    System.out.println(firstinteger + " - " + secondinteger + " = " + (firstinteger - secondinteger));
    System.out.println(firstinteger + " * " + secondinteger + " = " + (firstinteger * secondinteger));
 }
}
 