// SumOddjava
import java.util.Scanner; 

public class SumOdd {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);


  int sum = 0;
  for (int i = 1; i <= 99; i += 2)

  sum += i;


  System.out.println("The sum of odd integers between 1 and 99 is: " + sum);
  }
}


