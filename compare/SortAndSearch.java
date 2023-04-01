package compare;
import java.util.*;

/**
 *  What is true of the following code? (Choose two.)
    A. If the blank contains int, then the code outputs 0.
    B. If the blank contains int, then the code outputs 1.
    C. If the blank contains int, then the does not compile.
    D. If the blank contains String, then the code outputs flower.
    E. If the blank contains String, then the code outputs seed.
    F. If the blank contains String, then the code does not compile.
    
    In Java, Arrays.binarySearch() returns a positive int, representing
    the index of a match if one is found. An int cannot be stored in a String variable,
    making option F one of the answers. When using the correct data type and searching for seed,
    we find it at index 1. Therefore, option B is the other correct answer.

 */
public class SortAndSearch {
    private static void sortAndSearch(String... args) {
        var one = args[0];
        Arrays.sort(args);
        int result = Arrays.binarySearch(args, one); // _________
        System.out.println(result);
    }
    public static void main(String[] args) {
        sortAndSearch("seed", "flower");
    }
}