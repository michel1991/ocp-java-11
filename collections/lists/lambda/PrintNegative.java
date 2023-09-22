package collections.lists.lambda;
import java.util.*;
import java.util.function.*;

/**
 * How many lines does this code output?
    A. One.
    B. Two.
    C. Three.
    D. None. It doesn’t compile.
    
E. None. It throws an exception at runtime.
This is a correct example of using lambdas.
The code creates an ArrayList with three elements.
Both lambdas are correct.
The code removes any negative numbers
and prints out the remaining two numbers, 0 and 5, making option B correct.

 */
public class PrintNegative {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(0);
        list.add(5);
        list.removeIf(e -> e < 0);
        list.forEach(x -> System.out.println(x));
    }
}