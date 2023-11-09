package stream.primitives.longs;
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

   /**
     * Fill in the blanks so this code prints *8.0-8.0*? (Choose two.)
        A. averageAsDouble() in the first blank
        B. average().getAsDouble() in the first blank
        C. getAverage().get() in the first blank
        D. stats.average() in the second blank
        E. stats.average().get() in the second blank
        F. stats.getAverage() in the second blank

        Primitive streams, like LongStream, declare an average()
        method that returns an OptionalDouble object.
        This object declares a getAsDouble() method rather than a get() method.
        Therefore, option A is incorrect, and option B is correct.
        By contrast, the summary statistics classes provide getters in order to access the data.
        The getAverage() method returns a double and not an OptionalDouble,
        which makes option F correct. The other options do not compile.

     */
   static void choiceValidAnswer(){
       var ints = IntStream.of(6, 10);
       var longs = ints.mapToLong(i -> i);
       //var first = longs.________________;
      var first = longs.average().getAsDouble();

      var moreLongs = LongStream.of(6, 10);
      var stats = moreLongs.summaryStatistics();
      //var second = _________________________;
      var second = stats.getAverage();
      System.out.println("*" + first + "-" + second + "*");
    }

   public static void main(String... args){
       choiceValidAnswer();
    }

}