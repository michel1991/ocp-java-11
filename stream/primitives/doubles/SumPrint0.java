package stream.primitives.doubles;
import java.util.*;
import java.util.stream.*;

/**
 * What will be the result of compilation and execution of the following code ?
  
    A. It will print 0.0
    B. It will print 6.0
    C. It will print OptionalDouble[0.0] if line at //2 is replaced with OptionalDouble x = is.sum();
    D. It will not compile.
    E. It will throw an exception at run time.
    
    The sum method of all numeric streams (i.e. IntStream, LongStream, and DoubleStream)
    returns a primitive value of the same type as the type of the stream (i.e. int, long, or double, respectively).
    If the stream has no elements, it returns 0, 0, or 0.0. Thus, there is no compilation error in the given code.

    Note that this is unlike the average method which always returns an OptionalDouble for all numeric streams.
    If the stream has no elements, average returns an empty OptionalDouble and not a null.

   In this case, the original stream has three elements, but the filter method returns a new stream with no elements
   (because none of the elements match the filter condition). Thus, the sum is 0.0, which is what is printed.
   
   Correct(A)

 */
public class SumPrint0 {
    public static void main(String... args){
        DoubleStream is = DoubleStream.of(0, 2, 4); //1
        double sum = is.filter( i->i%2 != 0 ).sum(); //2
        System.out.println(sum); //3
    }
}