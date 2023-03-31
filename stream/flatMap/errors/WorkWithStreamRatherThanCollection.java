package stream.flatMap.errors;
import java.util.stream.*;
import java.util.*;
import java.util.Map.*;
import java.util.function.*;

public class WorkWithStreamRatherThanCollection {
    /**
     What does the following output?
        A. [tire-][wheel-]
        B. tire-wheel-
        C. [wheel-][tire-]
        D. wheel-tire-
        E. None of the above.
        F. The code does not compile.
        
        The flatMap() method works with streams rather than collections.
        Line 18 is problematic because the return value is not a stream.
        Since the code does not compile, option F is correct.
        If the lambda was changed to x -˃ x.stream(), option B would be the answer.

     */
  static void flat(){
      Set<String>set = new HashSet<>(); // 12:
      set.add("tire-"); //  13: 
      List<String> list = new LinkedList<>(); // 14:
      Deque<String> queue = new ArrayDeque<>(); //   15:
      queue.push("wheel-"); // 16: 
      Stream.of(set, list, queue) //   17:
         .flatMap(x -> x) //  18:
         .forEach(System.out::print); //  19:
  }
}