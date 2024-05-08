package collections.sets.hashSet;
import java.util.*;

/**
   What will the following code NEVER print when run?
    A. GRANDE TALL JUMBO
    B. TALL JUMBO GRANDE
    C. TALL GRANDE JUMBO
    D. TALL JUMBO GRANDE TALL TALL JUMBO
    E. TALL JUMBO GRANDE TALL JUMBO
    
    ----------------------------------
    There are two concepts involved in this question:
    1. A Set (such as a HashSet) does not allow duplicate elements. If you add a duplicate element, it is ignored.
    Thus, only three unique SIZE elements are stored.
    
        It is important to understand how the add() method of a Set works :
        boolean add(E o)
            Adds the specified element to this set if it is not already present (optional operation).
            More formally, adds the specified element, o, to this set if this set contains no element e such that (o==null ? e==null : o.equals(e)).
            If this set already contains the specified element, the call leaves this set unchanged and returns false.
            In combination with the restriction on constructors, this ensures that sets never contain duplicate elements.
    
    2. The order of elements is not defined in HashSet. So while retrieving elements, it can return them in any order.
    
    Remember that TreeSet does store elements in their natural sorted order.
    
    Also remember that the order of Enums is the order in which they are defined.
    It is not necessarily the same as the alphabetical order of their names.
    Correct(D, E)
    

 */
enum SIZE
{
    TALL, JUMBO, GRANDE;
}


public class CoffeeMug {
    public static void main(String[] args) {
        
        var hs = new HashSet<SIZE>();
        hs.add(SIZE.TALL); hs.add(SIZE.JUMBO); hs.add(SIZE.GRANDE);
        hs.add(SIZE.TALL); hs.add(SIZE.TALL); hs.add(SIZE.JUMBO);
        
        for(SIZE s : hs) System.out.print(s+" ");
    }
}