/**
 * What is the output of the following?
    A. 2-2
    B. 200-1
    C. 500-0
    D. 500-2
    E. The code does not compile.
    F. The code compiles but throws an exception at runtime.
    
    When summing int primitives, the return type is also an int.
    Since a long is larger, you can assign the result to it,
    so line 7 is correct.
    All the primitive stream types use long as the return type for count().
    Therefore, the code compiles, and option E is incorrect.
    When actually running the code, line 8 throws an IllegalStateException
    because the stream has already been used.
    Both sum() and count() are terminal operations,
    and only one terminal operation is allowed on the same stream.
    Therefore, option F is the answer.

 */
package stream.primitives.runtime; // 1
import java.util.stream.*; // 2: 
//3:
public class Books { // 4:
    public static void main(String[] args) { //   5:  
        IntStream pages = IntStream.of(200, 300); //   6: 
        long total = pages.sum(); //  7:  
        long count = pages.count(); //   8: 
        System.out.println(total + "-" + count); //   9:  
    } //    10: 
} //     11: