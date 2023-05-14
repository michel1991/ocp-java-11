package list.comparison;
import java.util.*;
import static java.util.Map.Entry; // require to import static file

/**
 * What is the output of this code?
    A. 1
    B. 2
    C. 3
    D. 4
    E. The code does not compile.
    F. The code compiles but prints something else.
    
    Lines 10–12 created a map with two key/value pairs.
    Line 14 does not add to the map, since the key 2 is present.
    Line 15 adds a third key/value to the map.
    At this point, the map contains {1=4, 2=8, 3=9}.
    Line 17 replaces the values with one higher than the key, and the map contains {1=2, 2=3, 3=4}.
    The stream on lines 19–23 goes through the map and sorts ascendingly by key.
    It gets the lowest key from that sort, which is 1.
    Then it prints the value that goes with that key, which is 2.
    This makes option B the answer.
 */
public class TreeMapPufIfAbsent {
    public static void main(String[] args) {
        var m = new TreeMap<Integer, Integer>(); //   10:
        m.put(1, 4); // 11:
        m.put(2, 8); //   12: 
        //13:
        m.putIfAbsent(2, 10); //  14:
        m.putIfAbsent(3, 9); //  15: 
       // 16:
        m.replaceAll((k, v) -> k + 1); //  17:
        //18:
        m.entrySet().stream() // 19: 
          .sorted( Comparator.comparing(Entry::getKey)) //  20: 
           .limit(1) //  21:
       .map(Entry::getValue) //     22: 
        .forEach(System.out::println); //   23:  
    }
}