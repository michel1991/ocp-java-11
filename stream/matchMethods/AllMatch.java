package stream.matchMethods;
import java.util.*;
import java.util.stream.*;

public class AllMatch {
    /**
    * Which of the following can fill in the blank so that the code prints out false?
    *   A. allMatch
        B. anyMatch
        C. findAny
        D. findFirst
        E. noneMatch
        F. None of the above

    Options C and D do not compile because these methods do not
    take a Predicate parameter and do not return a boolean.
    When working with streams, it is important to remember
    the behavior of the underlying functional interfaces.
    Options B and E are incorrect. While the code compiles, it runs infinitely.
    The stream has no way to know that a match won’t show up later.
    Option A is correct because it is safe to return
    false as soon as one element passes through the stream that doesn’t match.

     */
   public static void runInfinitely(){
       var s = Stream.generate(() -> "meow");
       var match = s.allMatch(String::isEmpty);  // .________________
       System.out.println(match);
   }
    
    public static void main(String... args){
        runInfinitely();
    }
}