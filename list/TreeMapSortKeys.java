package list;
import java.util.*;

public class TreeMapSortKeys {
    /**
    * What is the result of the following code?
    *   A. 268
        B. 468
        C. 2468
        D. 826
        E. 846
        F. 8246
        G. None of the above

       When the same key is put into a Map, it overrides the original value.
       This means that line 23 could be omitted and the code would be the same, and there are only three key/value pairs in the map.
       TreeMap sorts its keys making the order M followed by k followed by m.
       Remember that natural sort ordering has uppercase before lowercase.
       The replaceAll() method runs against each element in the map, doubling the value. Finally, we iterate through each key, printing 846 and making option E correct.

     */
   static void sortTheKeys(){
       var treeMap = new TreeMap<Character, Integer>(); // 22:
       treeMap.put('k', 1); //  23:
       treeMap.put('k', 2); //  24:
       treeMap.put('m', 3); // 25:
       treeMap.put('M', 4); // 26:
       treeMap.replaceAll((k, v) -> v + v); //  27:
       treeMap.keySet() //  28:
       .forEach(k -> System.out.print(treeMap.get(k))); //  29:
   }

    public static void main(String... args){
       sortTheKeys();
   }
}