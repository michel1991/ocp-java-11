package stream.flatMap;
import java.util.stream.*;
import java.util.*;

/**
 * Given:
        List<String> l1 = Arrays.asList("a", "b");
        List<String> l2 = Arrays.asList("1", "2");

   Which of the following lines of code will print the following output?
    a
    b
    1
    2
    
    A. Stream.of(l1, l2).forEach((x)->System.out.println(x));
        This will print :
        [a, b]
        [1, 2]
        
    B. Stream.of(l1, l2).flatMap((x)->Stream.of(x)).forEach((x)->System.out.println(x));
        This will print :
        [a, b]
        [1, 2]
        
    C. Stream.of(l1, l2).flatMap((x)->x.stream()).forEach((x)->System.out.println(x));
        The objective of flatMap is to take each element of the current stream and replace that element
        with elements contained in the stream returned by the Function that is passed as an argument to flatMap.
        It is perfect for the requirement of this question. You have a stream that contains Lists.
        So you need a Function object that converts a List into a Stream of elements.
        
        Now, List does have a method named stream() that does just that. It generates a stream of its elements.
        Therefore, the lambda expression x->x.stream() can be used here to create the Function object.
        
   D. Stream.of(l1, l2).flatMap((x)->x.iterator()).forEach((x)->System.out.println(x));
      This will not compile because the lambda expression (x)->x.iterator() will return an Iterator but we need a Stream.

 */
public class Printab12 {
    public static void main(String... args){
        List<String> l1 = Arrays.asList("a", "b");
        List<String> l2 = Arrays.asList("1", "2");
        Stream.of(l1, l2).flatMap((x)->x.stream()).forEach((x)->System.out.println(x));
    }
}