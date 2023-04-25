package stream.errors;
import java.util.*;
import java.util.stream.*;

public class NotStream {
    /**
       What is the output of this code?
        A. bloat
        B. BLOAT
        C. one
        D. ONE
        E. The code does not compile due to line x.
        F. None of the above.

      There is no source in this attempt at a stream pipeline.
      While a Collection does have some of the same methods as a stream,
      such as forEach(), the limit() method is not one of them,
      so the code as written causes a compile error.
      Since this error is not on line x, option F is the answer.
      If stream() were inserted before limit(), then ONE would be printed.
     */
   static void notStream(){
       List.of("one", "two", "bloat")
           .limit(1)
           .map(String::toUpperCase)       // line x
           .sorted()
           .forEach(System.out::println);
       
   }
}