package list.runtime;

import java.util.*;
import java.util.concurrent.*;

public class ConcurrentModificationExceptions {
    /**
     What does the following output?
        A. [a, lamb, had, Mary, little]
        B. [a]
        C. [a, a]
        D. The code does not compile.
        E. The code throws an exception at runtime.

        Lines 18 and 19 create a list with five elements.
        Line 20 makes a set with the same five elements.
        Line 21 does not change the contents of the set since sets must have unique elements.
        The loop on line 22 tries to delete elements
        but instead throws a ConcurrentModificationException, making option E the answer.

     */
  static void remove(){
      List<String> list = List.of( // 18:
              "Mary", "had", "a", "little", "lamb"); //  19:
      Set<String> set = new HashSet<>(list); //   20:
      set.addAll(list); //  21:
      for(String sheep : set) //   22:
          if (sheep.length() > 1) //   23:
              set.remove(sheep); //    24:
          System.out.println(set); //  25:
  }

    /**
        Given the original array, how many of the following
        for statements result in an exception at runtime, assuming each is executed independently?

        A. Zero.
        B. One.
        C. Two.
        D. Three.
        E. Four.
        F. The code does not compile.

        CopyOnWriteArrayList makes a copy of the array every time it is modified,
        preserving the original list of values the iterator is using,
        even as the array is modified. For this reason,
        the for loop using copy1 does not throw an exception at runtime.
        On the other hand, the for loops using copy2 and copy3 both throw ConcurrentModificationException
        at runtime since neither allows modification while they are being iterated upon.
         Finally, the ConcurrentLinkedQueue used in copy4 completes without
         throwing an exception at runtime.
          For the exam, remember that the Concurrent classes order read/write access
         such that access to the class is consistent across all threads and processes,
         while the synchronized classes do not.
         Because exactly two of the for statements produce exceptions at runtime,
         option C is the correct answer.

     */
    static void anotherExample(){
        var original = List.of(1,2,3,4,5);

        var copy1 = new CopyOnWriteArrayList<Integer>(original);
        for(Integer w : copy1)
            copy1.remove(w);

        var copy2 = Collections.synchronizedList(original);
        for(Integer w : copy2)
            copy2.remove(w);

        var copy3 = new ArrayList<Integer>(original);
        for(Integer w : copy3)
            copy3.remove(w);

        var copy4 = new ConcurrentLinkedQueue<Integer>(original);
        for(Integer w : copy4)
            copy4.remove(w);
    }

    public static void main(String... args){
      remove();
  }
    
}