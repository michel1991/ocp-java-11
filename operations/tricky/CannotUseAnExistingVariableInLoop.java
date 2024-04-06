package operations.tricky;
import java.util.*;

public class CannotUseAnExistingVariableInLoop {
    /**
     Identify the valid for loop constructs assuming the following declarations:
        Object o = null;
        Collection c = //valid collection object.
        int[][] ia = //valid array
        
        A. for(o : c){ }
            Cannot use an existing/predefined variable in the variable declaration part.
            
        B.
          for(final var o2 : c){ }
            final is the only modifier (excluding annotations) that is allowed here.
           
        C. for(int i : ia) { }
            Each element of ia is itself an array. Thus, they cannot be assigned to an int.
           
        D. for(Iterator it : c.iterator()){ }
            Collection has a method named iterator() but it returns an Iterator and not a Collection.
            Note that the following would have been valid:
            Collection<Iterator> c = //some collection that contains Iterator objects
            for(Iterator it : c){ }
           
        E. for(int i : ia[0]){ }
        Since ia[0] is an array of ints, this is valid. (
        It may throw a NullPointerException or ArrayIndexOutOfBoundsException at runtime if ia is not appropriately initialized.)
        
        Correct(B, E)

     */
    public static void main(String[] args){
        Object o = null;
        Collection c = new ArrayList(); //valid collection object.
        int[][] ia = new int[3][]; //valid array
        
        for(final var o2 : c){ }
        for(int i : ia[0]){ }
    }
}