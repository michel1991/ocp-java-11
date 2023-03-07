package stream.runtime;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class IntStreamAverageReturnOptionalDouble {
    /**
       What is the result of the following?

        A. Both statements print 0.
        B. Both statements print 0.0.
        C. The statements print different values.
        D. The code does not compile.
        E. The code compiles but throws an exception at runtime.

        The average() method returns an OptionalDouble.
        This interface has a getAsDouble() method rather than a get() method, so the code does compile.
        However, the stream is empty, so the optional is also empty.
        When trying to get the value on line 12, the code throws a NoSuchElementException, making option E correct.
     */
   static void makeAverage(){
       var s1 = IntStream.empty(); //  11:
       System.out.print(s1.average().getAsDouble()); // 12:
       // 13:
       var s2 = IntStream.of(-1,0, 1); //    14:
       System.out.print(s2.average().getAsDouble()); //  15:
   }

    public static void main(String... args){
        makeAverage();
    }
}