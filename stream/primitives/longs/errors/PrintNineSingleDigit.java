package stream.primitives.longs.errors;
import java.util.stream.*;
import java.util.function.*;

public class PrintNineSingleDigit {
    
    /**
     * Which can fill in the blank to have the code print the single digit 9?
        A. Only mapToDouble
        B. Only mapToInt
        C. Only mapToLong
        D. Both mapToDouble and mapToInt
        E. mapToDouble, mapToInt, and mapToLong
        F. None of the above
        
        The mapToDouble() method compiles. However, it converts 9 into 9.0
        rather than the single digit 9.
        The mapToInt() method does not compile because a long cannot
        be converted into an int without casting.
        The mapToLong() method is not available on LongStream so it does not compile.
        It is available on DoubleStream, IntStream, and Stream implementations.
        Since none of the options outputs the single digit 9, option F is correct.
     */
    static void print(){
        var stream = LongStream.of(9);
        //stream.________(p -> p).forEach(System.out::print);
        stream.mapToInt(p -> p).forEach(System.out::print);
    }
}