package list;
import java.util.*;

public class ListCommonOperation {
    /**
     * What is the result of the following statements?
     *  A. 1 false
        B. 1 true
        C. 2 false
        D. 2 true
        E. The code does not compile.
        F. A runtime exception is thrown.

        A Set cannot contain duplicate values.
        The wrapper classes, such as Integer, define equality by the value they are wrapping,
        so the values on line 6 and 8 are considered to be duplicates of the values on lines 5 and 7.
        On lines 9 and 10, Java uses autoboxing to convert the primitive to an Integer object.
         Further, line 9 deletes the 100 from the set, leaving just the value 16.
         Therefore, option B is correct.

     */
  static void addUsingHashSet(){
        var set = new HashSet<Integer>(); // 4:
        set.add(Integer.valueOf(16)); //  5:
        set.add(Integer.valueOf(16)); //  6:
        set.add(Integer.valueOf(100)); // 7:
        set.add(Integer.valueOf(100));  //    8:
        set.removeIf(x -> x == 100); //  9:
        System.out.println(set.size() + " " + set.contains(16)); //   10:
  }
}