// Fig. 5.19: LogicalOperators.java 
// Logical operators.

public class LogicalOperators {
   public static void main(String[] args) {
      // create truth table for && (conditional AND) operator
      System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%n",
         "Conditional And (&&)", "false &&false", (false && false),
         "false && true", (false && true),
         "true && false", (true && false),
         "true && true", (true && true));

      // create truth table for || (condition OR) operator
      System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n",
        "Conditional OR (||)","false || false", (false || false),
        "false || true", (false || true),
        "true || false", (true || false),
        "true || true", (true ||true));

      // create truth table for & (boolean logical AND) operator
      System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s",
        "Boolean logical And (&)", "false & false", (false & false),
        "false & true", (false & true),
        "true & false", (true & false),
        "true & true", (true & true));

      // create truth table for | (boolean logical inclusive OR) operator
      System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Boolean logical inclusive OR (|)",
        "false| false", (false | false),
        "false| true", (false | true),
        "true | false", (true | false),
        "true | true", (true | true));

      // create truth table for ^ (boolean logical exclusive OR) operator
       System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "Boolean logical enclusive OR (^)",
        "false ^ false", (false ^ false),
        "false ^ true", (false ^ true),
        "true ^ false", (true ^ false),
        "true ^ true", (true ^ true));

     // create truth table for ! (logical negation) operator
     System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)",
        "!false", (!false), "!true", (!true));
   }
 }
  
