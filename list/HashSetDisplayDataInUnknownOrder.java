package list;
import java.util.*;

/**
* The code compiles fine. It allows any implementation of Number to be added.
* Lines 5 and 8 succesfully autobox the primitives into an Integer and Long, respectively.
* HashSet does not guarantee any iteration order, making options A and D correct.
 */
public class HashSetDisplayDataInUnknownOrder {
   public static void display(){
       var numbers = new HashSet<Number>();
       numbers.add(Integer.valueOf(86));
       numbers.add(75);
       numbers.add(Integer.valueOf(86));
       numbers.add(null);
       numbers.add(309L);
       Iterator iter = numbers.iterator();
       while (iter.hasNext())
           System.out.println(iter.next());
   }

    public static void main(String... args){
       display();
    }
}