// Texteditor.java
import java.util.Scanner;

public class Texteditor {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Enter your string: ");
     String userInput = input.nextLine();

      String output = formatInput(userInput);

        System.out.println("Cleaned output: " + output);

        input.close();
    }

    public static String formatInput(String userInput) {
        String cleaned = userInput.replaceAll("[^a-zA-Z]", " ");
        String[] words = cleaned.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    result.append(word.substring(1).toLowerCase());
                }
            }
        }

        return result.toString();
    }
}