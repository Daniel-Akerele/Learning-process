import java.util.Scanner;

public class AddSpaceAfterEachDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter a Number: ");
        String number = input.nextLine();
        System.out.println("You entered the number: " + number);

        int step1Sum = 0; 
        int step3Sum = 0; 

        for (int i = number.length() - 1; i >= 0; i--) {
            char ch = number.charAt(i);
            int digit = Character.getNumericValue(ch);
            int positionFromRight = number.length() - i;

            if (positionFromRight % 2 == 0) {
                                System.out.printf("%d * 2 = ", digit);
                digit *= 2;
                System.out.print(digit);

                if (digit > 9) {
                    int firstNumber = digit / 10;
                    int secondNumber = digit % 10;
                    digit = firstNumber + secondNumber; 
                    System.out.printf(" (%d + %d = %d)", firstNumber, secondNumber, digit);
                }

                step1Sum += digit;
                System.out.println();
            } else {
                
                step3Sum += digit;
                System.out.printf("Odd-position digit: %d added to step3Sum%n", digit);
            }
        }

               int totalSum = step1Sum + step3Sum;
        System.out.println("Step 4: Total sum = " + totalSum);

        if (totalSum % 10 == 0) {
            System.out.println("✅ The credit card number is VALID.");
        } else {
            System.out.println("❌ The credit card number is INVALID.");
        }
    }
}

