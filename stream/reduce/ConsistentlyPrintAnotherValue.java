package stream.reduce;
import java.util.stream.*;
import java.util.*;

/**
 *  Which statements about the following code are correct?
    A. It consistently prints 6.
    B. It consistently prints 7.
    C. It consistently prints another value.
    D. It does not consistently print the same value on every execution.
    E. It compiles but throws an exception at runtime.
    F. None of the above.
    
    The reduction is parallel, but since the accumulator and combiner are well-behaved (stateless and associative),
    the result is consistent, making option D incorrect. The identity is 1,
    which is applied to every element meaning the operation
    sums the values (1+1), (1+2), and (1+3). For this reason,
    9 is consistently printed at runtime, making option C correct.
 */
public class ConsistentlyPrintAnotherValue {
  static void reduce(){
      var data = List.of(1,2,3);
      int f = data.parallelStream()
                .reduce(1, (a,b) -> a+b, (a,b) -> a+b);
         System.out.println(f);
  }
    
    public static void main(String... args){
      reduce();
  }
}