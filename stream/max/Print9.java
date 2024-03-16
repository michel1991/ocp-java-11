package stream.max;
import java.util.*;
import java.util.stream.*;

/**
 * Given:
 
     List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
    System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b)); //1
    System.out.println(ls.stream().max(Integer::max).get()); //2
    System.out.println(ls.stream().max(Integer::compare).get()); //3
    System.out.println(ls.stream().max((a, b)->a>b?a:b)); //4
    Which of the above statements will print 9?
    
    A. 1 and 4
    B. 2 and 3
    C. 1 and 3
    D. 2, 3, and 4
    E. All of them.
    F.  None of them.
   
    
    The code will print:
        9
        3
        9
        Optional[3]
        
        
        You need to understand the following points to answer this question:
        
        1. The reduce method needs a BinaryOperator. This interface is meant to consume two arguments and produce one output.
        It is applied repeatedly on the elements in the stream until only one element is left.
        The first argument is used to provide an initial value to start the process.
        (If you don't pass this argument, a different reduce method will be invoked and that returns an Optional object. )
        
        2. The Stream.max method requires a Comparator.
        All you need to implement this interface using a lambda expression is a reference to any
        method that takes two arguments and returns an int. The name of the method doesn't matter.
        That is why it is possible to pass the reference of Integer's max method as an argument to Stream's max method.
         However, Integer.max works very differently from Integer.compare.
         The max method returns the maximum of two numbers while the compare method returns a value less than 0, 0,
         or greater than 0 depending on whether first value is less than second, equal to second,
         or greater than second respectively. Therefore, when you pass Integer::max to Stream's max,
         you will not get the correct maximum element from the stream. That is why //2 will compile but will not work correctly.
        
        //4 is basically same as //2. It will not work correctly for the same reason.
        
        
        
        You may want to check out the free video by Dr. Sean Kennedy explaining this question: https://youtu.be/J1uPhk8mhZU
    
     Correct(C)
 */
public class Print9 {
    public static void main(String... args){
        List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b)); //1
        System.out.println(ls.stream().max(Integer::compare).get()); //3
    }
}