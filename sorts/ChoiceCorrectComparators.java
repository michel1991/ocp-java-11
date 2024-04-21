package collections.sorts;
import java.util.*;

public class ChoiceCorrectComparators {
    /**
    * What is the result of the following code? (Choose all that apply.)
    *   A. One or more of the comparators can fill in the blank so that the code prints 0.
        B. One or more of the comparators can fill in the blank so that the code prints 1.
        C. One or more of the comparators can fill in the blank so that the code prints 2.
        D. The result is undefined regardless of which comparator is used.
        E. A runtime exception is thrown regardless of which comparator is used.
        F. The code does not compile.

        When using binarySearch(), the List must be sorted in the same order that the Comparator uses.
        Since the binarySearch() method does not specify a Comparator explicitly, the default sort order is used.
        Only c2 uses that sort order and correctly identifies that the value 2 is at index 0.
        Therefore, option A is correct.
        The other two comparators sort in descending order.
        Therefore, the precondition for binarySearch() is not met, and the result is undefined for those two.
     */
    public static void main(String... args){
        Comparator<Integer> c1 = (o1, o2) -> o2 - o1;
        Comparator<Integer> c2 = Comparator.naturalOrder();
        Comparator<Integer> c3 = Comparator.reverseOrder();

        var list = Arrays.asList(5, 4, 7, 2);
        Collections.sort(list, c2); //  ________
        System.out.println(Collections.binarySearch(list, 2));
    }
}