package stream.parallel.errors;
import java.util.stream.*;
import java.util.*;
import java.util.concurrent.atomic.*;

public class CallParallelManyTimeIsUnnecessary {
    /**
     *  Given the following independent stream operations, which statements are correct? (Choose three.)
        A. The first stream operation compiles.
        B. The second stream operation compiles.
        C. The third stream operation compiles.
        D. None of the stream operations that compile produce an exception at runtime.
        E. At least one of the stream operations that compiles produces at exception at runtime.
        F. The output of the stream operations that compile is consistent between executions.

        While the second and third stream operations compile, the first does not.
        The parallel() method should be applied to a stream, while the parallelStream()
        method should be applied to a Collection<E>. For this reason, option A is incorrect,
        and options B and C are correct. Neither the second or third stream operation are expected
        to produce an exception at runtime,
        making option D correct and option E incorrect.
        Note that calling parallel() on an already parallel stream is unnecessary but allowed.
        Finally, the output of the second and third stream operations
        will vary at runtime since the streams are parallel, making option F incorrect.
     */
   static void many(){
       List.of(2,4,6,8)
       .parallel()
       .parallelStream()
       .forEach(System.out::print);

           List.of(2,4,6,8)
       .parallelStream()
       .parallel()
       .forEach(System.out::print);

           List.of(2,4,6,8)
       .parallelStream()
       .parallel().parallel().parallel()
       .forEach(System.out::print);

   }
}