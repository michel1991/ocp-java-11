package stream.convertToStreamObj;
import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

/**
 *  What will the following code print when compiled and run?
    A. It will not compile.
    
    B. It will throw an exception at run time.
    C. It will not print anything.
    D.
       US Washington DC
       UK London
        India New Delhi
    
    E.
      US Washington DC
      UK London
      
   This is a simple API based question. The important thing here is that the endIndex of  IntStream.range is exclusive i.e.
   IntStream.range(0, 3) will produce a stream of integers 0, 1, and 2. 3 will not be included.

    Had the problem statement used rangeClosed method, the output would have been:
    US Washington DC
    UK London
    India New Delhi
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
         Index 3 out of bounds for length 3
    
    static IntStream range(int startInclusive, int endExclusive)
    Returns a sequential ordered IntStream from startInclusive (inclusive) to endExclusive (exclusive) by an incremental step of 1.
    
    static IntStream rangeClosed(int startInclusive, int endInclusive)    
    Returns a sequential ordered IntStream from startInclusive (inclusive) to endInclusive (inclusive) by an incremental step of 1.
    
    <U> Stream<U> mapToObj(IntFunction<? extends U> mapper)
    Returns an object-valued Stream consisting of the results of applying the given function to the elements of this stream.
    This is an intermediate operation.
    
    Correct(D)
 */
public class PrintUsWashington {
    public static void main(String... args){
        List<String> countries = List.of("US", "UK", "India", "Argentina");
        List<String> capitals = List.of("Washington DC", "London", "New Delhi" );
        Stream<String> is = IntStream
        .range(0, Math.min(countries.size(), capitals.size()))
        .mapToObj(i->countries.get(i)+" "+capitals.get(i));
        is.forEach(System.out::println);
    }
}