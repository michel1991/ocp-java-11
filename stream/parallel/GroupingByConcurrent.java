package stream.parallel;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;

/**
  * Which statement about the following code snippet is correct?
*   A. It outputs 3 4.
    B. It outputs 4 3.
    C. The code will not compile because of line 6.
    D. The code will not compile because of line 7.
    E. The code will not compile because of line 8.
    F. It compiles but throws an exception at runtime.

   The code compiles and runs without issue, so options C, D, E, and F are incorrect.
   The collect() operation groups the animals into those that do and do not start with the letter p.
   Note that there are four animals that do not start with the letter p and three animals that do.
   The logical complement operator (!) before the startsWith() method means that results are reversed, so the output is 3 4 and option A is correct, making option B incorrect.
 */
public class GroupingByConcurrent {
   static void grouping(){
       var cats = Stream.of("leopard", "lynx", "ocelot", "puma") // 2:
       .parallel();  // 3:
       var bears = Stream.of("panda","grizzly","polar").parallel(); // 4:
       var data = Stream.of(cats,bears).flatMap(s -> s) //   5:
       .collect(Collectors.groupingByConcurrent(  // 6:
               s -> !s.startsWith("p"))); //  7:
       System.out.println(data.get(false).size()  // 8:
                          + " " + data.get(true).size()); // 9:
   }

    public static void main(String... args){
       grouping();
   }
}