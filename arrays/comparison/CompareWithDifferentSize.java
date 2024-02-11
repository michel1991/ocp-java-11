package arrays.comparison;
import java.util.*;
public class CompareWithDifferentSize {
    /**
     * What is true about the output of the following code?

        A. It is negative because ints has fewer elements.
        B. It is 0 because the arrays can’t be compared.
        C. It is positive because the first element is larger.
        D. It is undefined.
        E. The code does not compile.

     The Arrays.compare() method looks at each element in turn.
     Since the first elements are different, we get the result of comparing them.
     In this case, we get a positive number because 3 is larger than 2, and option C is correct.
     */
    static void compareWithDifferentSize(){
        var ints = new int[] {3,1,4};
        var others = new int[] {2,7,1,8};
        System.out.println(Arrays.compare(ints, others));
    }

    public static void main(String... args){
        compareWithDifferentSize();
    }
}