package operations;

/**
*  What is the result of executing the following code snippet?
    A. It prints 4-10.
    B. It prints 4-15.
    C. It prints 5-14.
    D. It prints 5-15.
    E. The code does not compile because of line 6.
    F. The code does not compile because of a different reason.
    G. The code compiles but produces an infinite loop at runtime.

   Braces {} are optional for while and do/while statements, as shown on line 6, but parentheses, (), are not.
   For this reason, line 7 does not compile, and option F is the correct answer.
   If line 7 were corrected to have parentheses around elephant < 5, the code snippet would print 5-14.
 */
public class  ErrorBracesAreOptionalButParenthesesRequire {
  public static void main(String... args){
      int elephant = 1, crocodile = 15; //  3:
      if (elephant <= 10) // 4:
          crocodile--; //  5:
      do elephant++; //  6:
      while elephant < 5; // 7:
      System.out.print(elephant + "-" + crocodile); //   8:
  }
}