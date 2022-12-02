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
}