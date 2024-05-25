package collections.maps.navigableMap;
import java.util.*;
/**
 Consider the following code:

    package jqplus;
    import java.util.*;
    
    public class Testclass {
    
        public static void main(String[] args) {
    
            NavigableMap<String, String> mymap = new TreeMap<String, String>();
            mymap.put("a", "apple"); mymap.put("b", "boy"); mymap.put("c", "cat");
            mymap.put("aa", "apple1"); mymap.put("bb", "boy1"); mymap.put("cc", "cat1");
    
            mymap.pollLastEntry(); //LINE 1
            mymap.pollFirstEntry(); //LINE 2
            
            NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); //LINE 3
    
            System.out.println(tailmap.pollFirstEntry()); //LINE 4
            System.out.println(mymap.size()); //LINE 5
            
        }
    }
    What will be returned by the call to tailmap.pollFirstEntry() at //LINE 4 and mymap.size() at //LINE 5?
    A. A ConcurrentModificationException will be thrown at //LINE 1
    B. It will return c - cat and 3
    C. It will return c - cat and 4
    D. It will return bb - boy1 and 4
    E.It will return null and 4
    
    ------------------------
    Map.Entry<K,V> pollFirstEntry()
      Removes and returns a key-value mapping associated with the least key in this map, or null if the map is empty.
    Map.Entry<K,V> pollLastEntry()
        Removes and returns a key-value mapping associated with the greatest key in this map, or null if the map is empty.
    
    Note that the poll methods remove the entry from the map.  Thus, //LINE 2 and //LINE 1 remove a - apple and cc - cat1 entries respectively.
    
    NavigableMap<K,V> tailMap(K fromKey, boolean inclusive)
        Returns a view of the portion of this map whose keys are greater than (or equal to, if inclusive is true) fromKey.
    
    Thus,  //LINE 3 returns a NavigableMap that contains all the elements above bb (not including bb itself because of the second parameter), which means this new map contains only c - cat.
    
    //LINE 4 removes and returns the first entry (which is also the only entry in this case), which is c - cat.
    
    Note that the tailmap is backed by the original map so //LINE 4 affects the original map as well. So mymap.size() returns 3.
     correct(B)

 */

 
    
class Testclass { // public 

    public static void main(String[] args) {

        NavigableMap<String, String> mymap = new TreeMap<String, String>();
        mymap.put("a", "apple"); mymap.put("b", "boy"); mymap.put("c", "cat");
        mymap.put("aa", "apple1"); mymap.put("bb", "boy1"); mymap.put("cc", "cat1");

        mymap.pollLastEntry(); //LINE 1
        mymap.pollFirstEntry(); //LINE 2
        
        NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); //LINE 3

        System.out.println(tailmap.pollFirstEntry()); //LINE 4
        System.out.println(mymap.size()); //LINE 5
        
    }
}
public class PrintCCatAnd3 {
    
}