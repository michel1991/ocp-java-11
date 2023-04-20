package stream.reduce;
import java.util.stream.*;
import java.util.*;

public class StreamWithAutoboxing {
    
    /**
     * What is the output of the following program?
        A. 0.0
        B. 9.0
        C. 11.0
        D. One line does not compile.
        E. Two lines do not compile.
        F. None of the above.
        
        Since it’s not a primitive stream, the underlying type is Stream<Integer>,
        which means the data type of x is Integer. On the other hand,
        the data type of w, y, and z is Float.
        Because Integer and Float both define a floatValue() method,
        all of the lines compile. The code snippet prints 9.0 at runtime,
        making option B correct.
     */
   static void reduceWithAutoBoxing(){
       var p = List.of(1,3,5);
       var q = p.parallelStream().reduce(0f,
                                         (w,x) -> w.floatValue() + x.floatValue(),
                                          (y,z) -> y.floatValue() + z.floatValue()
       );
       System.out.println(q);
       
   }
    public static void main(String... args){
       reduceWithAutoBoxing();
   }
}