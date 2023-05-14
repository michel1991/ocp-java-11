package list.runtime;
import java.util.*;
import java.util.concurrent.*;

/**
* The code compiles without issue, so option D is incorrect.
* The code throws a ConcurrentModificationException at runtime on line f1, since list1 is a regular collection and not a concurrent one.
* Therefore, option E is the correct answer. Note that if line f1 were removed, the rest of the code would run without throwing an exception, outputting 3 6 0.
 */
public class ConcurrentExceptionWhenAddToListDuringLoop {
   public static void main(String... args){
       var list1 = new ArrayList<>(List.of(1,2,3));
       var list2 = new CopyOnWriteArrayList<Integer>(list1);
       var map3 = new ConcurrentHashMap<Integer,Integer>();
       map3.put(1, 2);
       map3.put(3, 3);

       for(var item : list1) list1.add(10);            // f1
       for(var item : list2) list2.add(item);          // f2
       for(var key : map3.keySet()) map3.remove(key);  // f3
       System.out.println(list1.size() + " " + list2.size() + " " + map3.size());
   }
}