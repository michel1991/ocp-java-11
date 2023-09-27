package stream.reduce.errors;
import java.util.*;
import java.util.function.*;

/**
 * What is the output of the following program?
    A. 0
    B. 0.0
    C. 7
    D. 7.0
    E. The code does not compile
    F. None of the above
    
    Since it’s not a primitive stream, the underlying type is Stream<Short>,
    which means the data type of b is Short. On the other hand,
    the data type of a, c, and d is Integer.
    Because Short and Integer both define a doubleValue() method,
    these statements compile. The problem is with the return type of the two lambda expressions.
    The identity is set as 0, not 0.0, so the expected return type of each lambda expression is Integer,
    not Double. For this reason, neither lambda expression matches
    the method parameters of the reduce() method, and option E is correct.
 */
public class Pillow {
    
    public static void main(String... args){
        var bed = List.of((short)2,(short)5);
        var pillow = bed.parallelStream()
                        .reduce(0,
                                 (a,b) -> b.doubleValue() + a.doubleValue(),
                                (c,d) -> d.doubleValue() + c.doubleValue()
        );
        System.out.println(pillow);
        
    }
}