package stream.runtime;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
* What could be the output of the following?

    A. true false
    B. true true
    C. java.util.stream.ReferencePipeline$3@4517d9a3
    D. The code does not compile.
    E. An exception is thrown.
    F. The code hangs.

   Both streams created in this code snippet are infinite streams.
   The variable b1 is set to true since anyMatch() terminates. Even though the stream is infinite, Java finds a match on the first element and stops looking.
   However, when allMatch() runs, it needs to keep going until the end of the stream since it keeps finding matches.
   Since all elements continue to match, the program hangs.
 */
public class CodeHangsAllMatchInIfiniteStream {
    /**
     * does not run this code it will run indefinitely
     */
   static void find(){
       Predicate<String> predicate = s -> s.startsWith("g");
       var stream1 = Stream.generate(() -> "growl!");
       var stream2 = Stream.generate(() -> "growl!");
       var b1 = stream1.anyMatch(predicate);
       var b2 = stream2.allMatch(predicate);
       System.out.println(b1 + " " + b2);
   }

    /**
    *  Which of the following can fill in the blank so that the code prints out false?
        A. allMatch
        B. anyMatch
        C. findAny
        D. findFirst
        E. noneMatch
        F. None of the above

      Options C and D do not compile because these methods do not take a Predicate parameter and do not return a boolean.
      When working with streams, it is important to remember the behavior of the underlying functional interfaces.
      Options B and E are incorrect. While the code compiles, it runs infinitely.
      The stream has no way to know that a match won’t show up later.
      Option A is correct because it is safe to return false as soon as one element passes through the stream that doesn’t match.

     */
    static void allMatchMeow(){
        var s = Stream.generate(() -> "meow");
        var match = s. allMatch(String::isEmpty); // .________________(
        System.out.println(match);
    }
}