package sorts.tricky;
import java.util.*;

/**
 *  What will the following code print when compiled and run?
 
    A. 100 100 100.0
    B. 100.0 100 100
    C. 100 100.0 100
    D. It will not compile.
    E. It will throw an exception at run time.
    
   --------------
   If the second parameter to Collections.sort(List<T> list,  Comparator<? super T> c) is null, the elements'
   natural ordering is used for comparing them. (There is no NullPointerException.)
   Natural ordering means that the sort method will make use of java.lang.Comparable interface
   and will call compareTo method on the objects stored in the collection.

    In the given code, since the second parameter is null,
    every object in the collection must be of a class that implements Comparable interface (which is true in this case),
    and further, all objects in the collection should be comparable with each other i.e.
    the implementation of the compareTo method of each class should be able to compare objects
    of that class with objects of other classes present in the collection.
    In this case, the implementation of compareTo methods of String, Integer,
    and Double classes are not compatible with each other and they throw ClassCastException
    when an object of one class is compared with an object of another class.
    
    You should see the following stack trace when you run the given code:
    Exception in thread "main" java.lang.ClassCastException:
        java.lang.Integer cannot be cast to java.lang.Double
    at java.lang.Double.compareTo(Double.java:49)
    at java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort.java:290)
    at java.util.ComparableTimSort.sort(ComparableTimSort.java:157)
    at java.util.Arrays.sort(Arrays.java:537)
    at java.util.TimSort.sort(TimSort.java:178)
    at java.util.TimSort.sort(TimSort.java:173)
    at java.util.Arrays.sort(Arrays.java:659)
    at java.util.Collections.sort(Collections.java:217)
    at SortTest.main(SortTest.java:17)
    Java Result: 1
   
    Correct(E)
    
 */

public class SortTest {
    public static void main(String[] args) {
        Object[] sa = { 100, 100.0, "100" };
        Collections.sort(Arrays.asList(sa), null);
        System.out.println(sa[0]+" "+sa[1]+" "+sa[2] );
    }
}