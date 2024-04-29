package collections.unmodifiableXXX.sets;
import java.util.*;

public class DisplayThreeAsSize {
    /**
     * What will the following code print when compiled and run?
       A. It will throw an java.lang.UnsupportedOperationException at //1.
        The addAll method accepts a Collection. Since an ArrayList is a Collection, there is no problem with this statement.
        
       B.  It will throw an java.lang.UnsupportedOperationException at //2.
       C. 0
       D. 3
       -----------------------
       The List.of/Set.of methods return an unmodifiable List/Set.
       So, if you try to clear the List returned by List.of, an UnsupportedOperationException will indeed be thrown.
       However, that is not what the code is doing here. It is creating a new ArrayList object with an unmodifiable list as an argument.
       Thus, the list pointed to by als is not unmodifiable.
       It is a regular ArrayList instance that contains the same three elements as the ones in the unmodifiable list.
    
        Next, a HashSet is created with the ArrayList pointed to by als as argument.
        This creates a HashSet with the same three three elements as the ArrayList.
        However, this HashSet is not dependent on the ArrayList. So, if you clear the ArrayList, the elements still remain in the HashSet.
        
        That is why the output is 3.
     */
    public static void main(String... args){
        ArrayList<String> als = new ArrayList<>(List.of("a", "b", "c"));
        Set<String> ss = new HashSet();
        ss.addAll(als); //1
        als.clear();    //2
        System.out.println(ss.size());
    }
}