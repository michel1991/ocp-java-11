package stream.sorted.errors;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 * What is the output of the following?
    A. 689
    B. 986
    C. The code does not compile.
    D. The code compiles but throws an exception at runtime.

    There is not a stream pipeline method called sort().
    There is one called sorted(). Since the code does not compile,
    option C is correct. If this was fixed,
    option A would be correct since the Comparator sorts in ascending order.
 */
class Compete {
    public static void main(String[] args) {
        Stream<Integer> is = Stream.of(8, 6, 9);
        Comparator<Integer> c = (a, b) -> a - b;
        is.sort(c).forEach(System.out::print);
    }
}


public class CompeteNotSortMethod {

}