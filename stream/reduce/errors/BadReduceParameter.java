package stream.reduce.errors;
import java.util.*;
import java.util.function.*;

public class BadReduceParameter {

    /**
    * Question: What statements about the following code are true? (Choose all that apply.)
    * A. A. It compiles and runs without issue, outputting the total length of all strings in the stream.
    * B. The code will not compile because of line q1.
    * C. The code will not compile because of line q2.
    * D. The code will not compile because of line q3.
    * E. It compiles but throws an exception at runtime.
    * F. None of the above
    *
    * The code does not compile, so options A and E are incorrect.
    * The problem here is that c1 is an int and c2 is a String, so the code fails to combine on line q2, since calling length() on an int is not allowed, and option C is correct.
    * The rest of the lines compile without issue. Note that calling parallel() on an already parallel stream is allowed, and it may in fact return the same object.
     */
   static void reduce(){
       System.out.print(List.of("duck","flamingo","pelican")
       .parallelStream().parallel()   // q1
       .reduce(0,
               (c1, c2) -> c1.length() + c2.length(),   // q2
               (s1, s2) -> s1 + s2));   // q3
   }

    /**
     * What is the output of the following program?
        A. 0
        B. 12
        C. 14
        D. One line does not compile.
        E. Two lines do not compile.
        F. None of the above.

     Based on the reduction operation, the data types of w, y, and z are Integer,
     while the data type of x is StringBuilder. Since Integer does not define a length() method,
     both the accumulator and combiner lambda expressions are invalid, making option E correct.

     */
    static void reduceHello(){
        var p = List.of(new StringBuilder("hello"),
                        new StringBuilder("goodbye"));
        var q = p.parallelStream()
                 .reduce(0,
                         (w,x) -> w.length() + x.length(),
                       (y,z) -> y.length() + z.length());
        System.out.print(q);

    }

    public static void main(String... args){

   }
}