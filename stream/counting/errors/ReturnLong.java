package stream.counting.errors;
import java.util.*;
import java.util.stream.*;

/**
 * What will the following code print when compiled and run?
    A. 2
    B. 3
    C. Exception at run time.
    D. Compilation failure
    E. Collector.counting returns a Collector that returns a long.
        You cannot assign it to an int without a cast.
        If you make it long, it will print 2 because there are two elements with length greater than 4
    --------------------------
    public static <T> Collector<T,?,Long> counting()
    Returns a Collector accepting elements of type T that counts the number of input elements.
    If no elements are present, the result is 0.
    correct(D)
 */
public class ReturnLong {
    public static void main(String... args){
        List<String> names = Arrays.asList("charles", "chuk", "cynthia", "cho", "cici");
        int x = names.stream().filter(name->name.length()>4).collect(Collectors.counting());
        System.out.println(x);
    }
}