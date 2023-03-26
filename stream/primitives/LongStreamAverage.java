package stream.primitives;
import java.util.*;
import java.util.stream.*;

public class LongStreamAverage {
    /**
       Which of the following sets result to 8.0? (Choose all that apply.)
       A.
            double result = LongStream.of(6L, 8L, 10L)
               .mapToInt(x -> (int) x)
               .collect(Collectors.groupingBy(x -> x))
               .keySet()
               .stream()
               .collect(Collectors.averagingInt(x -> x));

      B.
        double result = LongStream.of(6L, 8L, 10L)
           .mapToInt(x -> x)
           .boxed()
           .collect(Collectors.groupingBy(x -> x))
           .keySet()
           .stream()
           .collect(Collectors.averagingInt(x -> x));

      C.
        double result = LongStream.of(6L, 8L, 10L)
           .mapToInt(x -> (int) x)
           .boxed()
           .collect(Collectors.groupingBy(x -> x))
           .keySet()
           .stream()
           .collect(Collectors.averagingInt(x -> x));

    D.
        double result = LongStream.of(6L, 8L, 10L)
           .mapToInt(x -> (int) x)
           .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
           .keySet()
           .stream()
           .collect(Collectors.averagingInt(x -> x));

    E.
        double result = LongStream.of(6L, 8L, 10L)
           .mapToInt(x -> x)
           .boxed()
           .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
           .keySet()
           .stream()
           .collect(Collectors.averagingInt(x -> x));

    F.
        double result = LongStream.of(6L, 8L, 10L)
           .mapToInt(x -> (int) x)
           .boxed()
           .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
           .keySet()
           .stream()
           .collect(Collectors.averagingInt(x -> x));

       Yes, we know this question is a lot of reading. Remember to look for the differences between
       options rather than studying each line. These options all have much in common.
       All of them start out with a LongStream and attempt to convert it to an IntStream.
       However, options B and E are incorrect because they do not cast the long to an int,
       resulting in a compiler error on the mapToInt() calls.
       Next, we hit the second difference. Options A and D are incorrect because they are missing boxed() before the collect() call.
       Since groupingBy() is creating a Collection, we need a nonprimitive Stream.
       The final difference is that option F specifies the type of Collection.
       This is allowed, though, meaning both options C and F are correct.
     */
  static void average(){
        double result = LongStream.of(6L, 8L, 10L)
                                   .mapToInt(x -> (int) x)
                                   .boxed()
                                   .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                                   .keySet()
                                   .stream()
                                   .collect(Collectors.averagingInt(x -> x))
        ;

        double result2 = LongStream.of(6L, 8L, 10L)
                                   .mapToInt(x -> (int) x)
                                   .boxed()
                                   .collect(Collectors.groupingBy(x -> x))
                                   .keySet()
                                   .stream()
                                   .collect(Collectors.averagingInt(x -> x));


  }

}