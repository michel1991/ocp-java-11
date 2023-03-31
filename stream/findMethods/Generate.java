package stream.findMethods;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

public class Generate {
    /**
     Following the generate() method, which of the
        four method calls in this code can be removed
       and have the method still compile and run without error?
       
        A. filter()
        B. sorted()
        C. filter() and sorted()
        D. filter(), and ifPresent()
        E. filter(), sorted(), and ifPresent()
        F. filter(), sorted(), findFirst(), and ifPresent()
        
        A stream pipeline is allowed to have zero or more intermediate operations.
        This means both filter() and sorted() can be removed.
        The source and terminal operations are required, so cannot be removed.
        Therefore, generate() and findFirst() must stay.
         The ifPresent() call is not part of the stream pipeline.
         It is a method on Optional.

     */
    public static void main(String[] args) {
        Stream.generate(() -> 'a')
        .limit(5)
      .filter(c -> c < 'b')
        .sorted()
      .findFirst()
      .ifPresent(System.out::print);
    }
    
}