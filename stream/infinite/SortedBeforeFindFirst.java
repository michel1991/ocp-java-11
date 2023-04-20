package stream.infinite;
import java.util.stream.*;
import java.util.*;

public class SortedBeforeFindFirst {
    
    /**
     * What does the following output?

        A. a
        B. The code runs successfully without any output.
        C. The code does not complete.
        D. The code compiles but throws an exception at runtime.
    
    The source of this stream is infinite.
    Sorting something infinite never finishes, so the stream pipeline never completes.
     This corresponds to option C.


     */
  static void filter(){
      var chars = Stream.generate(() -> 'a');
      chars.filter(c -> c < 'b')
      .sorted()
     .findFirst()
     .ifPresent(System.out::print);
      
  }
}