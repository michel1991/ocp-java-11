package generics.tricky;
import java.util.*;

/**
 *  Identify the right declaration for 'box' for the following code.
    A. List<String> box = new ArrayList<String>();
    B. Map<List<String>> box = new TreeMap<List<String>>();
    C. Map<String, List<String>> box = new HashMap<String, List<String>>();
    D. LinkedList<String> box =  new LinkedList<String>();
    E. HashMap<?, List<String>> box = new HashMap<String, List<String>>();
    F. HashMap<?, List<String>> box = new HashMap<?, List<String>>();
    
       You must provide a type name while instantiating a typed class and so, you cannot have a '?'
       on the right hand side in place where actual type is required. i.e. if you want a HashMap that
       can take any object as key, you must do new HashMap<Object, List<String>>().
        However, HashMap<?, List<?>> box = new HashMap<Integer, List<?>>();  is valid even though there is a ? on the RHS.
        This is because, you are only instantiating the HashMap here (not the List).
       
Only Map has values() method. This method returns a Collection of values stored in the Map.
( map.keySet() returns a Set of keys.). So 1 and 4 are invalid.
Unlike a Collection, a Map is typed for 2 types instead of 1. So option 2 is invalid as well.
Since the for loop is assuming that each element of the values Set is a List<String>,
the Map can have the keys of any type but the values must be of type List<String>.
Therefore, option 3 and 5 are valid.

(C, E)
 */
public class Dumper {
    // declaration for box
    Map<String, List<String>> box = new HashMap<String, List<String>>(); // response  C
    HashMap<?, List<String>> box2 = new HashMap<String, List<String>>(); // response E
    HashMap<?, List<?>> box3 = new HashMap<Integer, List<?>>();  //is valid even though there is a ? on the RHS.
    
    public void dumpStuff(){
        for(List<String> l : box.values()){
            System.out.println(l);
        }
    }
}