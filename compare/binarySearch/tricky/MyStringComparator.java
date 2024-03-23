
package compare.binarySearch.tricky;
import java.util.*;

/**
 * Given :

    import java.util.*;
    class MyStringComparator implements Comparator
    {
        public int compare(Object o1, Object o2)
        {
          int s1 = ((String) o1).length();
          int s2 = ((String) o2).length();
          return s1 - s2;
        }
    }
    and
    
    static String[] sa = { "d", "bbb", "aaaa" };

    Select correct statements.
    
    A. This is not a valid Comparator implementation.
    
    B. Arrays.binarySearch(sa, "cc", new MyStringComparator()); will return -2.
       Since there is no string of length 2 in sa, nothing in sa matches the string "cc".
       So the return value has to be negative.
       Further, if the value "cc" were to be inserted in sa, it would have to be inserted after "d" i.e. at index 1.
        Thus, the return value will be -(index+1) = -2.
        
    C. Arrays.binarySearch(sa, "c", new MyStringComparator()); will return 0.
        There is only one string of length 1 in sa, and it is at index 0.

    D. Arrays.binarySearch(sa, "c", new MyStringComparator()); will return -1.
    
    E. Arrays.binarySearch(sa, "c", new MyStringComparator()); will throw an exception.
    
   This Comparator returns the difference in length of two strings. Thus, two strings of same length are considered equal by this comparator.
   Arrays.binarySearch() method returns the index of the search key, if it is contained in the list; otherwise, (-(insertion point) - 1).
   The insertion point is defined as the point at which the key would be inserted into the list: the index
   of the first element greater than the key, or list.size(), if all elements in the list are less than the specified key.
    Note that this guarantees that the return value will be >= 0 if and only if the key is found.
    
    Correct(B, C)
    


 */

class MyStringComparator implements Comparator
{
    static String[] sa = { "d", "bbb", "aaaa" };
        public int compare(Object o1, Object o2)
        {
            int s1 = ((String) o1).length();
            int s2 = ((String) o2).length();
            return s1 - s2;
        }
    
    public static void main(String... args){
           
            Arrays.binarySearch(sa, "cc", new MyStringComparator()); // will return -2.
            Arrays.binarySearch(sa, "c", new MyStringComparator());//  will return 0.
    }
}