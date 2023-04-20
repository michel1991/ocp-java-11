package stream.partitioning;
import java.util.stream.*;
import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.Map.*;
import java.util.function.*;

public class Partitionings {
    /**
    *   Which of the following statements are true about this code? (Choose all that apply.)

        A. It outputs: {}
        B. It outputs: {false=[], true=[]}
        C. If we changed line 31 from partitioningBy(notEmpty) to groupingBy(n -> n), it would output: {}
        D. If we changed line 31 from partitioningBy(notEmpty) to groupingBy(n -> n), it would output: {false=[], true=[]}
        E. The code does not compile.
        F. The code compiles but does not terminate at runtime.

        First, this mess of code does compile.
        While this code starts out with an infinite stream on line 23, it does become finite on line 24 thanks to limit(), making option F incorrect.
        The pipeline preserves only nonempty elements on line 25. Since there aren’t any of those, the pipeline is empty.
        Line 26 converts this to an empty map.
        Lines 27 and 28 create a Set with no elements and then another empty stream.
        Lines 29 and 30 convert the generic type of the Stream to List<String> and then String.
        Finally, line 31 gives us another Map<Boolean, List<String>>.
        The partitioningBy() operation always returns a map with two Boolean keys, even if there are no corresponding values.
        Therefore, option B is correct if the code is kept as is.
        By contrast, groupingBy() returns only keys that are actually needed, making option C correct if the code is modified on line 31.
     */
  static void makeWithGenerate(){
        Predicate<String> empty = String::isEmpty; // 20:
        Predicate<String> notEmpty = empty.negate(); //   21:
        //22:
        var result = Stream.generate(() -> "") //   23:
           .limit(10) // 24
            .filter(notEmpty) // 25
            .collect(Collectors.groupingBy(k -> k)) // 26
            .entrySet() // 27
            .stream() // 28
            .map(Entry::getValue) // 29
            .flatMap(Collection::stream) // 30
            .collect(Collectors.partitioningBy(notEmpty)); // 31:
            System.out.println(result);  //  32:
  }

    /**
     *  What is true of this code? (Choose two.)
        A. It outputs {true=[true]}.
        B. It outputs {false=null, true=[true]}.
        C. It outputs {false=[], true=[true]}.
        D. It outputs {false=[null], true=[true]}.
        E. The output is the same if line k is removed.
        F. The output is different after line k is removed.

       The first intermediate operation, limit(1), gets rid of the null.
       The partitioningBy() method returns a map with two keys, true and false,
       regardless of whether any elements actually match.
       If there are no matches, the value is an empty list,
       making option C correct. If line k is removed,
       the code throws a NullPointerException,
       since null is nether true nor false. Therefore, option F is the other answer.

     */
    static void withBool(){
        var bools = Stream.of(Boolean.TRUE, null);
        var map = bools
                   .limit(1)    // line k
                   .collect(partitioningBy(b -> b));
                        System.out.println(map);

    }

    public static void main(String... args){
        makeWithGenerate();
    }
}