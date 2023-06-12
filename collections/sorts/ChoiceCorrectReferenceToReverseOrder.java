package collections.sorts;
import java.util.*;

public class ChoiceCorrectReferenceToReverseOrder {
    
    /**
    *  Which can fill in the blank so the code prints 2?
    *   A. copy
        B. list
        C. newList
        D. The code does not compile with any of these options.
        E. A runtime exception is thrown with any of these options.
        F. None of the above. The code prints an index other than 2 with one or more of these options.

        The List is sorted and searched using a custom comparator,
        which does reverse-case insensitive order, which sorts to [bd, ba, ab, aa].
        The index of ab is 2 since indexes start with 0.
        However, list and copy are immutable,
        which means they throw an UnsupportedOperationException when you try to sort them.
        Option C is a mutable list and therefore the correct answer.
     */
    public static void main(String... args){
        var list = List.of("ab", "ba", "bd", "aa");
        var copy = List.copyOf(list);
        var newList = new ArrayList<String>(copy);

        var candidate =  newList ; // _____________

        Comparator<String> comparator = Comparator.reverseOrder();
        Collections.sort(candidate, comparator);
        int index = Collections
                .binarySearch(
                        candidate,
                        "ab",
                        comparator
        );
        System.out.println("Begin choice Correct Reference To Reverse order");
        System.out.println("\t" + index);
        System.out.println("End  choice Correct Reference To Reverse order");
    }
    
}