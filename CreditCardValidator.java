import java.util.Scanner;

public class CreditCardValidator {

    // Step 2: Process even-place digits (from right), return sum
    public static int sumProcessedEvenPlaceDigits(String cardNumber) {
        int length = cardNumber.length();
        int sum = 0;

        System.out.print("Step 2 - Processed digits (even places from right): ");

        for (int i = 0; i < length; i++) {
            if (i % 2 == 1) { // Even positions from right
                int digit = Character.getNumericValue(cardNumber.charAt(length - 1 - i));
                digit *= 2;
                if (digit > 9) {
                    digit = (digit / 10) + (digit % 10);
                }
                System.out.print(digit + " ");
                sum += digit;
            }
        }

        System.out.println();
        return sum;
    }

    // Step 3: Sum digits in odd positions from right
    public static int sumOddPlaceDigits(String cardNumber) {
        int length = cardNumber.length();
        int sum = 0;

        System.out.print("Step 3 - Digits in odd places from right: ");

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) { // Odd positions from right
                int digit = Character.getNumericValue(cardNumber.charAt(length - 1 - i));
                System.out.print(digit + " ");
                sum += digit;
            }
        }

        System.out.println();
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your credit card number: ");
        String cardNumber = scanner.nextLine().trim();

        if (!cardNumber.matches("\\d+")) {
            System.out.println(" Invalid input! Please enter digits only.");
            return;
        }

        // Step 2
        int sumStep2 = sumProcessedEvenPlaceDigits(cardNumber);

        // Step 3
        int sumStep3 = sumOddPlaceDigits(cardNumber);

        // Step 4: Final total and validation
        int total = sumStep2 + sumStep3;
        System.out.println("Step 4 - Total sum (Step 2 + Step 3): " + total);

        if (total % 10 == 0) {
            System.out.println("The credit card number is VALID.");
        } else {
            System.out.println("The credit card number is INVALID.");
        }

        scanner.close();
    }
}



