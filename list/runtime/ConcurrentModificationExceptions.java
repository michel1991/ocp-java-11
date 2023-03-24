package list.runtime;

import java.util.*;

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

    public static void main(String... args){
      remove();
  }
    
}