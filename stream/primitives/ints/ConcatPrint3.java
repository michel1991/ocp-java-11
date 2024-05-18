package stream.primitives.ints;
import java.util.*;
import java.util.stream.*;

public class ConcatPrint3 {
    /**
       What will the following code print when compiled and run?
       
        A. [1]
        B. [3]
        C. [3, 3]
        D. [2]
        E. [1, 2]
        
       -------------------------------------------------
           There are several things going on here:
            1. IntStream.range returns a sequential ordered IntStream from startInclusive (inclusive)
        to endExclusive (exclusive) by an incremental step of 1.
        Therefore, is1 contains 1, 2.
            2. IntStream.rangeClosed returns a sequential ordered IntStream from startInclusive (inclusive) to endInclusive (inclusive)
         by an incremental step of 1. Therefore, is2 contains 1, 2, 3.
            3. IntStream.concat returns a lazily concatenated stream whose elements are all the elements
        of the first stream followed by all the elements of the second stream. Therefore, is3 contains 1, 2, 1, 2, 3.
            4. is3 is a stream of primitive ints. is3.boxed() returns a new Stream containing Integer objects instead of primitives.
        This allows the use various flavors of collect method available in non-primitive streams.
        [IntStream does have one collect method but it does not take a Collector as argument.]
            5. Collectors.groupingBy(k->k) creates a Collector that groups the elements of the stream
        by a key returned by the function k->k, which is nothing but the value in the stream itself.
        Therefore, it will group the elements into a Map<Integer, List<Integer>> containing: {1=[1, 1], 2=[2, 2], 3=[3]}
            6. Finally, get(3) will return [3].
                Correct(B)

     */
    public static void main(String... args){
        IntStream is1 = IntStream.range(1, 3);
        IntStream is2 = IntStream.rangeClosed(1, 3);
        IntStream is3 = IntStream.concat(is1, is2);
        Object val = is3.boxed().collect(Collectors.groupingBy(k->k)).get(3);
        System.out.println(val);
    }
}