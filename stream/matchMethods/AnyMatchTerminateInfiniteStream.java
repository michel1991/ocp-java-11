package stream.findMethods;
import java.nio.file.*;
import java.util.stream.*;
import java.util.*;


public class AnyMatchTerminateInfiniteStream {
    
    /**
     * Which can fill in the blank to have the code print true?
     
        A. anyMatch
        B. allMatch
        C. noneMatch
        D. None of the above
        
        This code generates an infinite stream of integers: 1, 2, 3, 4, 5, 6, 7, etc.
        The Predicate checks if the element is greater than 5.
        With anyMatch(), the stream pipeline ends once element 6 is hit, and the code prints true.
        For the allMatch() operator, it sees that the first element in the stream does not match,
        and the code prints false. Similarly, the noneMatch()
        operator gets to the point where i is 6 and returns false because there is a match.
        Therefore, option A is correct.

     */
    static void firstExample(){
        var stream = Stream.iterate(1, i -> i+1);
        var b = stream.anyMatch(i -> i > 5); // ________
        System.out.println(b);
    }
    
    public static void main(String... args){
        firstExample();
    }
}