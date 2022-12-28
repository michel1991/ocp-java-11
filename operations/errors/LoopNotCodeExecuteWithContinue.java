package operations.errors;
import java.util.*;

public class LoopNotCodeExecuteWithContinue {

   /**
      What is the output of the following code snippet?

        A. It compiles and runs without issue but does not produce any output.
        B. 10, 14,
        C. 10, 10, 14,
        D. 10, 10, 14, 10, 14,
        E. Exactly one line of code does not compile.
        F. Exactly two lines of code do not compile.
        G. Three or more lines of code do not compile.
        H. The code contains an infinite loop and does not terminate.

        The second for-each loop contains a continue followed by a println() statement.
        Because the continue is not conditional and always included as part of the body of the for-each loop,
        the println() statement is not reachable.
        For this reason, the println() statement does not compile.
        As this is the only compilation error, option E is correct.
        The other lines of code compile without issue.
        In particular, because the data type for the elements of myFavoriteNumbers is Integer,
        they can be easily unboxed to int or referenced as Object. For this reason,
        the lines containing the for-each expressions each compile.
    */
  static void noCodeExceute(){
      List<Integer> myFavoriteNumbers = new ArrayList<>();
      myFavoriteNumbers.add(10);
      myFavoriteNumbers.add(14);
      for (var a : myFavoriteNumbers) {
          System.out.print(a + ", ");
          break;
      }

      for (int b : myFavoriteNumbers) {
          continue;
          System.out.print(b + ", ");
      }

      for (Object c : myFavoriteNumbers)
          System.out.print(c + ", ");

  }
}