package compare;
import java.util.*;

/**
 * What is the output of the following when run as java EchoFirst.java seed flower plant?
    A. 0
    B. 1
    C. 2
    D. The code does not compile.
    E. The code compiles but throws an exception at runtime.
    F. The output is not guaranteed.

    The array is not sorted.
    It does not meet the pre-condition for a binary search.
    Therefore, the output is not guaranteed and the answer is option F.

 */
class EchoFirst {
    public static void main(String[] args) {
        var result = Arrays.binarySearch(args, args[0]);
        System.out.println(result);
    }
}

public class EchoFirstBinarySearch {
    public static void main(String[] args) {
        EchoFirst.main(args);
    }
}