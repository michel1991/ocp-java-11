package stream.errors;
import java.util.*;
import java.util.function.*;

public class BounceListDoesNotHaveParallelMethod {
    /**
     * What is the result of executing the following application multiple times?
        A. Only the first stream prints the same order every time.
        B. Only the first and second streams print the same order every time.
        C. Only the first and third streams print the same order every time.
        D. All of the streams print the same order every time.
        E. None of the streams prints the same order every time.
        F. None of the above.

        A List instance, which inherits the Collection interface,
        does not have a parallel() method.
        Instead, parallelStream() must be used, making option F correct.
        If the code was corrected to use parallelStream(),
        then the first and third streams would be consistently printed in the same order.
        Remember that the forEachOrdered() method forces parallel streams to run in sequential order.
        The order of the second operation would be unknown ahead of time, since it uses a parallel stream.
     */
    public static void main(String... legend) {
        List.of(1,2,3,4).stream()
         .forEach(System.out::println);
        List.of(1,2,3,4).parallel()
         .forEach(System.out::println);
        List.of(1,2,3,4).parallel()
         .forEachOrdered(System.out::println);
    }
}