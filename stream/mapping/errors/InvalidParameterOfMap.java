package stream.mapping.errors;
import java.util.*;
import java.util.stream.*;

/**
* Which of the following is true?
* A. The code compiles and prints 123456.
  B. The code compiles and prints 234567.
  C. The code compiles but does not print anything.
  D. The code compiles but prints stream references.
  E. The code runs infinitely.
  F. The code does not compile.
  G. The code throws an exception.

  If the map() and flatMap() calls were reversed, option B would be correct.
  In this case, the Stream created from the source is of type Stream<List>.
  Trying to use the addition operator (+) on a List is not supported in Java.
  Therefore, the code does not compile, and option F is correct.
 */
public class InvalidParameterOfMap {
    static void invalidMapParameter(){
        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of();
        Stream.of(x1, x2, x3).map(x -> x + 1)
                             .flatMap(x -> x.stream())
                             .forEach(System.out::print);
    }
   public static void main(String... args){

   }
}