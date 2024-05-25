package sorts;
import java.util.*;
/**
 Consider the following code:
     import java.util.*;
    public class TestClass
    {    
        static String[] sa = { "charlie", "bob", "andy", "dave" };
        public static void main(String[] args)
        {
            // 1 insert code here.
        }
    }
    
    Which of the given options (independent of each other or together) must be inserted at //1 so that it will print 2?
    A. System.out.println(Arrays.search(sa, "andy"));
        No such method.
    B. System.out.println(Arrays.linearSearch(sa, "andy"));
        No such method.
    C. Arrays.sort(sa);
    D. System.out.println(Arrays.binarySearch(sa, "charlie"));
    E. Only option 2 is enough.
    
    --------------------
    Both- java.util.Collections and java.util.Arrays - have sort and binarySearch methods that work exactly in the same way.
    Methods in Collections class work on Collection objects and methods in Arrays work on array objects.

    Remember that binarySearch method works ONLY if the collection or array being searched is already sorted.
    Further, the sort must have been done using the same Comparator that is being used to search otherwise search results will not be reliable.
    If no Comparator is used explicitly (either in sort or binarySearch method calls), elements are sorted by
    their natural order as determined by their Comparable interface implementation.
    
    In this question, before we use binarySearch(), we must sort the array using Arrays.sort(sa) method. Therefore, option 3 and 4 are correct.
     correct(C, D)

 */


class TestClass // public 
{    
    static String[] sa = { "charlie", "bob", "andy", "dave" };
    public static void main(String[] args)
    {
        // 1 insert code here.
        Arrays.sort(sa);
        System.out.println(Arrays.binarySearch(sa, "charlie"));

    }
}
public class Print2 {
    public static void main(String[] args)
    {
        TestClass.main(args);
        
    }
}