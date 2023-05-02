package stream.collectToMap;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class ToMapOperation {
    
    /**
      What is true of the following? (Choose two.)
        A. The output is 2 bark.
        B. The output is 2 meow.
        C. The output is 4 bark.
        D. The output is 4 meow.
        E. If "meow" was replaced by a null reference, the output would remain the same.
        F. If "meow" was replaced by a null reference, the output would change.
        
        This code does compile. Remember that imports are implied, including the static import for Collectors.
        The collector tries to use the number of characters in each stream element as the key in a map.
        This works fine for the first two elements, speak and bark, because they are of length 5 and 4, respectively.
        When it gets to meow, it sees another key of 4.
        The merge function says to use the first one, so it chooses bark for the value.
        Similarly, growl is 5 characters, but the first value of speak is used.
        There are only two distinct lengths, so option A is correct.
        If the stream had a null instead of "meow", the code would throw a NullPointerException,
        since we need to check the length of the String to determine which part of the Map it goes in.
        Since you cannot call a method on null, option F is correct.
     */
  static void groupByLengthAndHandleDataDuplication(){
      var s = Stream.of("speak", "bark", "meow", "growl");
      BinaryOperator<String> merge = (a, b) -> a;
      var map = s.collect(toMap(String::length, k -> k, merge));
      System.out.println(map);
      System.out.println(map.size() + " " + map.get(4));
  }
    
    public static void main(String... args){
      groupByLengthAndHandleDataDuplication();
  }
}