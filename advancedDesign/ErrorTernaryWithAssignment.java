package advancedDesign;
/**
* The code does not compile because the assignment operator has the highest order of precedence in this expression.
* Both sides of the ternary operator must have the same type. This expression is invalid, as the left side of the second
* assignment operator is not a variable, so the answer is option F.
* Note that if the question had added explicit parentheses around the expression (Tiger = " is Bigger"),
* option E would have the correct output.
 */
public class ErrorTernaryWithAssignment {
  public static void main(String... args){
      var tiger = "Tiger";
      var lion = "Lion";
      final var statement = 250 > 338 ? lion : tiger = " is Bigger";
      System.out.println(statement);
  }
}