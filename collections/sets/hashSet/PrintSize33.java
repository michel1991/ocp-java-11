package collections.sets.hashSet;
import java.util.*;

public class PrintSize33 {
    
    /**
       What will the following code print when compiled and run?
       
       A. It will throw an java.lang.UnsupportedOperationException.
         ---
        1. The constructors of ArrayList and HashSet accept a Collection.
        Since both an ArrayList and a Set are Collections, there is no problem in creating an ArrayList with a Set as argument and vice versa.
        2. The Set returned by Set.of is unmodifiable but the ArrayList created using "new" is not.
         So, it is ok to invoke clear() on the keys and, for the same reason, on values.
         
       B. 0 0
       C. 3 3
        Once the elements have been added to map, it doesn't matter what you do with the data structures
        you used to fill the map because this map is not dependent  on (in other words, not backed by) those structures.
       D. It will not compile.

       Correct(C)

       
     */
    public static void main(String... args){
        HashSet<String> keys = new HashSet<>(List.of("a", "b", "c"));
        ArrayList<String> values = new ArrayList<>(Set.of("1", "2", "3"));
        
        Map<String, String> m = new HashMap<>();
        int i = 0;
        for(var key : keys){
            m.put(key, values.get(i++));
        }
        keys.clear();   //2
        values.clear();
        System.out.println(m.keySet().size()+" "+m.values().size());
    }
}