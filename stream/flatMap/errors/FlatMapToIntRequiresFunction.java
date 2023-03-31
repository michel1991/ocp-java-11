package stream.flatMap.errors;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class FlatMapToIntRequiresFunction {

    /**
     * What is the output of the following code snippet?
        A. 12124
        B. 11224
        C. 122
        D. The code does not compile.
        E. The code compiles but does not output anything at runtime.
        F. None of the above.

        The code does not compile because flatMapToInt() requires a Function
        with a return value of IntStream, not Stream, making option D correct.
     */
 static void flatMap(){
     var apples = List.of(1, 2);
     var oranges = List.of(1, 2);
     final var count = Stream.of(apples, oranges)
                            .flatMapToInt(List::stream)
                            .peek(System.out::print)
                            .count();
     System.out.print(count);
 }
}