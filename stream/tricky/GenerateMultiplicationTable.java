package stream.tricky;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

/**
 Given:
    public static void generateMultiplicationTable(int number){
        Stream<Integer> sin = Stream.of(1, 2, 3 );
        Consumer<Integer> c1 = System.out::print;
        Consumer<Integer> c2 = x->{ System.out.println(" * "+number+" = "+x*number); };
    
        INSERT CODE HERE
    }
    public static void main(String[] args) throws Exception{
        generateMultiplicationTable(2);
    }

   Which of the options, when inserted in the above code, will produce the following output:

    1 * 2 = 2
    2 * 2 = 4
    3 * 2 = 6
    
    A. sin.forEach(c1).forEach(c2);
    This will not compile because forEach is a terminal operation.
    It does not return Stream. So, another forEach cannot be chained to it.
    
    B. sin.forEach(c1.andThen(c2));
    C. sin.forEach(c2.and(c1));
    and is not a valid method in Consumer.
    D. sin.forEach(c2.andThen(c1));
        This will print:
        * 2 = 2
        1 * 2 = 4
        2 * 2 = 6
        3
    E. sin.forEach(c1);
    sin.forEach(c2);
    forEach is a terminal operation.
    So, calling forEach on sin the second time will cause an  java.lang.IllegalStateException
    with message, "stream has already been operated upon or closed" to be thrown.
     
    Correct(B)
 */
public class GenerateMultiplicationTable {
    public static void generateMultiplicationTable(int number){
        Stream<Integer> sin = Stream.of(1, 2, 3 );
        Consumer<Integer> c1 = System.out::print;
        Consumer<Integer> c2 = x->{ System.out.println(" * "+number+" = "+x*number); };
    
        // INSERT CODE HERE
        sin.forEach(c1.andThen(c2));
    }
    
    public static void main(String[] args) throws Exception{
        generateMultiplicationTable(2);
    }
    
}