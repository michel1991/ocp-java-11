package stream.errors;
import java.util.*;

public class ForEachReturnVoid {
    /**
      What is the result of the following?
        A. It prints just one line.
        B. It prints one line and then the number 3.
        C. There is no output.
        D. The code does not compile.
        E. The code compiles but throws an exception at runtime.
        
        This code attempts to use two terminal operations, forEach() and count().
        Only one terminal operation is allowed, so the code does not compile,
        and option D is correct. The author of this code probably intended
        to use peek() instead of forEach().
        With this change, the answer would be option A.
     */
    public static void main(String ... args){
        var dice = new TreeSet<Integer>();
        dice.add(6);
        dice.add(6);
        dice.add(4);

        dice.stream()
           .filter(n -> n != 4)
           .forEach(System.out::println)
           .count();
    }
}