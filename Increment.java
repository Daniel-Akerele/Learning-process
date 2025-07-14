// Fig. 4.15: Increment.java
//Prefix increment and postfix increment operators 

public class Increment {
   public static void main(String[] args) {
      // demonstate postfix increment operator
      int c = 5;
      System.out.printf("c before postincrement: %d%n", c); // prints 5
      System.out.printf("     postincrementing c: %d%n", c++); // prints 6
      System.out.printf("  c after postincrement: %d%n", c); // print 6

      System.out.println(); // skin a line

      // demonstrate prefix increment operator
      c = 5;
       System.out.printf("c before postincrement: %d%n", c); // prints 5
      System.out.printf("     postincrementing c: %d%n", ++c); // prints 6
      System.out.printf("  c after postincrement: %d%n", c); // print 6
    }
  }   