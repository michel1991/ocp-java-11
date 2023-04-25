package stream.reduce;
import java.util.stream.*;
import java.util.*;

public class ChoiceCorrectToMakeConcurrentReductionWithCollectMethod {
    /**
       Given the following code snippet, what changes should be made for the JVM to correctly
        process this as a concurrent reduction? (Choose two.)
        
        A. Replace HashSet with LinkedHashSet.
        B. Mark the stream parallel.
        C. Remove the second argument of the collect() method.
        D. Remove the third argument of the collect() method.
        E. Replace HashSet with ConcurrentSkipListSet.
        F. Mark the stream unordered.
        
        For a concurrent reduction, the underlying type should be a thread-safe collection.
        For this reason, option A is incorrect and option E is correct.
        The streams must all be parallel, making option B correct and option F incorrect.
        Options C and D are incorrect, as there is no two-argument version
        of collect() within the Stream interface.

     */
  static void reduceLetters(){
      var w = Stream.of("c","a","t")
   .collect(HashSet::new, Set::add, Set::addAll);
      System.out.println(w);
      
  }
    
    public static void main(String... args){
        reduceLetters();
    }
}