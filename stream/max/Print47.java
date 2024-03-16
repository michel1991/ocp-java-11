package stream.max;
import java.util.*;
import java.util.stream.*;

public class Print47 {
    /**
     * Given:
       Which of the following options can be inserted above so that it will print the largest number in the input stream?
      
       A.
          ls.stream().map(a->a).max();
            This will not compile because the max method requires an argument of type Comparator.
            Also, map(a->a) is redundant here.
            
       B.
          ls.stream().max(Comparator.comparing(a->a)).get();
          
          Comparator.comparing method requires a Function that takes an input and returns a Comparable.
          This Comparable, in turn, is used by the comparing method to create a Comparator.
          The max method uses the Comparator to compare the elements int he stream.
          
            The lambda expression a->a creates a Function that takes an Integer and returns an Integer (which is a Comparable).
            Here, the lambda expression does not do much but in situations where you have
            a class that doesn't implement Comparable and you want to compare objects
            of that class using a property of that class that is Comparable, this is very useful.
            
            The call to get() is required because max(Comparator ) return an Optional object.
            
        C.  ls.stream().reduce((a, b)->a>b?a:b);
            This is actually a valid lambda expression that implements BinaryOperator but
            the return type of the reduce method used here is Optional.
            Therefore, it will return Optional object containing Integer 47 instead of just Integer 47 and you cannot assign
            an object of class Optional to a variable of type int.
            You need to use the reduce method that takes identity value as the first element:
            ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b)
            This will return an Integer object, which can be assigned to max.
            
        D. All of above.
        F. None of the above.
        
       The Stream.reduce method needs a BinaryOperator. This interface is meant to consume two arguments and produce one output.
       It is applied repeatedly on the elements in the stream until only one element is left.
       The first argument is used to provide an initial value to start the process.
       (If you don't pass this argument, a different reduce method will be invoked and that returns an Optional object. )
       
       Correct(B)

     */
    public static void main(String... args){
        
      
        List<Integer> ls = Arrays.asList(10, 47, 33, 23);
        
        int max = ls.stream().max(Comparator.comparing(a->a)).get();  //INSERT code HERE
        System.out.println(max); //1
    }
}