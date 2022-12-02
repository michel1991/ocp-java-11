package stream.runtime;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

/**
* What could be the output of the following?
    A. false false
    B. false true
    C. java.util.stream.ReferencePipeline$3@4517d9a3
    D. The code does not compile.
    E. An exception is thrown.
    F. The code hangs.

   An infinite stream is generated where each element is twice as long as the previous one.
   While this code uses the three-parameter iterate() method, the condition is never false.
   The variable b1 is set to false because Java finds an element that matches when it gets to the element of length 4.
   However, the next line tries to operate on the same stream.
   Since streams can be used only once, this throws an exception that the “stream has already been operated upon or closed.”
   If two different streams were used, the result would be option B.
 */
public class CallStreamTwiceIterate {
    static void callTwice(){
        Predicate<String> predicate = s -> s.length() > 3;
        var stream = Stream.iterate("-",s -> ! s.isEmpty(), (s) -> s + s);
        var b1 = stream.noneMatch(predicate);
        var b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);
    }

    public static void main(String... args){
        callTwice();
    }
}