package stream.mapping;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class CalculateSumFromStreamToDoubleStream {
    /**
     * What is the output of the following code snippet?
        A. 6
        B. 7.0
        C. 6.0
        D. 7
        E. Exactly one line contains a compiler error.
        F. More than one line contains a compiler error.

    The code compiles, so options E and F are incorrect.
    The stream operations on lines 12–13 reduce the stream to the values [2, 3, 4].
    Line 14 then converts the Stream˂Integer˃ to an IntStream.
    On line 15, the first element of the IntStream is skipped,
    so the stream has only two elements [3, 4]. On line 16–17,
    the IntStream is converted to a Stream<Integer>, then a DoubleStream.
    Finally, on lines 18–19 the sum of the remaining elements is calculated and printed.
    Since 7.0 is printed, option B is correct.


     */
   static void makeSum(){
       var pears = List.of(1, 2, 3, 4, 5, 6); // 10:
       final var sum = pears.stream() //  11: 
        .skip(1) //    12:
          .limit(3) // 13: 
      .flatMapToInt(s -> IntStream.of(s)) //     14: 
      .skip(1) //     15: 
          .boxed() //  16:
        .mapToDouble(s -> s) //   17: 
         .sum(); //   18:
       System.out.print(sum); //  19:
   }
    
    public static void main(String... args){
       makeSum();
   }
}