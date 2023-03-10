package stream;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class SumPrime {
    /**
     *  Fill in the blank with the functional interface from java.util.function that allows the code to compile and print 3 at runtime.
        A. Function˂Integer,Integer˃
        B. UnaryOperator˂Integer˃
        C. ToIntFunction˂Integer˃
        D. IntUnaryOperator
        E. The code does not compile regardless of what functional interface is placed in the blank.
        F. The code is capable of compiling, but since prime is an OptionalInt value, it cannot be 3 at runtime.

        The first line that contains the lambda expression will actually compile with
        any of the functional interfaces listed in the options.
        The stream operation, though, will compile only if ToIntFunction˂Integer˃ is used.
        It requires this functional interface, which takes a generic argument and returns int.
        For this reason, option C is correct.
        Option F is incorrect because sum() on an IntStream returns an int, not an OptionalInt.
        Note that the peek() operations in this stream have no effect.
     */
  public static void main(String... args){
      // _____________ transformer = x -˃ x;
      ToIntFunction<Integer> transformer = x -> x;  // _____________
      var prime = List.of(3,1,4,1,5,9)
               .stream()
               .limit(1)
               .peek(s -> {})
                  .mapToInt(transformer)
               .peek(s -> {})
                  .sum();
                  System.out.println(prime);
  }
}