package collections.sets.runtime;
import java.util.*;

/**
* What is the result of the following code?

    A. A compiler or runtime issue occurs on lines 18–20.
    B. A compiler or runtime issue occurs on lines 22–23.
    C. A compiler or runtime issue occurs on lines 25–26.
    D. A compiler or runtime issue occurs on lines 28–29.
    E. The code runs successfully, and tree has a single element.
    F. The code runs successfully, and tree has two elements.

    First, all of these lines compile. ArrayList, HashSet,
    and LinkedList are all allowed to contain null.
    However, a TreeSet is not, and line 28 throws a NullPointerException at runtime.
    Therefore, option D is correct.
    (Me: All class that use sort automatically[TreeMap, TreeSet] does not contains null value)
    *
 */
public class TreeSetNotAllowNullValue {
   public static void main(String... args){
       var list = new ArrayList<String>(); // 18:
       list.add(null); //  19:
       list.add(null); // 20:
       //   21:
       var set = new HashSet<>(list); // 22:
       set.add(null); //   23:
       //24:
       var queue = new LinkedList<>(set); //  25:
       queue.add(null); // 26:
      // 27:
       var tree = new TreeSet<>(queue); //  28:
       tree.add(null); //  29:
   }
}