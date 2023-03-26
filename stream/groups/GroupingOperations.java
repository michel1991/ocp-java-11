package stream.groups;
import java.util.*;
import java.util.stream.*;

public class GroupingOperations {

    /**
    * Which option fills in the blank to make this code compile?
    *   A. List<String>
        B. Map<Boolean, List<String>>
        C. Map<Integer, List<String>>
        D. Map<String, List<String>>
        E. None of the above

    The groupingBy() method groups by whatever type the mapping function returns.
    In this case, that is an int, which is autoboxed to an Integer.
    Option C is correct as it has an Integer key and List return value.

     */
   static void groupByLength(){
       var s = Stream.of("bull", "cow");
       Map<Integer, List<String>> r = s.collect(Collectors.groupingBy(String::length));
       System.out.println(r);
   }

    public static void main(String... args){
       groupByLength();
   }
}