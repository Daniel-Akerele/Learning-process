// CreditCardChecker.java
Import java.util.Scanner;

public class CreditCardChecker {   
 public static String doubleEverySecondDigitFromRight(String numberString) {
    Scanner input = new Scanner(System.in);  
     
    System.out.print("Enter your credit card number: ");
    String builder result = new String builder();
    
    for (int i = numberString.length() - 1; i >= 0; i--) {
           int digit = Character.getNumericValue(numberString.charAt(i));
  