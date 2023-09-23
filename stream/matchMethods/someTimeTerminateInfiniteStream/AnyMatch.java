package stream.matchMethods.someTimeTerminateInfiniteStream;
import java.nio.file.*;
import java.util.stream.*;
import java.util.*;
import java.io.*;


public class AnyMatch {
    
    /**
     * Which can fill in the blank to have the code print true?
     
        A. anyMatch
        B. allMatch
        C. noneMatch
        D. None of the above
        
        This code generates an infinite stream of integers: 1, 2, 3, 4, 5, 6, 7, etc.
        The Predicate checks if the element is greater than 5.
        
        With anyMatch(), the stream pipeline ends once element 6 is hit,
        and the code prints true.
        For the allMatch() operator, it sees that the first element in the stream does not match,
        and the code prints false.
        
        Similarly, the noneMatch()
        operator gets to the point where i is 6 and returns false because there is a match.
        Therefore, option A is correct.

     */
    static void correctResponse(){
        var stream = Stream.iterate(1, i -> i+1);
        Console c = System.console();
        System.out.println(" Begin Flow Any Match Correct Response ");
        var b = stream
                   .peek((v) -> System.out.println("\t " +v)) // i add peek
                   .anyMatch(i -> i > 5); // ________
        if( c != null){
            c.format(" \t From console Final correct responses is %s:  \n", b);
        }else{
            System.out.println(b); 
        }
      
        System.out.println(" End Flow Any Match Correct Response ");
    }
    
    static void flowWithNonenMatch(){
        System.out.println();
        System.out.println(" Begin Flow None Match");
        var stream = Stream.iterate(1, i -> i+1);
        var b = stream
             .peek((v) -> System.out.println("\t " +v)) // i add peek
             .noneMatch(i -> i > 5); // ________
        System.out.println(" \t With none match final response is: "+b);
        System.out.println(" End Flow None Match");
    }
    
    public static void main(String... args){
       correctResponse();
       flowWithNonenMatch();
    }
}