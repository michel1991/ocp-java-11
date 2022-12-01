package list;
import java.util.*;

/**
* Which statements are true about the following code? (Choose all that apply.)
*   A. Adding an element to doubleList is allowed.
    B. Adding an element to intList is allowed.
    C. Changing the first element in doubleList changes the first element in doubles.
    D. Changing the first element in intList changes the first element in ints.
    E. doubleList is immutable.
    F. intList is immutable.

   The first line of code in the method creates a fixed size List backed by an array.
   This means option D is correct, making options B and F incorrect.
   The second line of code in the method creates an immutable list, which means no changes are allowed.
   Therefore, option E is correct, making options A and C incorrect.

 */
public class ListImmutableAndMutable {
    public static  void run(Integer[] ints, Double[] doubles) {
        List<Integer> intList = Arrays.asList(ints);
        List<Double> doubleList = List.of(doubles);
        // more code
    }

    public static void main(String... args){

    }
}