package collections.lists.maps.unmodifiable;
import java.util.*;

public class AddToListAndMap {
    /**
       What changes can be done to the following code so that it will compile and run without an exception?
        A. No change is necessary; it will print 2 2.
        B. No change is necessary; it will print 2 1.
        C. Remove //2
        D. Remove //2 and change Map.of() in //3 to new TreeMap<>().
            The List.of, Set.of, and Map.of methods return an unmodifiable List,
            Set, and Map respectively. You cannot add or remove elements from them once they are created.
            Thus, line //2 and //3 will cause java.lang.UnsupportedOperationException to be thrown.
        
        (Correct D)
     */
    public static void main(String... args){
        List<String> keys = List.of("a");  //1
        keys.add("b"); //2

        Map<String, String> map = Map.of(); //3
        
        int i = 0;
        for(var key : keys){
            map.put(key, "----");
        }
        System.out.println(keys+" "+map.size());
    }
}