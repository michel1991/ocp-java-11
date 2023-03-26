package stream.matchMethods;
import java.util.*;
import java.util.stream.*;

public class NoneMatch {
    /**
    * Which of the following can fill in the blank so that the code prints out false? (Choose all that apply.)
    *   A. allMatch
        B. anyMatch
        C. findAny
        D. findFirst
        E. noneMatch
        F. None of the above

       Options C and D are incorrect because these methods do not take a Predicate parameter and do not return a boolean.
       Option A is incorrect because the stream has no way to know that a nonmatching value won’t show up later.
       Option B is incorrect because it returns true.
       Option E is correct because it is safe to return false as soon as one element passes through the stream that doesn’t match.
     */
    static void emptyInfiniteStream(){
        var s = Stream.generate(() -> "");
        var match = s
                     .noneMatch(String::isEmpty)
                   ; // ___________
        System.out.println(match);
    }
  public static void main(String... args){

  }
}