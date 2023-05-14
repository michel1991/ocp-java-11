package list.maps.errors;
import java.util.*;


public class MergeMethodMapNotCorrect {
    /**
    *  What is the result of the following?
        A. {1=10, 2=20}
        B. {1=10, 2=20, 3=null}
        C. {1=10, 2=20, 3=3}
        D. {1=13, 2=20}
        E. {1=13, 2=20, 3=null}
        F. {1=13, 2=20, 3=3}
        G. The code does not compile.
        H. An exception is thrown

        The merge() function requires a BiFunction as the mapping function.
        This code uses a Function instead, which does not compile
     */
   public static void mergeInvalid(){
       var map = new HashMap<Integer, Integer>();
       map.put(1, 10);
       map.put(2, 20);
       map.put(3, null);

       map.merge(1, 3, v -> v);
       map.merge(3, 3, v -> v);

       System.out.println(map);
   }
}