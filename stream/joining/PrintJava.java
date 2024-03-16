package stream.joining;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class PrintJava {
    /**
     * Given:
     
      Which of the following code fragments when inserted in the above code independent of each other will cause it to print java?
      
      A. letters.stream().reduce("", (a, b)->a.concat(b)).get();
        This will not compile. There are three flavors of reduce method. The one used here directly returns
        the final result instead of returning an Optional containing the result.
        So the call to get() will cause compilation failure.
        
        public T reduce(T identity, BinaryOperator<T> accumulator)
        Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function,
        and returns the reduced value. This is equivalent to:
             T result = identity;
             for (T element : this stream)
                 result = accumulator.apply(result, element)
             return result;
        
        but is not constrained to execute sequentially.
        The identity value must be an identity for the accumulator function.
        This means that for all t, accumulator.apply(identity, t) is equal to t.
        The accumulator function must be an associative function.
        This is a terminal operation.
        
       B.  letters.stream().collect(Collectors.joining());
       C.  letters.stream().collect(Collectors.groupingBy(a->a)).toString();
             Although this will compile fine, it will print: {a=[a, a], v=[v], j=[j]}
       D. letters.stream().collect(Collectors.groupingBy(a->"")).toString();
             Although this will compile fine, it will print: {=[j, a, v, a]}
             
        (Correct B)
     */
    public static void main(String... args){
        List<String> letters = Arrays.asList("j", "a", "v","a");
        String word = letters.stream().collect(Collectors.joining());  // INSERT CODE HERE
        System.out.println(word);
    }
}