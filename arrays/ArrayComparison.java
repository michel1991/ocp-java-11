package arrays;
import java.util.*;

public class ArrayComparison {

    /**
       What is printed by the following code? (Choose all that apply.)
        A. [8]
        B. [9]
        C. [Ljava.lang.String;@160bc7c0
        D. C-1
        E. C0
        F. M-1
        G. M0
        H. The code does not compile.

        The array is allowed to use an anonymous initializer because it is in the same line as the declaration.
        The ArrayList uses the diamond operator.
        This specifies the type matches the one on the left without having to retype it.
        After adding the two elements, list contains [6, 8].
        We then replace the element at index 1 with 9, resulting in [6, 9].
        Finally, we remove the element at index 0, leaving [9] and making option B correct.
        Option C is incorrect because arrays output something that looks
        like a reference that rather than a nicely printed list of values.
        Option E is correct because the compare() method returns 0
        when the arrays are the same length and have the same elements.
        Option F is correct because the mismatch() method returns a -1
        when the arrays are equivalent. For more information, see Chapter 5.
     */
   static void withMismatch(){
       int[] array = {6,9,8};
       List<Integer> list = new ArrayList<>();
       list.add(array[0]);
       list.add(array[2]);
       list.set(1, array[1]);
       list.remove(0);
       System.out.println(list);
       System.out.println("C" + Arrays.compare(array,new int[] {6, 9, 8}));
       System.out.println("M" + Arrays.mismatch(array,new int[] {6, 9, 8}));
   }

    public static void main(String... args){
       withMismatch();
    }
}