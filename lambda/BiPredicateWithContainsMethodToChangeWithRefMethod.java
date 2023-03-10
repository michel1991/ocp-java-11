package lambda;
import java.util.function.*;
import java.util.*;

public class BiPredicateWithContainsMethodToChangeWithRefMethod {
    /**
     * Which method reference can replace the lambda on the first line so the output is the same?
        A. a::contains(b)
        B. a::contains
        C. String::contains(b)
        D. String::contains
        E. The supplied code does not compile.
        F. None of the above.

        Since the code uses a BiPredicate, it takes two parameters in the test() call.
        The first is the instance of String and the second is substring value to check.
        Since both parameters are passed in, we use the type of String in the method reference, making option D the correct answer.
     */
  static void codeToRemplace(){
      BiPredicate<String, String> pred = (a, b) -> a.contains(b);
      System.out.println(pred.test("fish", "is"));
  }
}