package stream.parallel;
import java.util.stream.*;
import java.util.*;

public class ForEachOrdered {
    /**
     * Which statements about the following code are correct? (Choose all that apply.)
        A. The peek() method will print the entries in the order: 1 2 5 8 9.
        B. The peek() method will print the entries in the order: 2 5 1 9 8.
        C. The peek() method will print the entries in an order that cannot be determined ahead of time.
        D. The forEachOrdered() method will print the entries in the order: 1 2 5 8 9.
        E. The forEachOrdered() method will print the entries in the order: 2 5 1 9 8.
        F. The forEachOrdered() method will print the entries in an order that cannot be determined ahead of time.

        The code compiles, so option G is incorrect. The peek() method on a parallel
        stream will process the elements concurrently,
        so the order cannot be determined ahead of time,
        and option C is correct. The forEachOrdered() method will process
        the elements in the order they are stored in the stream,
        making option E correct. It does not sort the elements, so option D is incorrect.
     */
    static void print25198(){
        var data = List.of(2,5,1,9,8);
           data
              .stream()
              .parallel()
               .mapToInt(s -> s)
               //.peek(System.out::println)
                .forEachOrdered(System.out::println);
    }

    public static void main(String[] args) {
        print25198();
    }
}