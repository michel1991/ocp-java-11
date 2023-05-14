package collections.sets;
import java.util.*;

/**
    Which of the following statements are true? (Choose all that apply.)
    A. The code compiles successfully.
    B. The output is 8675null309.
    C. The output is 867586null309.
    D. The output is indeterminate.
    E. There is a compiler error on line 3.
    F. There is a compiler error on line 9.
    G. An exception is thrown.

    The code compiles fine. It allows any implementation of Number to be added.
    Lines 5 and 8 succesfully autobox the primitives into an Integer and Long, respectively.
    HashSet does not guarantee any iteration order, making options A and D correct.
 */
public class HashSetDisplayDataInUnknownOrder {
   public static void display(){
       var numbers = new HashSet<Number>(); // 3
       numbers.add(Integer.valueOf(86));  // 4
       numbers.add(75);   // 5
       numbers.add(Integer.valueOf(86));  // 6
       numbers.add(null);  // 7
       numbers.add(309L);   // 8
       Iterator iter = numbers.iterator(); // 9
       while (iter.hasNext())  // 10
           System.out.println(iter.next()); // 11
   }

    public static void main(String... args){
       display();
    }
}