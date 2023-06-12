package collections.comparison;
import java.util.*;

/**
* Which are true statements about the following code? (Choose all that apply.)
*   A. If x.compareTo(y) returns 0, the numbers passed to the constructors are guaranteed to have been the same.
    B. If x.compareTo(y) returns 1, the numbers passed to the constructors are guaranteed to have been the same.
    C. If x.compareTo(y) returns -1, the number passed to x’s constructor is guaranteed to have been larger than the number passed to y’s constructor.
    D. If x.compareTo(y) returns -1, the number passed to x’s constructor is guaranteed to have been smaller than the number passed to y’s constructor.
    E. If x and y are added to list, Collections.sort(list) will properly sort them.

  This method sorts in reverse order in the compareTo() method.
  It returns 0 when the objects are equal, making option A correct.
  It returns a negative number when the object
  is larger than the argument since we are sorting descending, making option C correct.
  However, this object does not implement the Comparable interface.
  Collections.sort() will not compile if called on this list.
 */
public class NumbersCompare {
    private int num; //  4:
    public NumbersCompare(int n) { // 5:
        num = n; // 6:
    }  //   7:
    public int compareTo(NumbersCompare n) { //  8:
        return Integer.compare(n.num, num); //  9:
    } // 10:
    public static void main(String[] args) { //  11:
        var x = new NumbersCompare(5); //  12:  ________
        var y = new NumbersCompare(8); // 13: ________
        List<NumbersCompare> list = new ArrayList<NumbersCompare>(); // 14:
    } //  15:
}