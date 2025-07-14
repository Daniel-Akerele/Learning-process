// MultiplicationWithoutSign.java
import java.util.Scanner;

public class MultiplicationWithoutSign {
  
   public static int multiplyLoop( int num1, int num2) {
       boolean isNegative = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);
        
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

    int result = 0;
  
    for (int i = 0; i < num2; i++) {
        result += num1; 
  }
     
  return isNegative ? -result : result; 
}     
   
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);  

     System.out.print("How many inputs do you want to multiply?");
     int count = input.nextInt();
     
     int result = 1;
    
      for (int i = 1; i <= count; i++) {
            System.out.println("\nPair " + i + ":");
            int num1 = input.nextInt();
             
             result = multiplyLoop(result, num1);          
      }

      System.out.println("Final result: " + result);

      input.close();
    }
 }





    
            
