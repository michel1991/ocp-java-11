package stream.mapping.errors;
import java.util.*;
import java.util.stream.*;

public class MultipleTypeOfStreamFindErrors {
    /**
       Which of the following is true? (Choose all that apply.)
        A. Line 4 causes a compiler error.
        B. Line 5 causes a compiler error.
        C. Line 6 causes a compiler error.
        D. Line 7 causes a compiler error.
        E. Line 8 causes a compiler error.
        F. The code compiles but throws an exception at runtime.
        G. The code compiles and prints 1.

        Line 4 creates a Stream and uses autoboxing to put the Integer wrapper of 1 inside.
        Line 5 does not compile because boxed() is available only on primitive streams like IntStream,
        not Stream<Integer>.
        Line 6 converts to a double primitive, which works since Integer
        can be unboxed to a value that can be implicitly cast to a double.
        Line 7 does not compile for two reasons.
        First, converting from a double to an int would require an explicit cast.
        Also, mapToInt() returns an IntStream so the data type of s3 is incorrect.
        The rest of the lines compile without issue.
     */
   static void findErrors(){
       Stream<Integer> s = Stream.of(1); //   4:
       IntStream is = s.boxed(); //  5:
       DoubleStream ds = s.mapToDouble(x -> x); //  6:
       Stream<Integer> s2 = ds.mapToInt(x -> x); //  7:
       s2.forEach(System.out::print); //  8:

   }
}