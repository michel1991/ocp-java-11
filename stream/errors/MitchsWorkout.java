package stream.errors;
import java.util.stream.*;
import jaba.util.*;

/**
   Given the following code snippet, what statement about the values printed on lines q1 and q2 is correct?
    A. They are always the same.
    B. They are sometimes the same.
    C. They are never the same.
    D. The code does not compile.
    E. The code will produce a ConcurrentModificationException at runtime.
    F. None of the above.

    The forEachOrdered() method is available on streams, not collections.
    For this reason, line q1 does not compile, and option D is correct.
    If the forEach() method was used instead, then the code would compile with the values printed
    on line q1 varying at runtime and the values printed on line q2 being consistent.

 */
public class MitchsWorkout {
    public static void findError(){
        var mitchsWorkout = new CopyOnWriteArrayList<Integer>();
        List.of(1,5,7,9).stream().parallel()
   .forEach(mitchsWorkout::add);
        mitchsWorkout
   .forEachOrdered(System.out::print);  // q1
        List.of(1,5,7,9).stream().parallel()
   .forEachOrdered(System.out::print);  // q2
    }
}