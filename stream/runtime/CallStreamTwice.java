package stream.runtime;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class CallStreamTwice {

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
    static void callTwiceIterate(){
        Predicate<String> predicate = s -> s.length() > 3;
        var stream = Stream.iterate("-",s -> ! s.isEmpty(), (s) -> s + s);
        var b1 = stream.noneMatch(predicate);
        var b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);
    }

    /**
    * What is the output of the following?
    *
        A. {} {}
        B. {} {false=[], true=[]}
        C. {false=[], true=[]} {}
        D. {false=[], true=[]} {false=[], true=[]}
        E. The code does not compile.
        F. An exception is thrown.

       The code tries to use the same stream twice. This is not allowed, and it throws an exception that the stream has already been operated on or closed.
     */
    static void callTTwicePartitioningByAndGroupingBy(){
        Stream<String> s = Stream.empty();
        var p = s.collect(Collectors.partitioningBy(
                b -> b.startsWith("c")));
        var g = s.collect(Collectors.groupingBy(
                b -> b.startsWith("c")));
        System.out.println(p + " " + g);
    }

    /**
     * What is true of the following code?
        A. The code runs without error and prints 0.
        B. The code runs without error and prints 1.
        C. The code throws an exception on line 23.
        D. The code throws an exception on line 24.
        E. The code throws an exception on line 25.
        F. The code throws an exception on line 26.

       A stream cannot be used again once it is executed.
       Line 21 creates a stream. Line 22 creates a second stream;
       however, the reference is lost on line 23.
       Lines 23 and 24 add intermediate operations to the stream
       that was created on line 21. Due to lazy evaluation,
       they do not run it. Line 25 does execute the stream pipeline and prints 0.
       However, line 26 attempts to execute the same stream
        and throws an IllegalStateException. This matches option F.


     */
    static void callByChangingReference(){
        Stream<Integer> s1 = Stream.of(8, 2); //  21:
        Stream<Integer> s2 = Stream.of(10, 20); //   22:
        s2 = s1.filter(n -> n > 4); //   23:
        s1 = s2.filter(n -> n < 1); //  24:
        System.out.println(s1.count()); // 25:
        System.out.println(s2.count()); //  26:

    }



    public static void main(String... args){
        try{
            callTwiceIterate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println();

        try{
            callTTwicePartitioningByAndGroupingBy();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}