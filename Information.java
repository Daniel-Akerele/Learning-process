// Information.java
import java.util.Scanner;

public class Information {
   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);

   System.out.print("Enter your first name: ");
   String Firstname = input.nextLine();
   
   System.out.print("Enter your last name: ");
   String Lastname = input.nextLine();

   System.out.print("Enter your state of origin: ");
   String stateoforigin = input.nextLine();

 System.out.println("My name is " + Firstname + " " + Lastname + ", I am from " + stateoforigin + ".");
  }
}