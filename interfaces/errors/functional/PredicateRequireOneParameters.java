package interfaces.errors.functional;
import java.util.*;
import java.util.function.*;

/**
    Which method reference can replace the lambda on the second line so the output is the same?
        A. a::contains(b)
        B. a::contains
        C. String::contains(b)
        D. String::contains
        E. The supplied code does not compile.
        F. None of the above.

        The code does not compile, making option E the answer.
        In particular, the call to test() should have one parameter instead of two.
 */
public class PredicateRequireOneParameters {
   static void test(){
       var s = "fish";
       Predicate<String> pred = (a) -> s.contains(a);
       System.out.println(pred.test("fish", "is"));
   }
}