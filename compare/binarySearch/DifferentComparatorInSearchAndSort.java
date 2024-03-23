package compare.binarySearch;
import java.util.*;

public class DifferentComparatorInSearchAndSort {

   /**
      What is the result of the following?
         A. -1
        B. 0
        C. 1
        D. The code does not compile.
        E. The result is not defined.

        A custom sort order is specified using a Comparator to sort in descending order.
        However, this Comparator is not passed when searching.
        When a different sort order is used for searching and sorting,
        the result is undefined. Therefore, option E is correct.

    */
  static void compare(){
      Comparator<Integer> c = (x, y) -> y - x;
      var ints = Arrays.asList(3, 1, 4);
      Collections.sort(ints, c);
      System.out.println(Collections.binarySearch(ints, 1));
  }

    public static void main(String... args){
       compare();
    }
}