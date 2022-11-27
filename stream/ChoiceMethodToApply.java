package stream;
import java.util.stream.*;
import java.util.*;
public class ChoiceMethodToApply {

    /**
    *   Which are true statements (Choose all that apply.)
    *
        A. The average() method can be called on all three of these variables.
        B. The count() method can be called on all three of these variables.
        C. The sum() method can be called on all three of these variables.
        D. The average() method can be called on exactly one of these variables.
        E. The count() method can be called on exactly two of these variables.
        F. The sum() method can be called on exactly two of these variables.

       The first thing to note is the types. We have Stream<String> for s, Stream<Integer> for t, and IntStream for u.
       The count() method is available on all streams, making option B correct.
       The average() and sum() methods are available only on primitive streams.
       We have only one of these, making option D the other answer.
       Note that Stream<Integer> is not a primitive stream and cannot do math operations.
     */
    public static void choiceValid(){
        var s = Stream.of("monkey");
        var t = Stream.of(1).mapToInt(x -> x).boxed();
        var u = Stream.of(1).mapToInt(x -> x);
    }

    public static void main(String... args){
        
    }

}