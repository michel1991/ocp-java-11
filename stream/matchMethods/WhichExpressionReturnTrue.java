package stream.matchMethods;
import java.util.*;
import java.util.function.*;

/**
 * Given:
    List<Integer> ls = Arrays.asList(11, 11, 22, 33, 33, 55, 66);
    
    Which of the following expressions will return true?
    
    A.
      ls.stream().anyMatch(44);
      This will not compile because anyMatch requires a Predicate object as an argument, not an int.
      
    B.
        ls.stream().anyMatch(11);
        This will not compile because anyMatch requires a Predicate object as an argument, not an int.
        
   C. 
    ls.stream().distinct().anyMatch(x->x==11);
    anyMatch(Predicate<? super T> predicate) returns whether any elements of this stream match the provided predicate.
    May not evaluate the predicate on all elements if not necessary for determining the result.
    If the stream is empty then false is returned and the predicate is not evaluated.
    This is a short-circuiting terminal operation.
    
   D. 
    ls.stream().distinct().allMatch(11);
    This will not compile because allMatch requires a Predicate object as an argument, not an int.
    You could do ls.stream().distinct().allMatch(x->x==11); but it will return false because for allMatch to return true,
    the given predicate must return true for each element of the stream.
    
    E. ls.stream().noneMatch(x->x%11>0);
    noneMatch returns true only if none of the elements in the stream satisfy the given Predicate.
    Here, all the elements are divisible by 11 and x%11 will be 0 for each element. Therefore, the given Predicate
    will return false for every element, causing noneMatch to return true
    
    Correct(C, E)
 */
public class WhichExpressionReturnTrue {
    public static void main(String... args){
        List<Integer> ls = Arrays.asList(11, 11, 22, 33, 33, 55, 66);
        ls.stream().distinct().anyMatch(x->x==11);
    }
}