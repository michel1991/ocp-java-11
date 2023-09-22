package stream.map.errors;
import java.util.stream.*;
import java.util.*;
import java.util.Map.*;
import java.util.function.*;

/**
    What is the result of the following?
    A. The code compiles and outputs 1.
    B. The code compiles and outputs 8.
    C. The first compiler error is on line c1.
    D. The first compiler error is on line c2.
    E. The first compiler error is on line c3.
    F. The first compiler error is on line c4.
    
    Line c1 correctly creates a stream containing two streams.
    Line c2 uses flatMap() to create a Stream of four Integer objects.
    The first problem is on line c3, which tries to use the numbers as if they are still pairs.
    Since we have a Stream˂Integer˃ at that point,
    the code does not compile, and option E is the answer.
    Line c4 does not compile either as you can’t call a List method on an Integer.

 */
public class StreamOfStreams {
    public static void main(String[] args) {
        var result =
        Stream.of(getNums(9, 8), getNums(22, 33))  // c1
           .flatMap(x -> x)                        // c2
           .map((a, b) -> a - b)                   // c3
           .filter(x -> !x.isEmpty())              // c4
           .get();     
        System.out.println(result);
    }
    private static Stream<Integer> getNums(int num1, int num2) {
        return Stream.of(num1, num2);
    }
}