package stream.sorted.errors;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class BadComparartorInSorted {
    /**
       What is the output of the following?
        A. over the river
        B. through the woods
        C. to grandmother's house we go
        D. None of the above

        The sorted() method allows an optional Comparator to be passed as a reference.
        However, Comparator.reverseOrder() does not implement
        the Comparator interface. It takes zero parameters instead of the required two.
        Since it cannot be used as a method reference, the code does not compile, and option D is correct.
     */
   static void sorted(){
       var s = Stream.of("over the river",
                         "through the woods",
                         "to grandmother's house we go");

       s.filter(n -> n.startsWith("t"))
           .sorted(Comparator::reverseOrder)
           .findFirst()
           .ifPresent(System.out::println);
   }
}