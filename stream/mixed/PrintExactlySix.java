package stream.mixed;
import java.util.stream.*;
import java.util.*;

/**
 
 Given:
    List<Integer> names = Arrays.asList(1, 2, 3);

    How many of the following lines will print exactly 6?
    
    1. System.out.println(names.stream().mapToInt(x->x).sum());
    
    2. System.out.println(names.stream().forEach((sum, x)->sum = sum + x));
    
    3. System.out.println(names.stream().reduce(0, (a, b)->a+b));
    
    4. System.out.println(names.stream().collect(
        Collectors.mapping(x->x, Collectors.summarizingInt(x->x))).getSum());
    
    5. System.out.println(names.stream().collect(
        Collectors.summarizingInt(x->x)).getSum());
        
   A.  1
   B.  2
   C.  3
   D.  4
   E.  5
   
   System.out.println(names.stream().mapToInt(x->x).sum());
    mapToInt will return an IntStream, which has a sum method. It will, therefore, print 6.

    System.out.println(names.stream().forEach((sum, x)->sum = sum + x));
    This will not compile because forEach expects a Consumer. A Consumer takes exactly one argument. Not two.

    System.out.println(names.stream().reduce(0, (a, b)->a+b));
    Here, we are passing the starting value 0 and a BinaryOperator that adds the two arguments and returns the result.
    It will therefore sum up all the elements in the stream. It will, therefore, print 6.

    System.out.println(names.stream().collect(Collectors.mapping(x->x,
        Collectors.summarizingInt(x->x))).getSum());
    System.out.println(names.stream().collect(Collectors.summarizingInt(x->x)).getSum());

    Both the lines are doing the same thing. The first line maps elements of the original stream to the int elements.
    This is redundant but is not an error. The summarizingInt collector applies an int-producing mapping function to each input element,
    and returns summary statistics for the resulting values. The result is captured in an IntSummaryStatistics object,
    which has a getSum method. The function x->x basically just unboxes the Integer objects to an ints.


 */
public class PrintExactlySix {
    public static void main(String... args){
        List<Integer> names = Arrays.asList(1, 2, 3);
        System.out.println(names.stream().mapToInt(x->x).sum()); // 1.
        //System.out.println(names.stream().forEach((sum, x)->sum = sum + x)); // 2
        System.out.println(names.stream().reduce(0, (a, b)->a+b)); // 3
        System.out.println(names.stream().collect(
        Collectors.mapping(x->x, Collectors.summarizingInt(x->x))).getSum()); // 4
        System.out.println(names.stream().collect(
                Collectors.summarizingInt(x->x)).getSum()); // 5
    }
}