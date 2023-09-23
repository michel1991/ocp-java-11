package stream.findMethods;
import java.util.*;
import java.util.stream.*;

/**
   What is the output of the following application?
    A. 1 1
    B. 3 1
    C. The answer cannot be determined until runtime.
    D. The code does not compile.
    E. The code compiles but throws an exception at runtime.
    F. None of the above.

    The class compiles and runs without issue, so options D and E are incorrect.
    The result of findSlow() is deterministic and always 1.
    
    The findFirst() method returns the first element in an ordered stream,
    whether it be serial or parallel.
    
    This makes it a costly operation for a parallel stream,
    since the stream has to be accessed in a serial manner.
    
    On the other hand, the result of findFast() is unknown until runtime.
    The findAny() method may return the first element
    or any element in the stream, even on serial streams.
    
    Since both 1 1 and 3 1 are possible outputs of this program,
    the answer cannot be determined until runtime, and option C is the correct answer.
 */
public class QuickSolution {
    public static int findFast(Stream<Integer> s) {
        return s.findAny().get();
    }
    public static int findSlow(Stream<Integer> s) {
        return s.parallel().findFirst().get();
    }

    public static void main(String[] pencil) {
        var s1 = List.of(1,2,3,4,5).stream();
        var s2 = List.of(1,2,3,4,5).stream();
        int val1 = findFast(s1);
        int val2 = findSlow(s2);
        System.out.print(val1+" "+val2);
    }
}